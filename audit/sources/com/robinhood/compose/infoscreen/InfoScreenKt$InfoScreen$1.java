package com.robinhood.compose.infoscreen;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.infoscreen.InfoScreenFooter;
import com.robinhood.models.serverdriven.experimental.api.AspectFillRemoteImage;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: InfoScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
final class InfoScreenKt$InfoScreen$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ InfoScreenCallbacks $callbacks;
    final /* synthetic */ long $closeIconColor;
    final /* synthetic */ ImmutableList<UIComponent<GenericAction>> $content;
    final /* synthetic */ InfoScreenFooter $footer;
    final /* synthetic */ long $headerBackgroundColor;
    final /* synthetic */ AspectFillRemoteImage<GenericAction> $headerImage;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ SnapshotState4<Boolean> $showFooterDivider$delegate;
    final /* synthetic */ String $title;

    /* JADX WARN: Multi-variable type inference failed */
    InfoScreenKt$InfoScreen$1(Modifier modifier, LazyListState lazyListState, InfoScreenCallbacks infoScreenCallbacks, AspectFillRemoteImage<? extends GenericAction> aspectFillRemoteImage, long j, long j2, String str, ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList, InfoScreenFooter infoScreenFooter, SnapshotState4<Boolean> snapshotState4) {
        this.$modifier = modifier;
        this.$listState = lazyListState;
        this.$callbacks = infoScreenCallbacks;
        this.$headerImage = aspectFillRemoteImage;
        this.$headerBackgroundColor = j;
        this.$closeIconColor = j2;
        this.$title = str;
        this.$content = immutableList;
        this.$footer = infoScreenFooter;
        this.$showFooterDivider$delegate = snapshotState4;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-825372035, i, -1, "com.robinhood.compose.infoscreen.InfoScreen.<anonymous> (InfoScreen.kt:117)");
        }
        Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(this.$modifier, WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer, 6));
        LazyListState lazyListState = this.$listState;
        final InfoScreenCallbacks infoScreenCallbacks = this.$callbacks;
        final AspectFillRemoteImage<GenericAction> aspectFillRemoteImage = this.$headerImage;
        final long j = this.$headerBackgroundColor;
        final long j2 = this.$closeIconColor;
        final String str = this.$title;
        final ImmutableList<UIComponent<GenericAction>> immutableList = this.$content;
        InfoScreenFooter infoScreenFooter = this.$footer;
        SnapshotState4<Boolean> snapshotState4 = this.$showFooterDivider$delegate;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierWindowInsetsPadding);
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
        Modifier modifierWeight$default = Column5.weight$default(column6, companion3, 1.0f, false, 2, null);
        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(infoScreenCallbacks) | composer.changedInstance(aspectFillRemoteImage) | composer.changed(j) | composer.changed(j2) | composer.changed(str) | composer.changedInstance(immutableList);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Function1 function1 = new Function1() { // from class: com.robinhood.compose.infoscreen.InfoScreenKt$InfoScreen$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InfoScreenKt$InfoScreen$1.invoke$lambda$3$lambda$1$lambda$0(immutableList, infoScreenCallbacks, aspectFillRemoteImage, j, j2, str, (LazyListScope) obj);
                }
            };
            composer.updateRememberedValue(function1);
            objRememberedValue = function1;
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(modifierWeight$default, lazyListState, null, false, null, centerHorizontally, null, false, null, (Function1) objRememberedValue, composer, 196608, 476);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), InfoScreenKt.InfoScreen_dNgdfXs$lambda$4(snapshotState4) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composer, 0, 5);
        if (Intrinsics.areEqual(infoScreenFooter, InfoScreenFooter.Close.INSTANCE)) {
            composer.startReplaceGroup(734826754);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(infoScreenCallbacks);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new InfoScreenKt$InfoScreen$1$1$2$1(infoScreenCallbacks);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue2), StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0), PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion3, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
            composer2 = composer;
            composer2.endReplaceGroup();
        } else {
            if (!(infoScreenFooter instanceof InfoScreenFooter.Sdui)) {
                composer.startReplaceGroup(-807581319);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(735244696);
            ImmutableList<UIComponent<GenericAction>> components = ((InfoScreenFooter.Sdui) infoScreenFooter).getComponents();
            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
            composer.startReplaceGroup(-1772220517);
            SduiColumns.SduiColumn(components, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, infoScreenCallbacks, HorizontalPadding.Default, arrangement.getTop(), companion.getStart(), false, composer, 100663296, 0);
            composer2 = composer;
            composer2.endReplaceGroup();
            composer2.endReplaceGroup();
        }
        composer2.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$1$lambda$0(ImmutableList immutableList, final InfoScreenCallbacks infoScreenCallbacks, final AspectFillRemoteImage aspectFillRemoteImage, final long j, final long j2, final String str, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1319057646, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.compose.infoscreen.InfoScreenKt$InfoScreen$1$1$1$1$1
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
                    ComposerKt.traceEventStart(-1319057646, i, -1, "com.robinhood.compose.infoscreen.InfoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InfoScreen.kt:126)");
                }
                InfoScreenCallbacks infoScreenCallbacks2 = infoScreenCallbacks;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(infoScreenCallbacks2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new InfoScreenKt$InfoScreen$1$1$1$1$1$1$1(infoScreenCallbacks2);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                InfoScreenKt.m21678InfoScreenHeaderDTcfvLk(aspectFillRemoteImage, j, j2, (Function0) ((KFunction) objRememberedValue), null, composer, 0, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(854983483, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.compose.infoscreen.InfoScreenKt$InfoScreen$1$1$1$1$2
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
                    ComposerKt.traceEventStart(854983483, i, -1, "com.robinhood.compose.infoscreen.InfoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InfoScreen.kt:134)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium();
                BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 0, 0, 8188);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        SduiColumns.sduiItems(LazyColumn, immutableList, GenericAction.class, null, null, HorizontalPadding.Default);
        return Unit.INSTANCE;
    }
}
