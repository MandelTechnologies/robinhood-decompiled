package com.robinhood.android.cash.merchantrewards.p073ui;

import android.content.res.Resources;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridSpan;
import androidx.compose.foundation.lazy.grid.LazyGridSpan2;
import androidx.compose.foundation.lazy.grid.LazyGridSpan3;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.cash.merchantrewards.C10127R;
import com.robinhood.android.cash.merchantrewards.p073ui.MerchantRewardsOverviewComposable4;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.rhyrewards.p246ui.CashCardOffer;
import com.robinhood.android.rhyrewards.p246ui.CashCardOfferComposable;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: MerchantRewardsOverviewComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ai\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewViewState;", "state", "j$/time/Clock", Card.Icon.CLOCK, "Lkotlin/Function1;", "Lcom/robinhood/android/rhyrewards/ui/CashCardOffer;", "", "showOfferDetails", "j$/time/Instant", "onViewHistory", "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lkotlin/Function0;", "rhyUpsellClickAction", "MerchantRewardsOverviewComposable", "(Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewViewState;Lj$/time/Clock;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Header", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardsOverviewViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Footer", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class MerchantRewardsOverviewComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Footer$lambda$5(Modifier modifier, int i, int i2, Composer composer, int i3) {
        Footer(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$4(Modifier modifier, MerchantRewardsOverviewViewState merchantRewardsOverviewViewState, Function1 function1, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        Header(modifier, merchantRewardsOverviewViewState, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MerchantRewardsOverviewComposable$lambda$0(MerchantRewardsOverviewViewState merchantRewardsOverviewViewState, Clock clock, Function1 function1, Function1 function12, Screen screen, Context context, Function0 function0, int i, Composer composer, int i2) {
        MerchantRewardsOverviewComposable(merchantRewardsOverviewViewState, clock, function1, function12, screen, context, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MerchantRewardsOverviewComposable(final MerchantRewardsOverviewViewState state, final Clock clock, final Function1<? super CashCardOffer, Unit> showOfferDetails, final Function1<? super Instant, Unit> onViewHistory, final Screen loggingScreen, final Context loggingContext, final Function0<Unit> rhyUpsellClickAction, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(showOfferDetails, "showOfferDetails");
        Intrinsics.checkNotNullParameter(onViewHistory, "onViewHistory");
        Intrinsics.checkNotNullParameter(loggingScreen, "loggingScreen");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Intrinsics.checkNotNullParameter(rhyUpsellClickAction, "rhyUpsellClickAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1382257505);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(clock) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(showOfferDetails) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onViewHistory) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(loggingScreen) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(loggingContext) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(rhyUpsellClickAction) ? 1048576 : 524288;
        }
        if ((599187 & i2) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1382257505, i2, -1, "com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposable (MerchantRewardsOverviewComposable.kt:56)");
            }
            float fM21592getMediumD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM();
            final android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composer2 = composerStartRestartGroup;
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-1615400298, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt.MerchantRewardsOverviewComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                    invoke(bentoButtonBar3, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: MerchantRewardsOverviewComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ android.content.Context $context;
                    final /* synthetic */ Function0<Unit> $rhyUpsellClickAction;

                    AnonymousClass1(android.content.Context context, Function0<Unit> function0) {
                        this.$context = context;
                        this.$rhyUpsellClickAction = function0;
                    }

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
                            ComposerKt.traceEventStart(-1393708944, i, -1, "com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposable.<anonymous>.<anonymous> (MerchantRewardsOverviewComposable.kt:63)");
                        }
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer, 6, 0);
                        String string2 = this.$context.getString(C10127R.string.cash_merchant_rhy_upsell_get_card);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        composer.startReplaceGroup(5004770);
                        boolean zChanged = composer.changed(this.$rhyUpsellClickAction);
                        final Function0<Unit> function0 = this.$rhyUpsellClickAction;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MerchantRewardsOverviewComposable4.C101591.AnonymousClass1.invoke$lambda$1$lambda$0(function0);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, string2, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1615400298, i3, -1, "com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposable.<anonymous> (MerchantRewardsOverviewComposable.kt:61)");
                    }
                    if (state.getShouldShowRhyUpsell()) {
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1393708944, true, new AnonymousClass1(context, rhyUpsellClickAction), composer3, 54), composer3, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1961444791, true, new C101602(fM21592getMediumD9Ej5fM, state, onViewHistory, clock, showOfferDetails, loggingContext, loggingScreen), composerStartRestartGroup, 54), composer2, 3456, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MerchantRewardsOverviewComposable4.MerchantRewardsOverviewComposable$lambda$0(state, clock, showOfferDetails, onViewHistory, loggingScreen, loggingContext, rhyUpsellClickAction, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: MerchantRewardsOverviewComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2 */
    static final class C101602 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ Clock $clock;
        final /* synthetic */ float $edgePadding;
        final /* synthetic */ Context $loggingContext;
        final /* synthetic */ Screen $loggingScreen;
        final /* synthetic */ Function1<Instant, Unit> $onViewHistory;
        final /* synthetic */ Function1<CashCardOffer, Unit> $showOfferDetails;
        final /* synthetic */ MerchantRewardsOverviewViewState $state;

        /* JADX WARN: Multi-variable type inference failed */
        C101602(float f, MerchantRewardsOverviewViewState merchantRewardsOverviewViewState, Function1<? super Instant, Unit> function1, Clock clock, Function1<? super CashCardOffer, Unit> function12, Context context, Screen screen) {
            this.$edgePadding = f;
            this.$state = merchantRewardsOverviewViewState;
            this.$onViewHistory = function1;
            this.$clock = clock;
            this.$showOfferDetails = function12;
            this.$loggingContext = context;
            this.$loggingScreen = screen;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1961444791, i, -1, "com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposable.<anonymous> (MerchantRewardsOverviewComposable.kt:74)");
            }
            GridCells.Adaptive adaptive = new GridCells.Adaptive(C2002Dp.m7995constructorimpl(150), null);
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM();
            float f = this.$edgePadding;
            PaddingValues paddingValuesM5138PaddingValuesa9UjIt4 = androidx.compose.foundation.layout.PaddingKt.m5138PaddingValuesa9UjIt4(f, fM21590getDefaultD9Ej5fM, f, fM7995constructorimpl);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(this.$edgePadding) | composer.changedInstance(this.$state) | composer.changed(this.$onViewHistory) | composer.changedInstance(this.$clock) | composer.changed(this.$showOfferDetails) | composer.changedInstance(this.$loggingContext) | composer.changedInstance(this.$loggingScreen);
            final MerchantRewardsOverviewViewState merchantRewardsOverviewViewState = this.$state;
            final float f2 = this.$edgePadding;
            final Function1<Instant, Unit> function1 = this.$onViewHistory;
            final Clock clock = this.$clock;
            final Function1<CashCardOffer, Unit> function12 = this.$showOfferDetails;
            final Context context = this.$loggingContext;
            final Screen screen = this.$loggingScreen;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function13 = new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MerchantRewardsOverviewComposable4.C101602.invoke$lambda$10$lambda$9(merchantRewardsOverviewViewState, f2, function1, clock, function12, context, screen, (LazyGridScope) obj);
                    }
                };
                composer.updateRememberedValue(function13);
                objRememberedValue = function13;
            }
            composer.endReplaceGroup();
            LazyGridDslKt.LazyVerticalGrid(adaptive, null, null, paddingValuesM5138PaddingValuesa9UjIt4, false, horizontalOrVerticalM5089spacedBy0680j_42, horizontalOrVerticalM5089spacedBy0680j_4, null, false, null, (Function1) objRememberedValue, composer, 0, 0, 918);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9(MerchantRewardsOverviewViewState merchantRewardsOverviewViewState, float f, Function1 function1, final Clock clock, final Function1 function12, final Context context, final Screen screen, LazyGridScope LazyVerticalGrid) {
            Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
            LazyGridScope.item$default(LazyVerticalGrid, null, new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MerchantRewardsOverviewComposable4.C101602.invoke$lambda$10$lambda$9$lambda$0((LazyGridSpan2) obj);
                }
            }, new Function0() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MerchantRewardsOverviewComposable3.Header;
                }
            }, ComposableLambda3.composableLambdaInstance(1417804565, true, new MerchantRewardsOverviewComposable6(f, merchantRewardsOverviewViewState, function1)), 1, null);
            final List<CashCardOffer> cashCardOffers = merchantRewardsOverviewViewState.getCashCardOffers();
            final Function1 function13 = new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MerchantRewardsOverviewComposable4.C101602.invoke$lambda$10$lambda$9$lambda$2((CashCardOffer) obj);
                }
            };
            final Function2 function2 = new Function2() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MerchantRewardsOverviewComposable4.C101602.invoke$lambda$10$lambda$9$lambda$3((LazyGridSpan2) obj, (CashCardOffer) obj2);
                }
            };
            final Function1 function14 = new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MerchantRewardsOverviewComposable4.C101602.invoke$lambda$10$lambda$9$lambda$4((CashCardOffer) obj);
                }
            };
            LazyVerticalGrid.items(cashCardOffers.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2$invoke$lambda$10$lambda$9$$inlined$items$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return function13.invoke(cashCardOffers.get(i));
                }
            }, new Function2<LazyGridSpan2, Integer, LazyGridSpan>() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2$invoke$lambda$10$lambda$9$$inlined$items$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyGridSpan invoke(LazyGridSpan2 lazyGridSpan2, Integer num) {
                    return LazyGridSpan.m5218boximpl(m11562invoke_orMbw(lazyGridSpan2, num.intValue()));
                }

                /* renamed from: invoke-_-orMbw, reason: not valid java name */
                public final long m11562invoke_orMbw(LazyGridSpan2 lazyGridSpan2, int i) {
                    return ((LazyGridSpan) function2.invoke(lazyGridSpan2, cashCardOffers.get(i))).getPackedValue();
                }
            }, new Function1<Integer, Object>() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2$invoke$lambda$10$lambda$9$$inlined$items$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return function14.invoke(cashCardOffers.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2$invoke$lambda$10$lambda$9$$inlined$items$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer.changed(lazyGridItemScope) ? 4 : 2);
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
                        ComposerKt.traceEventStart(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                    }
                    final CashCardOffer cashCardOffer = (CashCardOffer) cashCardOffers.get(i);
                    composer.startReplaceGroup(1404318797);
                    Clock clock2 = clock;
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(function12) | composer.changedInstance(cashCardOffer);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function15 = function12;
                        objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2$1$1$7$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function15.invoke(cashCardOffer);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    CashCardOfferComposable.CashCardOfferComposable(clock2, cashCardOffer, (Function0) objRememberedValue, null, new UserInteractionEventDescriptor(null, screen, null, Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, String.valueOf(cashCardOffer.getId()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.MERCHANT_REWARD_OFFER_CARD, null, null, 6, null), null, 37, null), composer, 0, 8);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            LazyGridScope.item$default(LazyVerticalGrid, null, new Function1() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MerchantRewardsOverviewComposable4.C101602.invoke$lambda$10$lambda$9$lambda$7((LazyGridSpan2) obj);
                }
            }, new Function0() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$MerchantRewardsOverviewComposable$2$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MerchantRewardsOverviewComposable3.Footer;
                }
            }, MerchantRewardsOverviewComposable.INSTANCE.m11558getLambda$580100738$feature_cash_merchant_rewards_externalDebug(), 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LazyGridSpan invoke$lambda$10$lambda$9$lambda$0(LazyGridSpan2 item) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            return LazyGridSpan.m5218boximpl(LazyGridSpan3.GridItemSpan(item.getMaxLineSpan()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$10$lambda$9$lambda$4(CashCardOffer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return MerchantRewardsOverviewComposable3.Offer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$10$lambda$9$lambda$2(CashCardOffer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LazyGridSpan invoke$lambda$10$lambda$9$lambda$3(LazyGridSpan2 items, CashCardOffer it) {
            Intrinsics.checkNotNullParameter(items, "$this$items");
            Intrinsics.checkNotNullParameter(it, "it");
            return LazyGridSpan.m5218boximpl(LazyGridSpan3.GridItemSpan(it.getShouldTakeFullWidth() ? items.getMaxLineSpan() : 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LazyGridSpan invoke$lambda$10$lambda$9$lambda$7(LazyGridSpan2 item) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            return LazyGridSpan.m5218boximpl(LazyGridSpan3.GridItemSpan(item.getMaxLineSpan()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Header(Modifier modifier, final MerchantRewardsOverviewViewState merchantRewardsOverviewViewState, final Function1<? super Instant, Unit> function1, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        Modifier modifier2;
        int i3;
        MerchantRewardsOverviewViewState merchantRewardsOverviewViewState2;
        MerchantRewardsStateWrapper stateWrapper;
        String strStringResource;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1228005931);
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
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                merchantRewardsOverviewViewState2 = merchantRewardsOverviewViewState;
                i3 |= composerStartRestartGroup.changedInstance(merchantRewardsOverviewViewState2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1228005931, i3, -1, "com.robinhood.android.cash.merchantrewards.ui.Header (MerchantRewardsOverviewComposable.kt:144)");
                }
                stateWrapper = merchantRewardsOverviewViewState2.getStateWrapper();
                if (stateWrapper.getState() == null && stateWrapper.getHasRewards()) {
                    composerStartRestartGroup.startReplaceGroup(1007001866);
                    strStringResource = StringResources_androidKt.stringResource(C10127R.string.cash_merchant_rewards_overview_subtitle_reward_history, new Object[]{Money.format$default(stateWrapper.getState().getTotalReward(), null, false, null, false, 0, null, false, null, false, false, 1023, null), LocalDateFormatter.LONG_WITHOUT_DAY.format(Instants.toLocalDate$default(stateWrapper.getState().getStartAt(), null, 1, null))}, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1007259197);
                    strStringResource = StringResources_androidKt.stringResource(C10127R.string.cash_merchant_rewards_overview_subtitle, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier modifierHeight = Intrinsic3.height(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Intrinsic4.Min);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Horizontal start = arrangement.getStart();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierHeight);
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
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
                String strStringResource2 = StringResources_androidKt.stringResource(C10127R.string.cash_merchant_rewards_overview_title, composerStartRestartGroup, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                String str = strStringResource;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8186);
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM(), 0.0f, 9, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), 0, bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), 0L, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 26);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(1040190662);
                if (stateWrapper.getHasRewards()) {
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2114923883, true, new MerchantRewardsOverviewComposable5(stateWrapper, function1), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composer2 = composerStartRestartGroup;
                ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C10127R.drawable.svg_merchantrewards_overview_card), null, null, null, 0, null, composer2, 0, 62), (String) null, SizeKt.m5175widthInVpY3zN4(companion3, C2002Dp.m7995constructorimpl(0), C2002Dp.m7995constructorimpl(120)), companion.getCenterEnd(), ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, 28080, 96);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MerchantRewardsOverviewComposable4.Header$lambda$4(modifier3, merchantRewardsOverviewViewState, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        merchantRewardsOverviewViewState2 = merchantRewardsOverviewViewState;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            stateWrapper = merchantRewardsOverviewViewState2.getStateWrapper();
            if (stateWrapper.getState() == null) {
                composerStartRestartGroup.startReplaceGroup(1007259197);
                strStringResource = StringResources_androidKt.stringResource(C10127R.string.cash_merchant_rewards_overview_subtitle, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierHeight2 = Intrinsic3.height(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Intrinsic4.Min);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Horizontal start2 = arrangement2.getStart();
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(start2, companion4.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierHeight2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierWeight$default2 = Row5.weight$default(row62, companion32, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        String strStringResource22 = StringResources_androidKt.stringResource(C10127R.string.cash_merchant_rewards_overview_title, composerStartRestartGroup, 0);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        String str2 = strStringResource;
                        Modifier modifier52 = modifier4;
                        BentoText2.m20747BentoText38GnDrw(strStringResource22, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8186);
                        Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21591getLargeD9Ej5fM(), 0.0f, 9, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                        Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                            BentoMarkdownText2.BentoMarkdownText(str2, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), 0, bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), 0L, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 26);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.startReplaceGroup(1040190662);
                            if (stateWrapper.getHasRewards()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            composer2 = composerStartRestartGroup;
                            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C10127R.drawable.svg_merchantrewards_overview_card), null, null, null, 0, null, composer2, 0, 62), (String) null, SizeKt.m5175widthInVpY3zN4(companion32, C2002Dp.m7995constructorimpl(0), C2002Dp.m7995constructorimpl(120)), companion4.getCenterEnd(), ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, 28080, 96);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Footer(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2144641525);
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
                ComposerKt.traceEventStart(-2144641525, i3, -1, "com.robinhood.android.cash.merchantrewards.ui.Footer (MerchantRewardsOverviewComposable.kt:206)");
            }
            int i5 = C10127R.string.cash_merchant_rewards_disclosure;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(i5, bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), 0L, (LinkInteractionListener) null, composerStartRestartGroup, 0, 12), modifier3, null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composer2, (i3 << 3) & 112, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MerchantRewardsOverviewComposable4.Footer$lambda$5(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
