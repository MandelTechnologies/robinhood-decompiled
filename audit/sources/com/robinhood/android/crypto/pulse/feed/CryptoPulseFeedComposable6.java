package com.robinhood.android.crypto.pulse.feed;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.pulse.feed.views.CryptoPulseEmptyFeed3;
import com.robinhood.android.crypto.pulse.feed.views.CryptoPulseFeedHeader;
import com.robinhood.android.crypto.pulse.feed.views.CryptoPulseFeedItems;
import com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemState;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import rh_server_driven_ui.p531v1.PlainTextDto;
import rh_server_driven_ui.p531v1.RenderableTextDto;
import rh_server_driven_ui.p531v1.TextDto;

/* compiled from: CryptoPulseFeedComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$CryptoPulseFeedComposable$1$2, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoPulseFeedComposable6 implements Function3<PaddingValues, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Tuples2<LayoutCoordinates, CryptoPulseFeedItemState>> $expandableButtonCoordinatesAndState$delegate;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ SnapshotState4<CryptoPulseFeedViewState> $viewState$delegate;

    CryptoPulseFeedComposable6(SnapshotState4<CryptoPulseFeedViewState> snapshotState4, ScrollState scrollState, SnapshotState<Tuples2<LayoutCoordinates, CryptoPulseFeedItemState>> snapshotState) {
        this.$viewState$delegate = snapshotState4;
        this.$scrollState = scrollState;
        this.$expandableButtonCoordinatesAndState$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues it, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(it) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(643024376, i2, -1, "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposable.<anonymous>.<anonymous> (CryptoPulseFeedComposable.kt:101)");
        }
        if (CryptoPulseFeedComposable5.CryptoPulseFeedComposable$lambda$0(this.$viewState$delegate).getPulseFeedItemStates().isEmpty()) {
            composer.startReplaceGroup(785175830);
            CryptoPulseEmptyFeed3.CryptoPulseEmptyFeed(CryptoPulseFeedComposable5.CryptoPulseFeedComposable$lambda$0(this.$viewState$delegate).getDirection(), PaddingKt.padding(Modifier.INSTANCE, it), composer, 0, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(785472779);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, it), 0.0f, 1, null);
            ScrollState scrollState = this.$scrollState;
            final SnapshotState4<CryptoPulseFeedViewState> snapshotState4 = this.$viewState$delegate;
            final SnapshotState<Tuples2<LayoutCoordinates, CryptoPulseFeedItemState>> snapshotState = this.$expandableButtonCoordinatesAndState$delegate;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), scrollState, false, null, false, 14, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierVerticalScroll$default, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            CryptoPulseFeedHeader.CryptoPulseFeedHeader(CryptoPulseFeedComposable5.CryptoPulseFeedComposable$lambda$0(snapshotState4), PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), composer, 0, 0);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21591getLargeD9Ej5fM()), composer, 0);
            CryptoPulseFeedViewState cryptoPulseFeedViewStateCryptoPulseFeedComposable$lambda$0 = CryptoPulseFeedComposable5.CryptoPulseFeedComposable$lambda$0(snapshotState4);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$CryptoPulseFeedComposable$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoPulseFeedComposable6.invoke$lambda$3$lambda$2$lambda$1$lambda$0(snapshotState, (LayoutCoordinates) obj, (CryptoPulseFeedItemState) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CryptoPulseFeedItems.CryptoPulseFeedItems(cryptoPulseFeedViewStateCryptoPulseFeedComposable$lambda$0, (Function2) objRememberedValue, null, composer, 48, 4);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(36)), composer, 6);
            LocalShowPlaceholder.Loadable(CryptoPulseFeedComposable5.CryptoPulseFeedComposable$lambda$0(snapshotState4).getDisclosuresTextDto() == null, null, null, ComposableLambda3.rememberComposableLambda(1775481800, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposableKt$CryptoPulseFeedComposable$1$2$1$1$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1775481800, i4, -1, "com.robinhood.android.crypto.pulse.feed.CryptoPulseFeedComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoPulseFeedComposable.kt:132)");
                    }
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    TextDto disclosuresTextDto = CryptoPulseFeedComposable5.CryptoPulseFeedComposable$lambda$0(snapshotState4).getDisclosuresTextDto();
                    if (disclosuresTextDto == null) {
                        disclosuresTextDto = new TextDto(new RenderableTextDto(new RenderableTextDto.ConcreteDto.PlainText(new PlainTextDto(StringsKt.repeat("-", 300)))), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                    }
                    SduiText2.SduiText(disclosuresTextDto, modifierM5144paddingVpY3zN4$default, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 3072, 6);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21596getXxlargeD9Ej5fM()), composer, 0);
            composer.endNode();
            BoxKt.Box(Background3.background$default(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, 1, null), bentoTheme.getSpacing(composer, i3).m21596getXxlargeD9Ej5fM()), Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer, 0);
            composer.endNode();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState, LayoutCoordinates layoutCoordinates, CryptoPulseFeedItemState itemState) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        Intrinsics.checkNotNullParameter(itemState, "itemState");
        snapshotState.setValue(Tuples4.m3642to(layoutCoordinates, itemState));
        return Unit.INSTANCE;
    }
}
