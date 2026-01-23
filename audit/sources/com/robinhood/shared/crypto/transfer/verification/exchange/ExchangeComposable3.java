package com.robinhood.shared.crypto.transfer.verification.exchange;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.crypto.transfer.C37934R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ExchangeComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeScreen$2$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ExchangeComposable3 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ Function1<String, Unit> $onQueryChange;
    final /* synthetic */ ExchangeViewState $viewState;

    /* JADX WARN: Multi-variable type inference failed */
    ExchangeComposable3(FocusRequester focusRequester, ExchangeViewState exchangeViewState, Function1<? super String, Unit> function1) {
        this.$focusRequester = focusRequester;
        this.$viewState = exchangeViewState;
        this.$onQueryChange = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() <= 30) {
            function1.invoke(it);
        }
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope stickyHeader, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
        if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-256249664, i2, -1, "com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExchangeComposable.kt:119)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 1, null);
        Alignment center = Alignment.INSTANCE.getCenter();
        FocusRequester focusRequester = this.$focusRequester;
        ExchangeViewState exchangeViewState = this.$viewState;
        final Function1<String, Unit> function1 = this.$onQueryChange;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), focusRequester);
        String query = exchangeViewState.getQuery();
        String strStringResource = StringResources_androidKt.stringResource(C37934R.string.withdrawal_exchange_hint, composer, 0);
        BentoTextInput8.Icon.Size24 size24 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, null, null, 6, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(function1);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.transfer.verification.exchange.ExchangeComposableKt$ExchangeScreen$2$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ExchangeComposable3.invoke$lambda$2$lambda$1$lambda$0(function1, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextInput4.BentoTextInput(query, (Function1) objRememberedValue, modifierFocusRequester, null, strStringResource, null, null, size24, null, null, null, null, null, false, false, composer, BentoTextInput8.Icon.Size24.$stable << 21, 0, 32616);
        composer.endNode();
        Unit unit = Unit.INSTANCE;
        composer.startReplaceGroup(5004770);
        FocusRequester focusRequester2 = this.$focusRequester;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new ExchangeComposable4(focusRequester2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
