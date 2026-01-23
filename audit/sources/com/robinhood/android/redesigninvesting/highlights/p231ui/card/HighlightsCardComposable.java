package com.robinhood.android.redesigninvesting.highlights.p231ui.card;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.cortex.contracts.PortfolioDigestFragmentKey;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.redesigninvesting.highlights.models.HighlightCard;
import com.robinhood.android.redesigninvesting.highlights.p231ui.HighlightsCardDuxo;
import com.robinhood.android.redesigninvesting.highlights.p231ui.HighlightsCardViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.Job;

/* compiled from: HighlightsCardComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"HighlightsCardComposable", "", "card", "Lcom/robinhood/android/redesigninvesting/highlights/models/HighlightCard;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "width", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCardDuxo;", "HighlightsCardComposable-TN_CM5M", "(Lcom/robinhood/android/redesigninvesting/highlights/models/HighlightCard;IFLandroidx/compose/ui/Modifier;Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCardDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-highlights-ui_externalDebug", "viewState", "Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCardViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.card.HighlightsCardComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class HighlightsCardComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HighlightsCardComposable_TN_CM5M$lambda$12(HighlightCard highlightCard, int i, float f, Modifier modifier, HighlightsCardDuxo highlightsCardDuxo, int i2, int i3, Composer composer, int i4) {
        m17966HighlightsCardComposableTN_CM5M(highlightCard, i, f, modifier, highlightsCardDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0199  */
    /* renamed from: HighlightsCardComposable-TN_CM5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m17966HighlightsCardComposableTN_CM5M(final HighlightCard card, final int i, final float f, Modifier modifier, HighlightsCardDuxo highlightsCardDuxo, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        final HighlightsCardDuxo highlightsCardDuxo2;
        int i5;
        boolean z;
        Modifier modifier3;
        final HighlightsCardDuxo highlightsCardDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean z2;
        HighlightCard card2;
        final HighlightCard.RealHighlightCard realHighlightCard;
        Object objRememberedValue2;
        Composer.Companion companion;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        final Navigator navigator;
        final Context context;
        Modifier modifier4;
        Modifier modifierAlpha;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(card, "card");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1096791706);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(card) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    highlightsCardDuxo2 = highlightsCardDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(highlightsCardDuxo2) ? 16384 : 8192;
                    i4 |= i7;
                } else {
                    highlightsCardDuxo2 = highlightsCardDuxo;
                }
                i4 |= i7;
            } else {
                highlightsCardDuxo2 = highlightsCardDuxo;
            }
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i3 & 16) == 0) {
                        String key = card.getKey();
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        z = false;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(HighlightsCardDuxo.class), current, key, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.card.HighlightsCardComposableKt$HighlightsCardComposable-TN_CM5M$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.card.HighlightsCardComposableKt$HighlightsCardComposable-TN_CM5M$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 &= -57345;
                        modifier3 = modifier5;
                        highlightsCardDuxo3 = (HighlightsCardDuxo) baseDuxo;
                        i5 = -1633490746;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1096791706, i4, -1, "com.robinhood.android.redesigninvesting.highlights.ui.card.HighlightsCardComposable (HighlightsCardComposable.kt:41)");
                        }
                        composerStartRestartGroup.startReplaceGroup(i5);
                        zChangedInstance = composerStartRestartGroup.changedInstance(highlightsCardDuxo3) | composerStartRestartGroup.changedInstance(card);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.card.HighlightsCardComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HighlightsCardComposable.HighlightsCardComposable_TN_CM5M$lambda$2$lambda$1(highlightsCardDuxo3, card, (LifecycleResumePauseEffectScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i8 = i4 & 14;
                        z2 = z;
                        LifecycleEffectKt.LifecycleResumeEffect(card, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, i8, 2);
                        int i9 = i5;
                        Modifier modifier6 = modifier3;
                        HighlightsCardDuxo highlightsCardDuxo4 = highlightsCardDuxo3;
                        card2 = HighlightsCardComposable_TN_CM5M$lambda$3(FlowExtKt.collectAsStateWithLifecycle(highlightsCardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)).getCard();
                        if (card2 == null) {
                            card2 = card;
                        }
                        realHighlightCard = !(card2 instanceof HighlightCard.RealHighlightCard) ? (HighlightCard.RealHighlightCard) card2 : null;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = InteractionSource2.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1749815644);
                        if (realHighlightCard == null) {
                            String id = realHighlightCard.getId();
                            composerStartRestartGroup.startReplaceGroup(i9);
                            boolean zChanged = composerStartRestartGroup.changed(id) | composerStartRestartGroup.changed(realHighlightCard);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = new UserInteractionEventDescriptor(null, null, null, new com.robinhood.rosetta.eventlogging.Context(i + 1, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(realHighlightCard.getId(), null, null, null, 14, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16386, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.CARD, realHighlightCard.getAnalyticsName(), null, 4, null), null, 39, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            userInteractionEventDescriptor = (UserInteractionEventDescriptor) objRememberedValue5;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            userInteractionEventDescriptor = null;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceGroup(-1749794286);
                        if (realHighlightCard == null ? true : z2) {
                            modifier4 = modifier6;
                            modifierAlpha = modifier4;
                        } else {
                            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i10 = BentoTheme.$stable;
                            long jM21373getBg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i10).m21373getBg30d7_KjU();
                            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i10).m21593getSmallD9Ej5fM());
                            modifier4 = modifier6;
                            modifierAlpha = BorderKt.m4876borderxT4_qwU(modifier4, fM7995constructorimpl, jM21373getBg30d7_KjU, roundedCornerShapeM5327RoundedCornerShape0680j_4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (realHighlightCard != null) {
                            modifierAlpha = Alpha.alpha(modifierAlpha, 0.0f);
                        }
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i11 = BentoTheme.$stable;
                        UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(SizeKt.m5174width3ABfNKs(Background3.m4871backgroundbw27NRU(modifierAlpha, bentoTheme2.getColors(composerStartRestartGroup, i11).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i11).m21593getSmallD9Ej5fM())), f), C2002Dp.m7995constructorimpl(12), bentoTheme2.getSpacing(composerStartRestartGroup, i11).m21593getSmallD9Ej5fM());
                        boolean z3 = (realHighlightCard == null ? realHighlightCard.getDeeplink() : null) == null;
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(realHighlightCard) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.card.HighlightsCardComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return HighlightsCardComposable.HighlightsCardComposable_TN_CM5M$lambda$10$lambda$9(realHighlightCard, navigator, context);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(modifierM5143paddingVpY3zN4, interactionSource3, null, z3, null, null, (Function0) objRememberedValue3, 24, null), userInteractionEventDescriptor2, realHighlightCard == null, false, false, realHighlightCard == null, false, null, 108, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
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
                        if (!(realHighlightCard instanceof HighlightCard.RealHighlightCard.EcEventCard)) {
                            composerStartRestartGroup.startReplaceGroup(910946321);
                            EcEventCard4.EcEventCard((HighlightCard.RealHighlightCard.EcEventCard) realHighlightCard, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (realHighlightCard instanceof HighlightCard.RealHighlightCard.EcReserveCard) {
                            composerStartRestartGroup.startReplaceGroup(911059471);
                            EcReserveCard5.EcReserveCard((HighlightCard.RealHighlightCard.EcReserveCard) realHighlightCard, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (realHighlightCard instanceof HighlightCard.RealHighlightCard.GenericCard) {
                            composerStartRestartGroup.startReplaceGroup(911172497);
                            GenericCard2.GenericCard((HighlightCard.RealHighlightCard.GenericCard) realHighlightCard, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (realHighlightCard instanceof HighlightCard.RealHighlightCard.PortfolioDigestCard) {
                            composerStartRestartGroup.startReplaceGroup(911291785);
                            PortfolioDigestCard6.PortfolioDigestCard((HighlightCard.RealHighlightCard.PortfolioDigestCard) realHighlightCard, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else if (Intrinsics.areEqual(realHighlightCard, HighlightCard.Empty.INSTANCE)) {
                            composerStartRestartGroup.startReplaceGroup(911383328);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (realHighlightCard != null) {
                                composerStartRestartGroup.startReplaceGroup(-109163895);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(911406144);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        highlightsCardDuxo2 = highlightsCardDuxo4;
                        modifier2 = modifier4;
                    } else {
                        i5 = -1633490746;
                        z = false;
                        modifier3 = modifier5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    i5 = -1633490746;
                    modifier3 = modifier2;
                    z = false;
                }
                highlightsCardDuxo3 = highlightsCardDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(i5);
                zChangedInstance = composerStartRestartGroup.changedInstance(highlightsCardDuxo3) | composerStartRestartGroup.changedInstance(card);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.card.HighlightsCardComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HighlightsCardComposable.HighlightsCardComposable_TN_CM5M$lambda$2$lambda$1(highlightsCardDuxo3, card, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    int i82 = i4 & 14;
                    z2 = z;
                    LifecycleEffectKt.LifecycleResumeEffect(card, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composerStartRestartGroup, i82, 2);
                    int i92 = i5;
                    Modifier modifier62 = modifier3;
                    HighlightsCardDuxo highlightsCardDuxo42 = highlightsCardDuxo3;
                    card2 = HighlightsCardComposable_TN_CM5M$lambda$3(FlowExtKt.collectAsStateWithLifecycle(highlightsCardDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)).getCard();
                    if (card2 == null) {
                    }
                    if (!(card2 instanceof HighlightCard.RealHighlightCard)) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1749815644);
                    if (realHighlightCard == null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceGroup(-1749794286);
                    if (realHighlightCard == null ? true : z2) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (realHighlightCard != null) {
                    }
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i112 = BentoTheme.$stable;
                    UserInteractionEventDescriptor userInteractionEventDescriptor22 = userInteractionEventDescriptor;
                    Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(SizeKt.m5174width3ABfNKs(Background3.m4871backgroundbw27NRU(modifierAlpha, bentoTheme22.getColors(composerStartRestartGroup, i112).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme22.getSpacing(composerStartRestartGroup, i112).m21593getSmallD9Ej5fM())), f), C2002Dp.m7995constructorimpl(12), bentoTheme22.getSpacing(composerStartRestartGroup, i112).m21593getSmallD9Ej5fM());
                    if ((realHighlightCard == null ? realHighlightCard.getDeeplink() : null) == null) {
                    }
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(realHighlightCard) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.card.HighlightsCardComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HighlightsCardComposable.HighlightsCardComposable_TN_CM5M$lambda$10$lambda$9(realHighlightCard, navigator, context);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(modifierM5143paddingVpY3zN42, interactionSource32, null, z3, null, null, (Function0) objRememberedValue3, 24, null), userInteractionEventDescriptor22, realHighlightCard == null, false, false, realHighlightCard == null, false, null, 108, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
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
                            if (!(realHighlightCard instanceof HighlightCard.RealHighlightCard.EcEventCard)) {
                            }
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            highlightsCardDuxo2 = highlightsCardDuxo42;
                            modifier2 = modifier4;
                        }
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.card.HighlightsCardComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HighlightsCardComposable.HighlightsCardComposable_TN_CM5M$lambda$12(card, i, f, modifier2, highlightsCardDuxo2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        modifier2 = modifier;
        if ((i2 & 24576) != 0) {
        }
        if ((i4 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i3 & 16) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult HighlightsCardComposable_TN_CM5M$lambda$2$lambda$1(HighlightsCardDuxo highlightsCardDuxo, HighlightCard highlightCard, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = highlightsCardDuxo.bind(highlightCard);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.card.HighlightsCardComposableKt$HighlightsCardComposable_TN_CM5M$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    private static final HighlightsCardViewState HighlightsCardComposable_TN_CM5M$lambda$3(SnapshotState4<HighlightsCardViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HighlightsCardComposable_TN_CM5M$lambda$10$lambda$9(HighlightCard.RealHighlightCard realHighlightCard, Navigator navigator, Context context) {
        String deeplink;
        Uri uri;
        if (realHighlightCard instanceof HighlightCard.RealHighlightCard.PortfolioDigestCard) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new PortfolioDigestFragmentKey.WithDigest(((HighlightCard.RealHighlightCard.PortfolioDigestCard) realHighlightCard).getPortfolioDigest(), "highlight", false, 4, null), false, false, false, null, false, null, true, false, null, null, 3828, null);
        } else if (realHighlightCard != null && (deeplink = realHighlightCard.getDeeplink()) != null && (uri = Uri.parse(deeplink)) != null) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, null, null, false, null, 60, null);
        }
        return Unit.INSTANCE;
    }
}
