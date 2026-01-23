package com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal;

import android.content.Context;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2002Dp;
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
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAnimationConstants;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LimitRevealComposable.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a\u001d\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\u001a5\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0013\u001a\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0003H\u0000\u001a'\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u001a\u001f\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001f\u001a3\u0010 \u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010#\u001a\u001f\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010'\"\u000e\u0010(\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010-\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010.\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006/²\u0006\n\u00100\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u00101\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u00104\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u00105\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u00106\u001a\u000207X\u008a\u008e\u0002²\u0006\n\u00108\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u00109\u001a\u00020:X\u008a\u0084\u0002²\u0006\n\u0010;\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u00108\u001a\u000202X\u008a\u0084\u0002"}, m3636d2 = {"LimitReveal", "", "limit", "", "higherLimitMicro", "depositBy", "", "onContinue", "Lkotlin/Function0;", "upsell", "", "duxo", "Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealDuxo;", "(JLjava/lang/Long;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealDuxo;Landroidx/compose/runtime/Composer;II)V", "CreditLimitStandard", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/foundation/layout/PaddingValues;JLandroidx/compose/runtime/Composer;I)V", "CreditLimitUpsell", "(Landroidx/compose/foundation/layout/PaddingValues;JJLjava/lang/String;Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealDuxo;Landroidx/compose/runtime/Composer;I)V", "toDollars", "AnimatedGradientText", "text", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AnimatedLine", "line", "initialDelay", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V", "BottomBar", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "(ZLkotlin/jvm/functions/Function0;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealDuxo;Landroidx/compose/runtime/Composer;I)V", "Disclaimer", "context", "Landroid/content/Context;", "(Landroid/content/Context;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LIMIT_REVEAL_UPSELL_TEST_TAG", "LIMIT_REVEAL_UPSELL_LIMIT_TEST_TAG", "LIMIT_REVEAL_UPSELL_DISCLAIMER_TITLE_TEST_TAG", "LIMIT_REVEAL_UPSELL_DISCLAIMER_TERMS_TEST_TAG", "LIMIT_REVEAL_STANDARD_TEST_TAG", "LIMIT_REVEAL_STANDARD_LIMIT_TEST_TAG", "LIMIT_REVEAL_DISCLAIMER_TITLE_TEST_TAG", "feature-credit-card_externalDebug", "enabled", "gradientOffset", "", "maskOpacity", "maskXTranslation", "maskYTranslation", "currentWordIndex", "", "alpha", "offsetY", "Landroidx/compose/ui/unit/Dp;", "visible"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class LimitRevealComposable2 {
    public static final String LIMIT_REVEAL_DISCLAIMER_TITLE_TEST_TAG = "limit-revel-disclaimer-title-test-tag";
    public static final String LIMIT_REVEAL_STANDARD_LIMIT_TEST_TAG = "limit-revel-standard-limit-test-tag";
    public static final String LIMIT_REVEAL_STANDARD_TEST_TAG = "limit-revel-standard-test-tag";
    public static final String LIMIT_REVEAL_UPSELL_DISCLAIMER_TERMS_TEST_TAG = "limit-revel-upsell-disclaimer-terms-test-tag";
    public static final String LIMIT_REVEAL_UPSELL_DISCLAIMER_TITLE_TEST_TAG = "limit-revel-upsell-disclaimer-title-test-tag";
    public static final String LIMIT_REVEAL_UPSELL_LIMIT_TEST_TAG = "limit-revel-upsell-limit-test-tag";
    public static final String LIMIT_REVEAL_UPSELL_TEST_TAG = "limit-revel-upsell-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedGradientText$lambda$26(String str, TextStyle textStyle, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AnimatedGradientText(str, textStyle, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedLine$lambda$38(String str, long j, int i, int i2, Composer composer, int i3) {
        AnimatedLine(str, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$48(boolean z, Function0 function0, EventLogger eventLogger, LimitRevealDuxo limitRevealDuxo, int i, Composer composer, int i2) {
        BottomBar(z, function0, eventLogger, limitRevealDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreditLimitStandard$lambda$3(PaddingValues paddingValues, long j, int i, Composer composer, int i2) {
        CreditLimitStandard(paddingValues, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreditLimitUpsell$lambda$6(PaddingValues paddingValues, long j, long j2, String str, LimitRevealDuxo limitRevealDuxo, int i, Composer composer, int i2) {
        CreditLimitUpsell(paddingValues, j, j2, str, limitRevealDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Disclaimer$lambda$52(Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Disclaimer(context, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LimitReveal$lambda$0(long j, Long l, String str, Function0 function0, boolean z, LimitRevealDuxo limitRevealDuxo, int i, int i2, Composer composer, int i3) {
        LimitReveal(j, l, str, function0, z, limitRevealDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LimitReveal(final long j, final Long l, final String str, final Function0<Unit> onContinue, boolean z, LimitRevealDuxo limitRevealDuxo, Composer composer, final int i, final int i2) {
        long j2;
        int i3;
        Long l2;
        String str2;
        int i4;
        boolean z2;
        final LimitRevealDuxo limitRevealDuxo2;
        final boolean z3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer2;
        final boolean z4;
        final LimitRevealDuxo limitRevealDuxo3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1175512226);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            j2 = j;
        } else if ((i & 6) == 0) {
            j2 = j;
            i3 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i;
        } else {
            j2 = j;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                l2 = l;
                i3 |= composerStartRestartGroup.changed(l2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onContinue) ? 2048 : 1024;
                }
                i4 = i2 & 16;
                if (i4 == 0) {
                    if ((i & 24576) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            limitRevealDuxo2 = limitRevealDuxo;
                            int i5 = composerStartRestartGroup.changedInstance(limitRevealDuxo2) ? 131072 : 65536;
                            i3 |= i5;
                        } else {
                            limitRevealDuxo2 = limitRevealDuxo;
                        }
                        i3 |= i5;
                    } else {
                        limitRevealDuxo2 = limitRevealDuxo;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            z3 = i4 == 0 ? false : z2;
                            if ((i2 & 32) != 0) {
                                composerStartRestartGroup.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                if (current == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(1729797275);
                                if (current instanceof HasDefaultViewModelProviderFactory) {
                                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                                }
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(LimitRevealDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$LimitReveal$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$LimitReveal$$inlined$duxo$1.1
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
                                i3 &= -458753;
                                limitRevealDuxo2 = (LimitRevealDuxo) baseDuxo;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            z3 = z2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1175512226, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitReveal (LimitRevealComposable.kt:69)");
                        }
                        final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        final long j3 = j2;
                        final Long l3 = l2;
                        final String str3 = str2;
                        final boolean z5 = z3;
                        final LimitRevealDuxo limitRevealDuxo4 = limitRevealDuxo2;
                        composer2 = composerStartRestartGroup;
                        CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_LIMIT_REVEAL, null, null, null, 14, null), null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-692853895, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt.LimitReveal.1
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
                                    ComposerKt.traceEventStart(-692853895, i6, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitReveal.<anonymous> (LimitRevealComposable.kt:74)");
                                }
                                LimitRevealComposable2.BottomBar(z3, onContinue, current2, limitRevealDuxo2, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, false, true, ComposableLambda3.rememberComposableLambda(481770538, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt.LimitReveal.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i6 & 6) == 0) {
                                    i6 |= composer3.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(481770538, i6, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitReveal.<anonymous> (LimitRevealComposable.kt:76)");
                                }
                                if (!z5 || l3 == null || str3 == null) {
                                    composer3.startReplaceGroup(-1354413193);
                                    LimitRevealComposable2.CreditLimitStandard(paddingValues, j3, composer3, i6 & 14);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-1354515338);
                                    LimitRevealComposable2.CreditLimitUpsell(paddingValues, j3, l3.longValue(), str3, limitRevealDuxo4, composer3, i6 & 14);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, 12582912, 432, 1918);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z3;
                        limitRevealDuxo3 = limitRevealDuxo4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z4 = z2;
                        limitRevealDuxo3 = limitRevealDuxo2;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LimitRevealComposable2.LimitReveal$lambda$0(j, l, str, onContinue, z4, limitRevealDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                z2 = z;
                if ((196608 & i) != 0) {
                }
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        final long j32 = j2;
                        final Long l32 = l2;
                        final String str32 = str2;
                        final boolean z52 = z3;
                        final LimitRevealDuxo limitRevealDuxo42 = limitRevealDuxo2;
                        composer2 = composerStartRestartGroup;
                        CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_LIMIT_REVEAL, null, null, null, 14, null), null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-692853895, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt.LimitReveal.1
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
                                    ComposerKt.traceEventStart(-692853895, i6, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitReveal.<anonymous> (LimitRevealComposable.kt:74)");
                                }
                                LimitRevealComposable2.BottomBar(z3, onContinue, current22, limitRevealDuxo2, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, false, true, ComposableLambda3.rememberComposableLambda(481770538, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt.LimitReveal.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i6 & 6) == 0) {
                                    i6 |= composer3.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(481770538, i6, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitReveal.<anonymous> (LimitRevealComposable.kt:76)");
                                }
                                if (!z52 || l32 == null || str32 == null) {
                                    composer3.startReplaceGroup(-1354413193);
                                    LimitRevealComposable2.CreditLimitStandard(paddingValues, j32, composer3, i6 & 14);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-1354515338);
                                    LimitRevealComposable2.CreditLimitUpsell(paddingValues, j32, l32.longValue(), str32, limitRevealDuxo42, composer3, i6 & 14);
                                    composer3.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, 12582912, 432, 1918);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z4 = z3;
                        limitRevealDuxo3 = limitRevealDuxo42;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str2 = str;
            if ((i2 & 8) != 0) {
            }
            i4 = i2 & 16;
            if (i4 == 0) {
            }
            z2 = z;
            if ((196608 & i) != 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        l2 = l;
        if ((i2 & 4) == 0) {
        }
        str2 = str;
        if ((i2 & 8) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean AnimatedGradientText$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float AnimatedGradientText$lambda$15(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float AnimatedGradientText$lambda$18(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float AnimatedGradientText$lambda$21(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float AnimatedGradientText$lambda$24(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float AnimatedLine$lambda$37$lambda$36$lambda$32(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float AnimatedLine$lambda$37$lambda$36$lambda$33(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final boolean BottomBar$lambda$41(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float BottomBar$lambda$47$lambda$44(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CreditLimitStandard(final PaddingValues paddingValues, final long j, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1686568131);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1686568131, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.CreditLimitStandard (LimitRevealComposable.kt:88)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), paddingValues), 0.0f, composerStartRestartGroup, 0, 1), LIMIT_REVEAL_STANDARD_TEST_TAG);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion2.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_title_pretext, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextL(), composerStartRestartGroup, 0, 0, 8124);
            AnimatedGradientText(toDollars(j), TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleLarge(), 0L, TextUnit2.getSp(72), FontWeight.INSTANCE.getNormal(), null, null, null, null, TextUnit2.getSp(-2.16d), null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777081, null), TestTag3.testTag(companion, LIMIT_REVEAL_STANDARD_LIMIT_TEST_TAG), composerStartRestartGroup, 384, 0);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LimitRevealComposable2.CreditLimitStandard$lambda$3(paddingValues, j, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CreditLimitUpsell(final PaddingValues paddingValues, final long j, final long j2, final String str, final LimitRevealDuxo limitRevealDuxo, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1445366924);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(limitRevealDuxo) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1445366924, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.CreditLimitUpsell (LimitRevealComposable.kt:130)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues), 0.0f, composerStartRestartGroup, 0, 1), LIMIT_REVEAL_UPSELL_TEST_TAG);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, 3, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAnimateContentSize$default);
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
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_title_upsell_pretext, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            AnimatedGradientText(strStringResource, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), null, composerStartRestartGroup, 0, 4);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
            AnimatedLine(StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_upsell_subtitle_first, composerStartRestartGroup, 0), 2000L, composerStartRestartGroup, 48, 0);
            AnimatedLine(StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_upsell_subtitle_second, composerStartRestartGroup, 0), 2300L, composerStartRestartGroup, 48, 0);
            int i5 = i3 >> 3;
            LimitPickerComposable.AnimatedCreditLimitPicker(j, j2, str, limitRevealDuxo, TestTag3.testTag(companion, LIMIT_REVEAL_UPSELL_LIMIT_TEST_TAG), 3000L, composerStartRestartGroup, (i5 & 14) | 221184 | (i5 & 112) | (i5 & 896) | (i5 & 7168), 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LimitRevealComposable2.CreditLimitUpsell$lambda$6(paddingValues, j, j2, str, limitRevealDuxo, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final String toDollars(long j) {
        String strValueOf = String.valueOf(j / InvestFlowConstants.MAX_ONE_TIME_AMOUNT);
        int length = strValueOf.length() > 3 ? strValueOf.length() % 3 : 0;
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int length2 = strValueOf.length();
        for (int i = 0; i < length2; i++) {
            if (i == length) {
                if (length > 0) {
                    sb.append(",");
                }
                length += 3;
            }
            sb.append(strValueOf.charAt(i));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnimatedGradientText$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState AnimatedGradientText$lambda$9$lambda$8() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedGradientText$lambda$14$lambda$13(KeyframesSpec.KeyframesSpecConfig keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(1500);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(200.0f), 0);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(-200.0f), 1500);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedGradientText$lambda$17$lambda$16(KeyframesSpec.KeyframesSpecConfig keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(2000);
        Float fValueOf = Float.valueOf(0.5f);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) fValueOf, 0);
        Float fValueOf2 = Float.valueOf(1.0f);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) fValueOf2, 500);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) fValueOf2, 1000);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) fValueOf, 1500);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), 2000);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedGradientText$lambda$20$lambda$19(KeyframesSpec.KeyframesSpecConfig keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(2000);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(-2.0f), 0);
        Float fValueOf = Float.valueOf(2.0f);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) fValueOf, 500);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) fValueOf, 1000);
        Float fValueOf2 = Float.valueOf(0.0f);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) fValueOf2, 1500);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) fValueOf2, 2000);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedGradientText$lambda$23$lambda$22(KeyframesSpec.KeyframesSpecConfig keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(2000);
        Float fValueOf = Float.valueOf(-2.0f);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) fValueOf, 0);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) fValueOf, 500);
        Float fValueOf2 = Float.valueOf(2.0f);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) fValueOf2, 1000);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) fValueOf2, 1500);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), 2000);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0493  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AnimatedGradientText(final String str, final TextStyle textStyle, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        TextStyle textStyle2;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        Object objRememberedValue6;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Float fValueOf = Float.valueOf(0.9f);
        Float fValueOf2 = Float.valueOf(0.4f);
        Float fValueOf3 = Float.valueOf(0.3f);
        Composer composerStartRestartGroup = composer.startRestartGroup(1086908265);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            textStyle2 = textStyle;
        } else {
            textStyle2 = textStyle;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(textStyle2) ? 32 : 16;
            }
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1086908265, i4, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.AnimatedGradientText (LimitRevealComposable.kt:191)");
                }
                Modifier modifier5 = modifier4;
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LimitRevealComposable2.AnimatedGradientText$lambda$9$lambda$8();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(snapshotState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new LimitRevealComposable3(snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                float f = !AnimatedGradientText$lambda$10(snapshotState) ? -200.0f : 200.0f;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LimitRevealComposable2.AnimatedGradientText$lambda$14$lambda$13((KeyframesSpec.KeyframesSpecConfig) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(f, AnimationSpecKt.keyframes((Function1) objRememberedValue3), 0.0f, "", null, composerStartRestartGroup, 3120, 20);
                float f2 = !AnimatedGradientText$lambda$10(snapshotState) ? 0.0f : 0.5f;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LimitRevealComposable2.AnimatedGradientText$lambda$17$lambda$16((KeyframesSpec.KeyframesSpecConfig) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(f2, AnimationSpecKt.keyframes((Function1) objRememberedValue4), 0.0f, "", null, composerStartRestartGroup, 3120, 20);
                float f3 = !AnimatedGradientText$lambda$10(snapshotState) ? 0.0f : -2.0f;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LimitRevealComposable2.AnimatedGradientText$lambda$20$lambda$19((KeyframesSpec.KeyframesSpecConfig) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4<Float> snapshotState4AnimateFloatAsState3 = AnimateAsState.animateFloatAsState(f3, AnimationSpecKt.keyframes((Function1) objRememberedValue5), 0.0f, "", null, composerStartRestartGroup, 3120, 20);
                float f4 = !AnimatedGradientText$lambda$10(snapshotState) ? 0.0f : -2.0f;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LimitRevealComposable2.AnimatedGradientText$lambda$23$lambda$22((KeyframesSpec.KeyframesSpecConfig) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4<Float> snapshotState4AnimateFloatAsState4 = AnimateAsState.animateFloatAsState(f4, AnimationSpecKt.keyframes((Function1) objRememberedValue6), 0.0f, "", null, composerStartRestartGroup, 3120, 20);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
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
                Modifier modifierAlign = boxScopeInstance.align(modifier5, companion3.getCenter());
                Brush.Companion companion5 = Brush.INSTANCE;
                Tuples2[] tuples2Arr = {Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color2.Color(4280031245L))), Tuples4.m3642to(Float.valueOf(0.1f), Color.m6701boximpl(Color2.Color(4280031245L))), Tuples4.m3642to(Float.valueOf(0.2f), Color.m6701boximpl(Color2.Color(4280031245L))), Tuples4.m3642to(fValueOf3, Color.m6701boximpl(Color2.Color(4280294422L))), Tuples4.m3642to(fValueOf3, Color.m6701boximpl(Color2.Color(4281477139L))), Tuples4.m3642to(fValueOf3, Color.m6701boximpl(Color2.Color(4281542930L))), Tuples4.m3642to(fValueOf2, Color.m6701boximpl(Color2.Color(4280031245L))), Tuples4.m3642to(fValueOf2, Color.m6701boximpl(Color2.Color(4280688922L))), Tuples4.m3642to(Float.valueOf(0.5f), Color.m6701boximpl(Color2.Color(4286408490L))), Tuples4.m3642to(Float.valueOf(0.6f), Color.m6701boximpl(Color2.Color(4283909655L))), Tuples4.m3642to(Float.valueOf(0.7f), Color.m6701boximpl(Color2.Color(4288775219L))), Tuples4.m3642to(Float.valueOf(0.8f), Color.m6701boximpl(Color2.Color(4289696582L))), Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color2.Color(4291342188L))), Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color2.Color(4290879558L)))};
                float fAnimatedGradientText$lambda$15 = AnimatedGradientText$lambda$15(snapshotState4AnimateFloatAsState);
                long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(AnimatedGradientText$lambda$15(snapshotState4AnimateFloatAsState)) & 4294967295L) | (Float.floatToRawIntBits(fAnimatedGradientText$lambda$15) << 32));
                float fAnimatedGradientText$lambda$152 = AnimatedGradientText$lambda$15(snapshotState4AnimateFloatAsState) + 400.0f;
                TextStyle textStyleM7654copyNs73l9s$default = TextStyle.m7654copyNs73l9s$default(textStyle2, Brush.Companion.m6679linearGradientmHitzGk$default(companion5, tuples2Arr, jM6535constructorimpl, Offset.m6535constructorimpl((Float.floatToRawIntBits(AnimatedGradientText$lambda$15(snapshotState4AnimateFloatAsState) + 500.0f) & 4294967295L) | (Float.floatToRawIntBits(fAnimatedGradientText$lambda$152) << 32)), 0, 8, (Object) null), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null);
                TextAlign.Companion companion6 = TextAlign.INSTANCE;
                int i6 = i4 & 14;
                BentoText2.m20747BentoText38GnDrw(str, modifierAlign, null, null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyleM7654copyNs73l9s$default, composerStartRestartGroup, i6, 0, 8124);
                BentoText2.m20747BentoText38GnDrw(str, GraphicsLayerModifier6.m6758graphicsLayerAp8cVGQ$default(boxScopeInstance.align(companion2, companion3.getCenter()), 0.0f, 0.0f, AnimatedGradientText$lambda$18(snapshotState4AnimateFloatAsState2), AnimatedGradientText$lambda$21(snapshotState4AnimateFloatAsState3), AnimatedGradientText$lambda$24(snapshotState4AnimateFloatAsState4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131043, null), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyle, composerStartRestartGroup, i6, (i4 << 6) & 7168, 8120);
                composerStartRestartGroup = composerStartRestartGroup;
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LimitRevealComposable2.AnimatedGradientText$lambda$26(str, textStyle, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(snapshotState);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = new LimitRevealComposable3(snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                if (!AnimatedGradientText$lambda$10(snapshotState)) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4<Float> snapshotState4AnimateFloatAsState5 = AnimateAsState.animateFloatAsState(f, AnimationSpecKt.keyframes((Function1) objRememberedValue3), 0.0f, "", null, composerStartRestartGroup, 3120, 20);
                if (!AnimatedGradientText$lambda$10(snapshotState)) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4<Float> snapshotState4AnimateFloatAsState22 = AnimateAsState.animateFloatAsState(f2, AnimationSpecKt.keyframes((Function1) objRememberedValue4), 0.0f, "", null, composerStartRestartGroup, 3120, 20);
                if (!AnimatedGradientText$lambda$10(snapshotState)) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4<Float> snapshotState4AnimateFloatAsState32 = AnimateAsState.animateFloatAsState(f3, AnimationSpecKt.keyframes((Function1) objRememberedValue5), 0.0f, "", null, composerStartRestartGroup, 3120, 20);
                if (!AnimatedGradientText$lambda$10(snapshotState)) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4<Float> snapshotState4AnimateFloatAsState42 = AnimateAsState.animateFloatAsState(f4, AnimationSpecKt.keyframes((Function1) objRememberedValue6), 0.0f, "", null, composerStartRestartGroup, 3120, 20);
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Alignment.Companion companion32 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion32.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion22);
                ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion42.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion42.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion42.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion42.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier modifierAlign2 = boxScopeInstance2.align(modifier52, companion32.getCenter());
                    Brush.Companion companion52 = Brush.INSTANCE;
                    Tuples2[] tuples2Arr2 = {Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color2.Color(4280031245L))), Tuples4.m3642to(Float.valueOf(0.1f), Color.m6701boximpl(Color2.Color(4280031245L))), Tuples4.m3642to(Float.valueOf(0.2f), Color.m6701boximpl(Color2.Color(4280031245L))), Tuples4.m3642to(fValueOf3, Color.m6701boximpl(Color2.Color(4280294422L))), Tuples4.m3642to(fValueOf3, Color.m6701boximpl(Color2.Color(4281477139L))), Tuples4.m3642to(fValueOf3, Color.m6701boximpl(Color2.Color(4281542930L))), Tuples4.m3642to(fValueOf2, Color.m6701boximpl(Color2.Color(4280031245L))), Tuples4.m3642to(fValueOf2, Color.m6701boximpl(Color2.Color(4280688922L))), Tuples4.m3642to(Float.valueOf(0.5f), Color.m6701boximpl(Color2.Color(4286408490L))), Tuples4.m3642to(Float.valueOf(0.6f), Color.m6701boximpl(Color2.Color(4283909655L))), Tuples4.m3642to(Float.valueOf(0.7f), Color.m6701boximpl(Color2.Color(4288775219L))), Tuples4.m3642to(Float.valueOf(0.8f), Color.m6701boximpl(Color2.Color(4289696582L))), Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color2.Color(4291342188L))), Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color2.Color(4290879558L)))};
                    float fAnimatedGradientText$lambda$153 = AnimatedGradientText$lambda$15(snapshotState4AnimateFloatAsState5);
                    long jM6535constructorimpl2 = Offset.m6535constructorimpl((Float.floatToRawIntBits(AnimatedGradientText$lambda$15(snapshotState4AnimateFloatAsState5)) & 4294967295L) | (Float.floatToRawIntBits(fAnimatedGradientText$lambda$153) << 32));
                    float fAnimatedGradientText$lambda$1522 = AnimatedGradientText$lambda$15(snapshotState4AnimateFloatAsState5) + 400.0f;
                    TextStyle textStyleM7654copyNs73l9s$default2 = TextStyle.m7654copyNs73l9s$default(textStyle2, Brush.Companion.m6679linearGradientmHitzGk$default(companion52, tuples2Arr2, jM6535constructorimpl2, Offset.m6535constructorimpl((Float.floatToRawIntBits(AnimatedGradientText$lambda$15(snapshotState4AnimateFloatAsState5) + 500.0f) & 4294967295L) | (Float.floatToRawIntBits(fAnimatedGradientText$lambda$1522) << 32)), 0, 8, (Object) null), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null);
                    TextAlign.Companion companion62 = TextAlign.INSTANCE;
                    int i62 = i4 & 14;
                    BentoText2.m20747BentoText38GnDrw(str, modifierAlign2, null, null, null, null, TextAlign.m7912boximpl(companion62.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyleM7654copyNs73l9s$default2, composerStartRestartGroup, i62, 0, 8124);
                    BentoText2.m20747BentoText38GnDrw(str, GraphicsLayerModifier6.m6758graphicsLayerAp8cVGQ$default(boxScopeInstance2.align(companion22, companion32.getCenter()), 0.0f, 0.0f, AnimatedGradientText$lambda$18(snapshotState4AnimateFloatAsState22), AnimatedGradientText$lambda$21(snapshotState4AnimateFloatAsState32), AnimatedGradientText$lambda$24(snapshotState4AnimateFloatAsState42), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131043, null), Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion62.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyle, composerStartRestartGroup, i62, (i4 << 6) & 7168, 8120);
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AnimatedLine(final String str, long j, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        long j2;
        long j3;
        List listSplit$default;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotIntState2 snapshotIntState2;
        boolean zChangedInstance;
        Object objRememberedValue2;
        long j4;
        SnapshotIntState2 snapshotIntState22;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-18626859);
        int i4 = 4;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            i3 = (i & 6) == 0 ? i | (composerStartRestartGroup.changed(str2) ? 4 : 2) : i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                j2 = j;
                i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                j5 = j2;
            } else {
                j3 = i5 == 0 ? 0L : j2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-18626859, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.AnimatedLine (LimitRevealComposable.kt:291)");
                }
                listSplit$default = StringsKt.split$default((CharSequence) str2, new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null);
                int i6 = i3;
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LimitRevealComposable2.AnimatedLine$lambda$28$lambda$27();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean z = true;
                zChangedInstance = ((i6 & 112) != 32) | composerStartRestartGroup.changedInstance(listSplit$default) | composerStartRestartGroup.changed(snapshotIntState2);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    long j6 = j3;
                    LimitRevealComposable4 limitRevealComposable4 = new LimitRevealComposable4(j6, listSplit$default, snapshotIntState2, null);
                    j4 = j6;
                    snapshotIntState22 = snapshotIntState2;
                    composerStartRestartGroup.updateRememberedValue(limitRevealComposable4);
                    objRememberedValue2 = limitRevealComposable4;
                } else {
                    snapshotIntState22 = snapshotIntState2;
                    j4 = j3;
                }
                composerStartRestartGroup.endReplaceGroup();
                int i7 = 6;
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                float f = 0.0f;
                Easing easing = null;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1003512881);
                int i8 = 0;
                for (Object obj : listSplit$default) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    String str3 = (String) obj;
                    boolean z2 = i8 <= snapshotIntState22.getIntValue() ? z : false;
                    boolean z3 = z;
                    Composer composer2 = composerStartRestartGroup;
                    final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(z2 ? 1.0f : f, AnimationSpecKt.tween$default(OptionOnboardingUpsellAnimationConstants.UPSELL_ANIMATION_DURATION, 0, easing, i7, easing), 0.0f, null, null, composer2, 48, 28);
                    final SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI = AnimateAsState.m4812animateDpAsStateAjpBEmI(C2002Dp.m7995constructorimpl(z2 ? 0 : 30), AnimationSpecKt.tween$default(300, 0, easing, i7, easing), null, null, composer2, 48, 12);
                    TextStyle displayCapsuleLarge = BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getDisplayCapsuleLarge();
                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(i4), 0.0f, 11, null);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChanged = composer2.changed(snapshotState4M4812animateDpAsStateAjpBEmI) | composer2.changed(snapshotState4AnimateFloatAsState);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return LimitRevealComposable2.AnimatedLine$lambda$37$lambda$36$lambda$35$lambda$34(snapshotState4M4812animateDpAsStateAjpBEmI, snapshotState4AnimateFloatAsState, (GraphicsLayerScope) obj2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(str3, GraphicsLayerModifier6.graphicsLayer(modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue3), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleLarge, composer2, 0, 0, 8188);
                    composerStartRestartGroup = composer2;
                    i8 = i9;
                    z = z3;
                    f = f;
                    easing = easing;
                    i4 = i4;
                    i7 = i7;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = j4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return LimitRevealComposable2.AnimatedLine$lambda$38(str, j5, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        j2 = j;
        if ((i3 & 19) != 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            listSplit$default = StringsKt.split$default((CharSequence) str2, new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null);
            int i62 = i3;
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z4 = true;
            zChangedInstance = ((i62 & 112) != 32) | composerStartRestartGroup.changedInstance(listSplit$default) | composerStartRestartGroup.changed(snapshotIntState2);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                long j62 = j3;
                LimitRevealComposable4 limitRevealComposable42 = new LimitRevealComposable4(j62, listSplit$default, snapshotIntState2, null);
                j4 = j62;
                snapshotIntState22 = snapshotIntState2;
                composerStartRestartGroup.updateRememberedValue(limitRevealComposable42);
                objRememberedValue2 = limitRevealComposable42;
                composerStartRestartGroup.endReplaceGroup();
                int i72 = 6;
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                float f2 = 0.0f;
                Easing easing2 = null;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1003512881);
                    int i82 = 0;
                    while (r22.hasNext()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    j5 = j4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 AnimatedLine$lambda$28$lambda$27() {
        return SnapshotIntState3.mutableIntStateOf(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedLine$lambda$37$lambda$36$lambda$35$lambda$34(SnapshotState4 snapshotState4, SnapshotState4 snapshotState42, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setTranslationY(graphicsLayer.mo5016toPx0680j_4(AnimatedLine$lambda$37$lambda$36$lambda$33(snapshotState4)));
        graphicsLayer.setAlpha(AnimatedLine$lambda$37$lambda$36$lambda$32(snapshotState42));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomBar(final boolean z, final Function0<Unit> function0, final EventLogger eventLogger, final LimitRevealDuxo limitRevealDuxo, Composer composer, final int i) {
        int i2;
        EventLogger eventLogger2;
        LimitRevealDuxo limitRevealDuxo2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2054529823);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            eventLogger2 = eventLogger;
            i2 |= composerStartRestartGroup.changedInstance(eventLogger2) ? 256 : 128;
        } else {
            eventLogger2 = eventLogger;
        }
        if ((i & 3072) == 0) {
            limitRevealDuxo2 = limitRevealDuxo;
            i2 |= composerStartRestartGroup.changedInstance(limitRevealDuxo2) ? 2048 : 1024;
        } else {
            limitRevealDuxo2 = limitRevealDuxo;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2054529823, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.BottomBar (LimitRevealComposable.kt:341)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LimitRevealComposable2.BottomBar$lambda$40$lambda$39();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Boolean boolValueOf = Boolean.valueOf(z);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i3 = i2 & 14;
            boolean zChanged = (i3 == 4) | composerStartRestartGroup.changed(snapshotState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new LimitRevealComposable5(z, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i3);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 6, 1);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), centerHorizontally, composerStartRestartGroup, 48);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(BottomBar$lambda$41(snapshotState) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(OptionOnboardingUpsellAnimationConstants.UPSELL_ANIMATION_DURATION, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged2 = composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LimitRevealComposable2.BottomBar$lambda$47$lambda$46$lambda$45(snapshotState4AnimateFloatAsState, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-484264067, true, new LimitRevealComposable6(z, GraphicsLayerModifier6.graphicsLayer(companion2, (Function1) objRememberedValue3), ((LimitRevealState) FlowExtKt.collectAsStateWithLifecycle(limitRevealDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue()).getSelectedPremium(), eventLogger2, limitRevealDuxo2, function0), composerStartRestartGroup, 54), composerStartRestartGroup, 805306368, 510);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LimitRevealComposable2.BottomBar$lambda$48(z, function0, eventLogger, limitRevealDuxo, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState BottomBar$lambda$40$lambda$39() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomBar$lambda$42(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBar$lambda$47$lambda$46$lambda$45(SnapshotState4 snapshotState4, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(BottomBar$lambda$47$lambda$44(snapshotState4));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Disclaimer(final Context context, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final String strStringResource;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(481945398);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(context) ? 4 : 2);
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
                    ComposerKt.traceEventStart(481945398, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.Disclaimer (LimitRevealComposable.kt:405)");
                }
                strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_upsell_terms_link, composerStartRestartGroup, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
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
                Modifier modifierTestTag = TestTag3.testTag(companion2, LIMIT_REVEAL_UPSELL_DISCLAIMER_TITLE_TEST_TAG);
                String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_upsell_disclaimer, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierTestTag, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 48, 0, 8120);
                String strStringResource3 = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_upsell_see_terms, composerStartRestartGroup, 0);
                TextDecoration underline = TextDecoration.INSTANCE.getUnderline();
                TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(strStringResource);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LimitRevealComposable2.Disclaimer$lambda$51$lambda$50$lambda$49(context, strStringResource);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(strStringResource3, TestTag3.testTag(ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue, 7, null), LIMIT_REVEAL_UPSELL_DISCLAIMER_TERMS_TEST_TAG), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, underline, null, 0, false, 0, 0, null, 0, textS, composer2, 196608, 0, 8152);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LimitRevealComposable2.Disclaimer$lambda$52(context, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_upsell_terms_link, composerStartRestartGroup, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                Modifier modifierTestTag2 = TestTag3.testTag(companion22, LIMIT_REVEAL_UPSELL_DISCLAIMER_TITLE_TEST_TAG);
                String strStringResource22 = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_upsell_disclaimer, composerStartRestartGroup, 0);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(strStringResource22, modifierTestTag2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 48, 0, 8120);
                String strStringResource32 = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_upsell_see_terms, composerStartRestartGroup, 0);
                TextDecoration underline2 = TextDecoration.INSTANCE.getUnderline();
                TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
                long jM21426getFg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(strStringResource);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealComposableKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LimitRevealComposable2.Disclaimer$lambda$51$lambda$50$lambda$49(context, strStringResource);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(strStringResource32, TestTag3.testTag(ClickableKt.m4893clickableXHw0xAI$default(companion22, false, null, null, (Function0) objRememberedValue, 7, null), LIMIT_REVEAL_UPSELL_DISCLAIMER_TERMS_TEST_TAG), Color.m6701boximpl(jM21426getFg20d7_KjU2), null, null, underline2, null, 0, false, 0, 0, null, 0, textS2, composer2, 196608, 0, 8152);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier42;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Disclaimer$lambda$51$lambda$50$lambda$49(Context context, String str) {
        WebUtils.viewUrl$default(context, str, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }
}
