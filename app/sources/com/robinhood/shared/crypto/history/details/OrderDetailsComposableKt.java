package com.robinhood.shared.crypto.history.details;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MovableContent2;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowKt;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowState;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.common.contracts.PdfRendererIntentKey;
import com.robinhood.shared.crypto.history.details.OrderDetailViewState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OrderDetailsComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a_\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"OrderDetailsComposable", "", "T", "viewState", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState;", "onBentoDataRowTapped", "Lkotlin/Function1;", "onOrderButtonTapped", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onBannerCtaClicked", "(Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DisclaimerText", "disclaimerText", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent;", "(Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState$DisclaimerTextContent;Landroidx/compose/runtime/Composer;I)V", "lib-history-details_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class OrderDetailsComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisclaimerText$lambda$10(OrderDetailViewState.DisclaimerTextContent disclaimerTextContent, int i, Composer composer, int i2) {
        DisclaimerText(disclaimerTextContent, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderDetailsComposable$lambda$7(OrderDetailViewState orderDetailViewState, Function1 function1, Function0 function0, Modifier modifier, Function0 function02, int i, int i2, Composer composer, int i3) {
        OrderDetailsComposable(orderDetailViewState, function1, function0, modifier, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void OrderDetailsComposable(final OrderDetailViewState<T> viewState, final Function1<? super T, Unit> onBentoDataRowTapped, final Function0<Unit> onOrderButtonTapped, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        int i5;
        final Function2<Composer, Integer, Unit> function2MovableContentOf;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onBentoDataRowTapped, "onBentoDataRowTapped");
        Intrinsics.checkNotNullParameter(onOrderButtonTapped, "onOrderButtonTapped");
        Composer composerStartRestartGroup = composer.startRestartGroup(-129445128);
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
            i3 |= composerStartRestartGroup.changedInstance(onBentoDataRowTapped) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOrderButtonTapped) ? 256 : 128;
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
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                i5 = i3;
                if ((i5 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    function03 = function02;
                    composer2 = composerStartRestartGroup;
                } else {
                    Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    final Function0<Unit> function04 = i4 == 0 ? null : function02;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-129445128, i5, -1, "com.robinhood.shared.crypto.history.details.OrderDetailsComposable (OrderDetailsComposable.kt:41)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    final long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU();
                    final long jM21372getBg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21372getBg20d7_KjU();
                    function2MovableContentOf = MovableContent2.movableContentOf(ComposableLambda3.rememberComposableLambda(722783646, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$OrderDetailsComposable$banner$1
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
                                ComposerKt.traceEventStart(722783646, i8, -1, "com.robinhood.shared.crypto.history.details.OrderDetailsComposable.<anonymous> (OrderDetailsComposable.kt:45)");
                            }
                            OrderDetailViewState.InfoBannerContent banner = viewState.getBanner();
                            if (banner != null) {
                                Function0<Unit> function05 = function04;
                                long j = jM21425getFg0d7_KjU;
                                long j2 = jM21372getBg20d7_KjU;
                                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                                StringResource text = banner.getText();
                                int i9 = StringResource.$stable;
                                String string2 = StringResource2.getString(text, composer3, i9);
                                StringResource ctaText = banner.getCtaText();
                                composer3.startReplaceGroup(-1189610807);
                                String string3 = ctaText != null ? StringResource2.getString(ctaText, composer3, i9) : null;
                                composer3.endReplaceGroup();
                                BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, string2, null, string3, function05, null, j, j2, composer3, 0, 36);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54));
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changed(function2MovableContentOf) | ((i5 & 112) != 32) | ((i5 & 896) == 256);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OrderDetailsComposableKt.OrderDetailsComposable$lambda$6$lambda$5(viewState, function2MovableContentOf, onBentoDataRowTapped, onOrderButtonTapped, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifier2 = modifier3;
                    composer2 = composerStartRestartGroup;
                    LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function03 = function04;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return OrderDetailsComposableKt.OrderDetailsComposable$lambda$7(viewState, onBentoDataRowTapped, onOrderButtonTapped, modifier2, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            function02 = function0;
            i5 = i3;
            if ((i5 & 9363) == 9362) {
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i72 = BentoTheme.$stable;
                final long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU();
                final long jM21372getBg20d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i72).m21372getBg20d7_KjU();
                function2MovableContentOf = MovableContent2.movableContentOf(ComposableLambda3.rememberComposableLambda(722783646, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$OrderDetailsComposable$banner$1
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
                            ComposerKt.traceEventStart(722783646, i8, -1, "com.robinhood.shared.crypto.history.details.OrderDetailsComposable.<anonymous> (OrderDetailsComposable.kt:45)");
                        }
                        OrderDetailViewState.InfoBannerContent banner = viewState.getBanner();
                        if (banner != null) {
                            Function0<Unit> function05 = function04;
                            long j = jM21425getFg0d7_KjU2;
                            long j2 = jM21372getBg20d7_KjU2;
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                            StringResource text = banner.getText();
                            int i9 = StringResource.$stable;
                            String string2 = StringResource2.getString(text, composer3, i9);
                            StringResource ctaText = banner.getCtaText();
                            composer3.startReplaceGroup(-1189610807);
                            String string3 = ctaText != null ? StringResource2.getString(ctaText, composer3, i9) : null;
                            composer3.endReplaceGroup();
                            BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, string2, null, string3, function05, null, j, j2, composer3, 0, 36);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54));
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changed(function2MovableContentOf) | ((i5 & 112) != 32) | ((i5 & 896) == 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OrderDetailsComposableKt.OrderDetailsComposable$lambda$6$lambda$5(viewState, function2MovableContentOf, onBentoDataRowTapped, onOrderButtonTapped, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier2 = modifier3;
                    composer2 = composerStartRestartGroup;
                    LazyDslKt.LazyColumn(modifierFillMaxSize$default2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 510);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function03 = function04;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        function02 = function0;
        i5 = i3;
        if ((i5 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OrderDetailsComposable$lambda$6$lambda$5(final OrderDetailViewState orderDetailViewState, final Function2 function2, final Function1 function1, final Function0 function0, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.stickyHeader$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1128741815, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$OrderDetailsComposable$1$1$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope stickyHeader, int i, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
                if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1128741815, i2, -1, "com.robinhood.shared.crypto.history.details.OrderDetailsComposable.<anonymous>.<anonymous>.<anonymous> (OrderDetailsComposable.kt:58)");
                }
                boolean zIsLoading = orderDetailViewState.getHeaderState().isLoading();
                final OrderDetailViewState<T> orderDetailViewState2 = orderDetailViewState;
                LocalShowPlaceholder.Loadable(zIsLoading, null, null, ComposableLambda3.rememberComposableLambda(1391682887, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$OrderDetailsComposable$1$1$1.1
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
                            ComposerKt.traceEventStart(1391682887, i3, -1, "com.robinhood.shared.crypto.history.details.OrderDetailsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderDetailsComposable.kt:59)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null);
                        OrderDetailViewState<T> orderDetailViewState3 = orderDetailViewState2;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer2, i4).getDisplayCapsuleMedium();
                        StringResource title = orderDetailViewState3.getHeaderState().getTitle();
                        int i5 = StringResource.$stable;
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(title, composer2, i5), null, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8190);
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(orderDetailViewState3.getHeaderState().getSubtitle(), composer2, i5), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        ComposableSingletons$OrderDetailsComposableKt composableSingletons$OrderDetailsComposableKt = ComposableSingletons$OrderDetailsComposableKt.INSTANCE;
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$OrderDetailsComposableKt.m24922getLambda$911703997$lib_history_details_externalDebug(), 3, null);
        OrderDetailViewState.InfoBannerContent banner = orderDetailViewState.getBanner();
        if ((banner != null ? banner.getPosition() : null) == OrderDetailViewState.InfoBannerContent.Position.TOP) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1302884408, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$OrderDetailsComposable$1$1$2
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
                        ComposerKt.traceEventStart(-1302884408, i, -1, "com.robinhood.shared.crypto.history.details.OrderDetailsComposable.<anonymous>.<anonymous>.<anonymous> (OrderDetailsComposable.kt:77)");
                    }
                    function2.invoke(composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, composableSingletons$OrderDetailsComposableKt.m24920getLambda$1723399247$lib_history_details_externalDebug(), 3, null);
        }
        final ImmutableList timelineRowContents = orderDetailViewState.getTimelineRowContents();
        final C37695x82f87937 c37695x82f87937 = new Function1() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$OrderDetailsComposable$lambda$6$lambda$5$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(OrderDetailViewState.TimelineRowContent<T> timelineRowContent) {
                return null;
            }
        };
        LazyColumn.items(timelineRowContents.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$OrderDetailsComposable$lambda$6$lambda$5$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c37695x82f87937.invoke(timelineRowContents.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$OrderDetailsComposable$lambda$6$lambda$5$$inlined$items$default$4
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
                Timeline.InfoAction infoActionCopy$default;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                final OrderDetailViewState.TimelineRowContent timelineRowContent = (OrderDetailViewState.TimelineRowContent) timelineRowContents.get(i);
                composer.startReplaceGroup(-597624575);
                BentoTimelineRowState timelineRowState = timelineRowContent.getTimelineRowState();
                Timeline.InfoAction infoAction = timelineRowContent.getTimelineRowState().getInfoAction();
                composer.startReplaceGroup(-1958936710);
                if (infoAction == null) {
                    infoActionCopy$default = null;
                } else {
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(function1) | composer.changedInstance(timelineRowContent);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function12 = function1;
                        objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$OrderDetailsComposable$1$1$3$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                Function1<T, Unit> function13 = function12;
                                Object tapAction = timelineRowContent.getTapAction();
                                if (tapAction == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                function13.invoke(tapAction);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    infoActionCopy$default = Timeline.InfoAction.copy$default(infoAction, null, (Function0) objRememberedValue, 1, null);
                }
                composer.endReplaceGroup();
                BentoTimelineRowKt.BentoTimelineRow(BentoTimelineRowState.m21002copyxc7CsRM$default(timelineRowState, null, null, null, infoActionCopy$default, null, null, null, null, null, false, null, null, null, null, false, false, 0, false, 0, false, false, false, null, null, 16777207, null), null, composer, BentoTimelineRowState.$stable, 2);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        final ImmutableList dataRowContents = orderDetailViewState.getDataRowContents();
        final C37699x82f8793b c37699x82f8793b = new Function1() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$OrderDetailsComposable$lambda$6$lambda$5$$inlined$items$default$5
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(OrderDetailViewState.DataRowContent<T> dataRowContent) {
                return null;
            }
        };
        LazyColumn.items(dataRowContents.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$OrderDetailsComposable$lambda$6$lambda$5$$inlined$items$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c37699x82f8793b.invoke(dataRowContents.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$OrderDetailsComposable$lambda$6$lambda$5$$inlined$items$default$8
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
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                final OrderDetailViewState.DataRowContent dataRowContent = (OrderDetailViewState.DataRowContent) dataRowContents.get(i);
                composer.startReplaceGroup(-2054600621);
                Modifier.Companion companion = Modifier.INSTANCE;
                boolean z = dataRowContent.getTapAction() != null;
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(dataRowContent);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$OrderDetailsComposable$1$1$4$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Function1<T, Unit> function13 = function12;
                            Object tapAction = dataRowContent.getTapAction();
                            if (tapAction == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            function13.invoke(tapAction);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoDataRowKt.BentoDataRow(dataRowContent.getBentoDataRowState(), ClickableKt.m4893clickableXHw0xAI$default(companion, z, null, null, (Function0) objRememberedValue, 6, null), null, composer, BentoDataRowState.$stable, 4);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$OrderDetailsComposableKt.getLambda$835916652$lib_history_details_externalDebug(), 3, null);
        OrderDetailViewState.InfoBannerContent banner2 = orderDetailViewState.getBanner();
        if ((banner2 != null ? banner2.getPosition() : null) == OrderDetailViewState.InfoBannerContent.Position.BOTTOM) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1426303567, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$OrderDetailsComposable$1$1$5
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
                        ComposerKt.traceEventStart(-1426303567, i, -1, "com.robinhood.shared.crypto.history.details.OrderDetailsComposable.<anonymous>.<anonymous>.<anonymous> (OrderDetailsComposable.kt:103)");
                    }
                    function2.invoke(composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, composableSingletons$OrderDetailsComposableKt.m24921getLambda$1814138022$lib_history_details_externalDebug(), 3, null);
        }
        final OrderDetailViewState.DisclaimerTextContent disclaimerText = orderDetailViewState.getDisclaimerText();
        if (disclaimerText != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(260700343, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$OrderDetailsComposable$1$1$6$1
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
                        ComposerKt.traceEventStart(260700343, i, -1, "com.robinhood.shared.crypto.history.details.OrderDetailsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OrderDetailsComposable.kt:107)");
                    }
                    OrderDetailsComposableKt.DisclaimerText(disclaimerText, composer, StringResource.$stable);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        OrderDetailViewState.ButtonState buttonState = orderDetailViewState.getButtonState();
        if (buttonState != null && buttonState.getVisible()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-525235632, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$OrderDetailsComposable$1$1$7
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
                        ComposerKt.traceEventStart(-525235632, i, -1, "com.robinhood.shared.crypto.history.details.OrderDetailsComposable.<anonymous>.<anonymous>.<anonymous> (OrderDetailsComposable.kt:110)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
                    boolean loading = orderDetailViewState.getButtonState().getLoading();
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResource2.getString(orderDetailViewState.getButtonState().getText(), composer, StringResource.$stable), modifierM21620defaultFillMaxWidthPaddingVpY3zN4, null, BentoButtons.Type.Secondary, false, loading, null, null, null, null, false, null, composer, 24576, 0, 8104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisclaimerText(final OrderDetailViewState.DisclaimerTextContent disclaimerTextContent, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-139684313);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(disclaimerTextContent) : composerStartRestartGroup.changedInstance(disclaimerTextContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-139684313, i2, -1, "com.robinhood.shared.crypto.history.details.DisclaimerText (OrderDetailsComposable.kt:126)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            if (disclaimerTextContent instanceof OrderDetailViewState.DisclaimerTextContent.Text) {
                composerStartRestartGroup.startReplaceGroup(488231589);
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(((OrderDetailViewState.DisclaimerTextContent.Text) disclaimerTextContent).getText(), composerStartRestartGroup, StringResource.$stable), modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else if (disclaimerTextContent instanceof OrderDetailViewState.DisclaimerTextContent.TextWithLink) {
                composerStartRestartGroup.startReplaceGroup(488559569);
                OrderDetailViewState.DisclaimerTextContent.TextWithLink textWithLink = (OrderDetailViewState.DisclaimerTextContent.TextWithLink) disclaimerTextContent;
                StringResource link = textWithLink.getLink();
                int i4 = StringResource.$stable;
                final String string2 = StringResource2.getString(link, composerStartRestartGroup, i4);
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                long jM21426getFg20d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU();
                TextStyle textS = bentoTheme2.getTypography(composerStartRestartGroup, i5).getTextS();
                String string3 = StringResource2.getString(textWithLink.getText(), composerStartRestartGroup, i4);
                String string4 = StringResource2.getString(textWithLink.getLinkText(), composerStartRestartGroup, i4);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(string2);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OrderDetailsComposableKt.DisclaimerText$lambda$9$lambda$8(navigator, context, string2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(string3, string4, (Function0) objRememberedValue, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, jM21426getFg20d7_KjU, 0L, textS, 0, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!Intrinsics.areEqual(disclaimerTextContent, OrderDetailViewState.DisclaimerTextContent.Loading.INSTANCE)) {
                    composerStartRestartGroup.startReplaceGroup(-1092630511);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(489278273);
                LocalShowPlaceholder.Loadable(true, null, null, ComposableSingletons$OrderDetailsComposableKt.INSTANCE.getLambda$1035668695$lib_history_details_externalDebug(), composerStartRestartGroup, 3078, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderDetailsComposableKt.DisclaimerText$lambda$10(disclaimerTextContent, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisclaimerText$lambda$9$lambda$8(Navigator navigator, Context context, String str) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, new PdfRendererIntentKey(str, ""), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }
}
