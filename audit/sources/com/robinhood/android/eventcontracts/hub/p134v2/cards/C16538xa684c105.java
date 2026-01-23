package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.CardPills;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.CardPills7;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.ScoreDivider;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.SeedIcon;
import com.robinhood.android.eventcontracts.sharedeventui.C16594R;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.LastTradePriceBar5;
import com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIcon5;
import com.robinhood.android.eventcontracts.sharedeventui.StringUtil2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$LiveEventCard$lambda$31$$inlined$ConstraintLayout$1 */
/* loaded from: classes3.dex */
public final class C16538xa684c105 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ HubNavigationCallbacks $callbacks$inlined;
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;
    final /* synthetic */ LiveEventCardViewState $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16538xa684c105(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, LiveEventCardViewState liveEventCardViewState, HubNavigationCallbacks hubNavigationCallbacks) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$state$inlined = liveEventCardViewState;
        this.$callbacks$inlined = hubNavigationCallbacks;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0603  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        long j;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChanged;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String secondaryText;
        ConstraintLayoutScope constraintLayoutScope;
        C16538xa684c105 c16538xa684c105;
        Modifier.Companion companion2;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
        BentoTheme bentoTheme;
        int i2;
        Composer composer2;
        Modifier.Companion companion3;
        BentoTheme bentoTheme2;
        int i3;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
        boolean zChanged2;
        Object objRememberedValue3;
        Composer composer3;
        boolean zChanged3;
        Object objRememberedValue4;
        String metadata;
        boolean zChanged4;
        Object objRememberedValue5;
        boolean zChanged5;
        Object objRememberedValue6;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Modifier.Companion companion4;
        String secondaryText2;
        ConstraintLayoutScope constraintLayoutScope2;
        Modifier.Companion companion5;
        BentoTheme bentoTheme3;
        int i4;
        boolean zChanged6;
        Object objRememberedValue7;
        boolean zChangedInstance;
        Object objRememberedValue8;
        boolean zChanged7;
        Object objRememberedValue9;
        boolean zChangedInstance2;
        Object objRememberedValue10;
        Object objRememberedValue11;
        boolean zChangedInstance3;
        final ConstraintLayoutScope constraintLayoutScope3;
        final SnapshotState snapshotState;
        final SnapshotState snapshotState2;
        final Channel channel;
        Object objRememberedValue12;
        int i5;
        Color colorM6701boximpl;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(Unit.INSTANCE);
        if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        this.$scope.reset();
        ConstraintLayoutScope constraintLayoutScope4 = this.$scope;
        composer.startReplaceGroup(1316323609);
        BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
        int i6 = BentoTheme.$stable;
        float fM21593getSmallD9Ej5fM = bentoTheme4.getSpacing(composer, i6).m21593getSmallD9Ej5fM();
        float fM21590getDefaultD9Ej5fM = bentoTheme4.getSpacing(composer, i6).m21590getDefaultD9Ej5fM();
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope4.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component9 = constrainedLayoutReferencesCreateRefs.component9();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component10 = constrainedLayoutReferencesCreateRefs.component10();
        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope4, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component5}, 0.0f, 2, null);
        long jM21425getFg0d7_KjU = bentoTheme4.getColors(composer, i6).m21425getFg0d7_KjU();
        Modifier.Companion companion6 = Modifier.INSTANCE;
        composer.startReplaceGroup(5004770);
        boolean zChanged8 = composer.changed(constraintLayoutBaseScope4Component9);
        Object objRememberedValue13 = composer.rememberedValue();
        if (!zChanged8) {
            j = jM21425getFg0d7_KjU;
            if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
            }
            composer.endReplaceGroup();
            LiveStatusIcon5.m14380LiveStatusIconPZHvWI(constraintLayoutScope4.constrainAs(companion6, constraintLayoutBaseScope4Component10, (Function1) objRememberedValue13), 0.0f, j, null, composer, 0, 10);
            String text = StringUtil2.getText(this.$state$inlined.getPrimaryText(), composer, StringResource.$stable);
            TextStyle textS = bentoTheme4.getTypography(composer, i6).getTextS();
            long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme4.getColors(composer, i6).m21425getFg0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(1849434622);
            objRememberedValue = composer.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = LiveEventCardKt$LiveEventCard$4$1$2$1.INSTANCE;
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoText2.m20747BentoText38GnDrw(text, PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope4.constrainAs(companion6, constraintLayoutBaseScope4Component9, (Function1) objRememberedValue), bentoTheme4.getSpacing(composer, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM6705copywmQWz5c$default), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer, 0, 0, 8184);
            composer.startReplaceGroup(-1633490746);
            zChanged = composer.changed(constraintLayoutBaseScope4Component3) | composer.changed(constraintLayoutBaseScope4Component9);
            objRememberedValue2 = composer.rememberedValue();
            if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new LiveEventCardKt$LiveEventCard$4$1$3$1(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component9);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope4.constrainAs(companion6, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue2), 0.0f, bentoTheme4.getSpacing(composer, i6).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Alignment.Companion companion7 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion7.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 54);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion8.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.useNode();
            } else {
                composer.createNode(constructor);
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion8.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion8.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion8.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion8.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            SeedIcon.SeedIcon(this.$state$inlined.getLeftContractViewState().getImageUrl(), this.$state$inlined.getLeftContractViewState().getContractColor(), PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, 0.0f, bentoTheme4.getSpacing(composer, i6).m21593getSmallD9Ej5fM(), 0.0f, 11, null), false, composer, 0, 8);
            secondaryText = this.$state$inlined.getLeftContractViewState().getSecondaryText();
            composer.startReplaceGroup(486332623);
            if (secondaryText != null) {
                constraintLayoutScope = constraintLayoutScope4;
                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component3;
                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component1;
                bentoTheme = bentoTheme4;
                i2 = i6;
                c16538xa684c105 = this;
                companion2 = companion6;
                composer2 = composer;
            } else {
                constraintLayoutScope = constraintLayoutScope4;
                c16538xa684c105 = this;
                companion2 = companion6;
                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component3;
                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component1;
                bentoTheme = bentoTheme4;
                i2 = i6;
                composer2 = composer;
                BentoText2.m20747BentoText38GnDrw(secondaryText, PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, 0.0f, bentoTheme4.getSpacing(composer, i6).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(bentoTheme4.getColors(composer, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer, i6).getTextS(), composer2, 0, 0, 8184);
            }
            composer2.endReplaceGroup();
            String primaryText = c16538xa684c105.$state$inlined.getLeftContractViewState().getPrimaryText();
            BentoTheme bentoTheme5 = bentoTheme;
            int i7 = i2;
            TextStyle textM = bentoTheme5.getTypography(composer2, i7).getTextM();
            FontWeight.Companion companion9 = FontWeight.INSTANCE;
            Modifier.Companion companion10 = companion2;
            BentoText2.m20747BentoText38GnDrw(primaryText, PaddingKt.m5146paddingqDBjuR0$default(row6.weight(companion10, 1.0f, false), 0.0f, 0.0f, bentoTheme5.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, null, companion9.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer2, 24576, 0, 8172);
            composer2.startReplaceGroup(486355476);
            if (c16538xa684c105.$state$inlined.getLeftContractViewState().isActive()) {
                companion3 = companion10;
                bentoTheme2 = bentoTheme5;
                i3 = i7;
            } else {
                BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.DOT_12);
                DayNightColor contractColor = c16538xa684c105.$state$inlined.getLeftContractViewState().getContractColor();
                composer2.startReplaceGroup(486363900);
                if (contractColor == null) {
                    colorM6701boximpl = null;
                    i5 = 0;
                } else {
                    i5 = 0;
                    colorM6701boximpl = Color.m6701boximpl(contractColor.getColor(composer2, 0));
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(486362592);
                bentoTheme2 = bentoTheme5;
                i3 = i7;
                long jM21426getFg20d7_KjU = colorM6701boximpl == null ? bentoTheme2.getColors(composer2, i3).m21426getFg20d7_KjU() : colorM6701boximpl.getValue();
                composer2.endReplaceGroup();
                companion3 = companion10;
                BentoIcon2.m20644BentoIconFU0evQE(size12, StringResources_androidKt.stringResource(C16594R.string.active_event_content_description, composer2, i5), jM21426getFg20d7_KjU, PaddingKt.m5146paddingqDBjuR0$default(companion10, 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i3).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, false, composer2, BentoIcon4.Size12.$stable, 48);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            String metadata2 = c16538xa684c105.$state$inlined.getLeftContractViewState().getMetadata();
            String str = metadata2 != null ? "-" : metadata2;
            TickerTextState.Style style = TickerTextState.Style.REGULAR_MEDIUM_BOLD;
            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer2, i3).m21425getFg0d7_KjU();
            composer2.startReplaceGroup(-1746271574);
            constraintLayoutBaseScope43 = constraintLayoutBaseScope42;
            zChanged2 = composer2.changed(constraintLayoutBaseScope43) | composer2.changed(constraintLayoutBaseScope4Component5) | composer2.changed(fM21593getSmallD9Ej5fM);
            objRememberedValue3 = composer2.rememberedValue();
            if (!zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new LiveEventCardKt$LiveEventCard$4$1$5$1(constraintLayoutBaseScope43, constraintLayoutBaseScope4Component5, fM21593getSmallD9Ej5fM);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceGroup();
            ConstraintLayoutScope constraintLayoutScope5 = constraintLayoutScope;
            composer3 = composer2;
            WrappedTickerKt.m19244TickerTextFNF3uiM(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope5.constrainAs(companion3, constraintLayoutBaseScope4, (Function1) objRememberedValue3), 0.0f, bentoTheme2.getSpacing(composer2, i3).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), str, jM21425getFg0d7_KjU2, style, composer3, 3072);
            composer3.startReplaceGroup(5004770);
            zChanged3 = composer3.changed(constraintLayoutBaseScope43);
            objRememberedValue4 = composer3.rememberedValue();
            if (!zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new LiveEventCardKt$LiveEventCard$4$1$6$1(constraintLayoutBaseScope43);
                composer3.updateRememberedValue(objRememberedValue4);
            }
            composer3.endReplaceGroup();
            ScoreDivider.ScoreDivider(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope5.constrainAs(companion3, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue4), 0.0f, bentoTheme2.getSpacing(composer3, i3).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), composer3, 0, 0);
            metadata = c16538xa684c105.$state$inlined.getRightContractViewState().getMetadata();
            if (metadata == null) {
                metadata = "-";
            }
            long jM21425getFg0d7_KjU3 = bentoTheme2.getColors(composer3, i3).m21425getFg0d7_KjU();
            composer3.startReplaceGroup(-1746271574);
            zChanged4 = composer3.changed(constraintLayoutBaseScope43) | composer3.changed(constraintLayoutBaseScope4Component5) | composer3.changed(fM21593getSmallD9Ej5fM);
            objRememberedValue5 = composer3.rememberedValue();
            if (!zChanged4 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new LiveEventCardKt$LiveEventCard$4$1$7$1(constraintLayoutBaseScope43, constraintLayoutBaseScope4Component5, fM21593getSmallD9Ej5fM);
                composer3.updateRememberedValue(objRememberedValue5);
            }
            composer3.endReplaceGroup();
            WrappedTickerKt.m19244TickerTextFNF3uiM(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope5.constrainAs(companion3, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue5), 0.0f, bentoTheme2.getSpacing(composer3, i3).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), metadata, jM21425getFg0d7_KjU3, style, composer3, 3072);
            composer3.startReplaceGroup(-1633490746);
            zChanged5 = composer3.changed(constraintLayoutBaseScope4Component4) | composer3.changed(constraintLayoutBaseScope43);
            objRememberedValue6 = composer3.rememberedValue();
            if (!zChanged5 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new LiveEventCardKt$LiveEventCard$4$1$8$1(constraintLayoutBaseScope4Component4, constraintLayoutBaseScope43);
                composer3.updateRememberedValue(objRememberedValue6);
            }
            composer3.endReplaceGroup();
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope5.constrainAs(companion3, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue6), 0.0f, bentoTheme2.getSpacing(composer3, i3).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getEnd(), companion7.getCenterVertically(), composer3, 54);
            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default2);
            Function0<ComposeUiNode> constructor2 = companion8.getConstructor();
            if (composer3.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.useNode();
            } else {
                composer3.createNode(constructor2);
            }
            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion8.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion8.getSetResolvedCompositionLocals());
            setCompositeKeyHash2 = companion8.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion8.getSetModifier());
            composer3.startReplaceGroup(-1009832703);
            if (c16538xa684c105.$state$inlined.getRightContractViewState().isActive()) {
                companion4 = companion3;
            } else {
                BentoIcon4.Size12 size122 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.DOT_12);
                DayNightColor contractColor2 = c16538xa684c105.$state$inlined.getRightContractViewState().getContractColor();
                composer3.startReplaceGroup(-1009824219);
                Color colorM6701boximpl2 = contractColor2 == null ? null : Color.m6701boximpl(contractColor2.getColor(composer3, 0));
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(-1009825558);
                long jM21426getFg20d7_KjU2 = colorM6701boximpl2 == null ? bentoTheme2.getColors(composer3, i3).m21426getFg20d7_KjU() : colorM6701boximpl2.getValue();
                composer3.endReplaceGroup();
                companion4 = companion3;
                BentoIcon2.m20644BentoIconFU0evQE(size122, StringResources_androidKt.stringResource(C16594R.string.active_event_content_description, composer3, 0), jM21426getFg20d7_KjU2, PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme2.getSpacing(composer3, i3).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composer3, BentoIcon4.Size12.$stable, 48);
            }
            composer3.endReplaceGroup();
            secondaryText2 = c16538xa684c105.$state$inlined.getRightContractViewState().getSecondaryText();
            composer3.startReplaceGroup(-1009813509);
            if (secondaryText2 != null) {
                constraintLayoutScope2 = constraintLayoutScope5;
                bentoTheme3 = bentoTheme2;
                i4 = i3;
                companion5 = companion4;
            } else {
                constraintLayoutScope2 = constraintLayoutScope5;
                companion5 = companion4;
                bentoTheme3 = bentoTheme2;
                i4 = i3;
                BentoText2.m20747BentoText38GnDrw(secondaryText2, PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme2.getSpacing(composer3, i3).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(bentoTheme2.getColors(composer3, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i3).getTextS(), composer3, 0, 0, 8184);
            }
            composer3.endReplaceGroup();
            BentoTheme bentoTheme6 = bentoTheme3;
            int i8 = i4;
            Modifier.Companion companion11 = companion5;
            BentoText2.m20747BentoText38GnDrw(c16538xa684c105.$state$inlined.getRightContractViewState().getPrimaryText(), PaddingKt.m5146paddingqDBjuR0$default(row6.weight(companion11, 1.0f, false), bentoTheme6.getSpacing(composer3, i8).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, companion9.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme6.getTypography(composer3, i8).getTextM(), composer3, 24576, 0, 8172);
            SeedIcon.SeedIcon(c16538xa684c105.$state$inlined.getRightContractViewState().getImageUrl(), c16538xa684c105.$state$inlined.getRightContractViewState().getContractColor(), PaddingKt.m5146paddingqDBjuR0$default(companion11, bentoTheme6.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), true, composer3, 3072, 0);
            composer3.endNode();
            CardPills7 pillState = c16538xa684c105.$state$inlined.getLeftContractViewState().getPillState();
            composer3.startReplaceGroup(-1224400529);
            zChanged6 = composer3.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default) | composer3.changed(c16538xa684c105.$state$inlined) | composer3.changed(constraintLayoutBaseScope4Component8) | composer3.changed(fM21590getDefaultD9Ej5fM);
            objRememberedValue7 = composer3.rememberedValue();
            if (!zChanged6 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new LiveEventCardKt$LiveEventCard$4$1$10$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default, c16538xa684c105.$state$inlined, constraintLayoutBaseScope4Component8, fM21590getDefaultD9Ej5fM);
                composer3.updateRememberedValue(objRememberedValue7);
            }
            composer3.endReplaceGroup();
            ConstraintLayoutScope constraintLayoutScope6 = constraintLayoutScope2;
            Modifier modifierConstrainAs = constraintLayoutScope6.constrainAs(companion11, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue7);
            if (c16538xa684c105.$state$inlined.isInAcqStreamlinedTradeFlowExperiment()) {
                modifierConstrainAs = ModifiersKt.autoLogEvents$default(modifierConstrainAs, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "event-card-pill-" + c16538xa684c105.$state$inlined.getLeftContractViewState().getContractId(), null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
            }
            Modifier modifier = modifierConstrainAs;
            boolean zIsInAcqStreamlinedTradeFlowExperiment = c16538xa684c105.$state$inlined.isInAcqStreamlinedTradeFlowExperiment();
            composer3.startReplaceGroup(-1633490746);
            zChangedInstance = composer3.changedInstance(c16538xa684c105.$callbacks$inlined) | composer3.changed(c16538xa684c105.$state$inlined);
            objRememberedValue8 = composer3.rememberedValue();
            if (!zChangedInstance || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new LiveEventCardKt$LiveEventCard$4$1$12$1(c16538xa684c105.$callbacks$inlined, c16538xa684c105.$state$inlined);
                composer3.updateRememberedValue(objRememberedValue8);
            }
            composer3.endReplaceGroup();
            CardPills.ContractPill(pillState, modifier, zIsInAcqStreamlinedTradeFlowExperiment, (Function0) objRememberedValue8, composer3, 0, 0);
            CardPills7 pillState2 = c16538xa684c105.$state$inlined.getRightContractViewState().getPillState();
            composer3.startReplaceGroup(-1224400529);
            zChanged7 = composer3.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default) | composer3.changed(c16538xa684c105.$state$inlined) | composer3.changed(constraintLayoutBaseScope4Component8) | composer3.changed(fM21590getDefaultD9Ej5fM);
            objRememberedValue9 = composer3.rememberedValue();
            if (!zChanged7 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new LiveEventCardKt$LiveEventCard$4$1$13$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default, c16538xa684c105.$state$inlined, constraintLayoutBaseScope4Component8, fM21590getDefaultD9Ej5fM);
                composer3.updateRememberedValue(objRememberedValue9);
            }
            composer3.endReplaceGroup();
            Modifier modifierConstrainAs2 = constraintLayoutScope6.constrainAs(companion11, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue9);
            if (c16538xa684c105.$state$inlined.isInAcqStreamlinedTradeFlowExperiment()) {
                modifierConstrainAs2 = ModifiersKt.autoLogEvents$default(modifierConstrainAs2, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "event-card-pill-" + c16538xa684c105.$state$inlined.getRightContractViewState().getContractId(), null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
            }
            Modifier modifier2 = modifierConstrainAs2;
            boolean zIsInAcqStreamlinedTradeFlowExperiment2 = c16538xa684c105.$state$inlined.isInAcqStreamlinedTradeFlowExperiment();
            composer3.startReplaceGroup(-1633490746);
            zChangedInstance2 = composer3.changedInstance(c16538xa684c105.$callbacks$inlined) | composer3.changed(c16538xa684c105.$state$inlined);
            objRememberedValue10 = composer3.rememberedValue();
            if (!zChangedInstance2 || objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new LiveEventCardKt$LiveEventCard$4$1$15$1(c16538xa684c105.$callbacks$inlined, c16538xa684c105.$state$inlined);
                composer3.updateRememberedValue(objRememberedValue10);
            }
            composer3.endReplaceGroup();
            CardPills.ContractPill(pillState2, modifier2, zIsInAcqStreamlinedTradeFlowExperiment2, (Function0) objRememberedValue10, composer3, 0, 0);
            Float progress = c16538xa684c105.$state$inlined.getProgress();
            float fFloatValue = progress == null ? progress.floatValue() : 1.0f;
            long progressBarActiveColor = c16538xa684c105.$state$inlined.getProgressBarActiveColor(composer3, 0);
            long progressBarBackgroundColor = c16538xa684c105.$state$inlined.getProgressBarBackgroundColor(composer3, 0);
            composer3.startReplaceGroup(1849434622);
            objRememberedValue11 = composer3.rememberedValue();
            if (objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = LiveEventCardKt$LiveEventCard$4$1$16$1.INSTANCE;
                composer3.updateRememberedValue(objRememberedValue11);
            }
            composer3.endReplaceGroup();
            LastTradePriceBar5.m14375LastTradePriceBareopBjH0(fFloatValue, progressBarActiveColor, progressBarBackgroundColor, constraintLayoutScope6.constrainAs(companion11, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue11), composer3, 0, 0);
            composer3.endReplaceGroup();
            zChangedInstance3 = composer3.changedInstance(c16538xa684c105.$scope) | composer3.changedInstance(c16538xa684c105.$channel);
            constraintLayoutScope3 = c16538xa684c105.$scope;
            snapshotState = c16538xa684c105.$start;
            snapshotState2 = c16538xa684c105.$end;
            channel = c16538xa684c105.$channel;
            objRememberedValue12 = composer3.rememberedValue();
            if (!zChangedInstance3 || objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = new Function0<Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$LiveEventCard$lambda$31$$inlined$ConstraintLayout$1.1
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
                        ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope3.getContainerObject().mo8187clone());
                        if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                            snapshotState.setValue(constraintSet3);
                            snapshotState2.setValue(snapshotState.getValue());
                        } else {
                            channel.mo8337trySendJP2dKIU(constraintSet3);
                        }
                    }
                };
                composer3.updateRememberedValue(objRememberedValue12);
            }
            EffectsKt.SideEffect((Function0) objRememberedValue12, composer3, 0);
            if (ComposerKt.isTraceInProgress()) {
                return;
            }
            ComposerKt.traceEventEnd();
            return;
        }
        j = jM21425getFg0d7_KjU;
        objRememberedValue13 = new LiveEventCardKt$LiveEventCard$4$1$1$1(constraintLayoutBaseScope4Component9);
        composer.updateRememberedValue(objRememberedValue13);
        composer.endReplaceGroup();
        LiveStatusIcon5.m14380LiveStatusIconPZHvWI(constraintLayoutScope4.constrainAs(companion6, constraintLayoutBaseScope4Component10, (Function1) objRememberedValue13), 0.0f, j, null, composer, 0, 10);
        String text2 = StringUtil2.getText(this.$state$inlined.getPrimaryText(), composer, StringResource.$stable);
        TextStyle textS2 = bentoTheme4.getTypography(composer, i6).getTextS();
        long jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(bentoTheme4.getColors(composer, i6).m21425getFg0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
        composer.startReplaceGroup(1849434622);
        objRememberedValue = composer.rememberedValue();
        companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(text2, PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope4.constrainAs(companion6, constraintLayoutBaseScope4Component9, (Function1) objRememberedValue), bentoTheme4.getSpacing(composer, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM6705copywmQWz5c$default2), null, null, null, null, 0, false, 0, 0, null, 0, textS2, composer, 0, 0, 8184);
        composer.startReplaceGroup(-1633490746);
        zChanged = composer.changed(constraintLayoutBaseScope4Component3) | composer.changed(constraintLayoutBaseScope4Component9);
        objRememberedValue2 = composer.rememberedValue();
        if (!zChanged) {
            objRememberedValue2 = new LiveEventCardKt$LiveEventCard$4$1$3$1(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component9);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope4.constrainAs(companion6, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue2), 0.0f, bentoTheme4.getSpacing(composer, i6).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
        Alignment.Companion companion72 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically2 = companion72.getCenterVertically();
        Arrangement arrangement2 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composer, 54);
        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default3);
        ComposeUiNode.Companion companion82 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor3 = companion82.getConstructor();
        if (composer.getApplier() == null) {
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
        }
        composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion82.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion82.getSetResolvedCompositionLocals());
        setCompositeKeyHash = companion82.getSetCompositeKeyHash();
        if (!composerM6388constructorimpl.getInserting()) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion82.getSetModifier());
        Row6 row62 = Row6.INSTANCE;
        SeedIcon.SeedIcon(this.$state$inlined.getLeftContractViewState().getImageUrl(), this.$state$inlined.getLeftContractViewState().getContractColor(), PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, 0.0f, bentoTheme4.getSpacing(composer, i6).m21593getSmallD9Ej5fM(), 0.0f, 11, null), false, composer, 0, 8);
        secondaryText = this.$state$inlined.getLeftContractViewState().getSecondaryText();
        composer.startReplaceGroup(486332623);
        if (secondaryText != null) {
        }
        composer2.endReplaceGroup();
        String primaryText2 = c16538xa684c105.$state$inlined.getLeftContractViewState().getPrimaryText();
        BentoTheme bentoTheme52 = bentoTheme;
        int i72 = i2;
        TextStyle textM2 = bentoTheme52.getTypography(composer2, i72).getTextM();
        FontWeight.Companion companion92 = FontWeight.INSTANCE;
        Modifier.Companion companion102 = companion2;
        BentoText2.m20747BentoText38GnDrw(primaryText2, PaddingKt.m5146paddingqDBjuR0$default(row62.weight(companion102, 1.0f, false), 0.0f, 0.0f, bentoTheme52.getSpacing(composer2, i72).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, null, companion92.getBold(), null, null, 0, false, 0, 0, null, 0, textM2, composer2, 24576, 0, 8172);
        composer2.startReplaceGroup(486355476);
        if (c16538xa684c105.$state$inlined.getLeftContractViewState().isActive()) {
        }
        composer2.endReplaceGroup();
        composer2.endNode();
        String metadata22 = c16538xa684c105.$state$inlined.getLeftContractViewState().getMetadata();
        if (metadata22 != null) {
        }
        TickerTextState.Style style2 = TickerTextState.Style.REGULAR_MEDIUM_BOLD;
        long jM21425getFg0d7_KjU22 = bentoTheme2.getColors(composer2, i3).m21425getFg0d7_KjU();
        composer2.startReplaceGroup(-1746271574);
        constraintLayoutBaseScope43 = constraintLayoutBaseScope42;
        zChanged2 = composer2.changed(constraintLayoutBaseScope43) | composer2.changed(constraintLayoutBaseScope4Component5) | composer2.changed(fM21593getSmallD9Ej5fM);
        objRememberedValue3 = composer2.rememberedValue();
        if (!zChanged2) {
            objRememberedValue3 = new LiveEventCardKt$LiveEventCard$4$1$5$1(constraintLayoutBaseScope43, constraintLayoutBaseScope4Component5, fM21593getSmallD9Ej5fM);
            composer2.updateRememberedValue(objRememberedValue3);
        }
        composer2.endReplaceGroup();
        ConstraintLayoutScope constraintLayoutScope52 = constraintLayoutScope;
        composer3 = composer2;
        WrappedTickerKt.m19244TickerTextFNF3uiM(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope52.constrainAs(companion3, constraintLayoutBaseScope4, (Function1) objRememberedValue3), 0.0f, bentoTheme2.getSpacing(composer2, i3).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), str, jM21425getFg0d7_KjU22, style2, composer3, 3072);
        composer3.startReplaceGroup(5004770);
        zChanged3 = composer3.changed(constraintLayoutBaseScope43);
        objRememberedValue4 = composer3.rememberedValue();
        if (!zChanged3) {
            objRememberedValue4 = new LiveEventCardKt$LiveEventCard$4$1$6$1(constraintLayoutBaseScope43);
            composer3.updateRememberedValue(objRememberedValue4);
        }
        composer3.endReplaceGroup();
        ScoreDivider.ScoreDivider(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope52.constrainAs(companion3, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue4), 0.0f, bentoTheme2.getSpacing(composer3, i3).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), composer3, 0, 0);
        metadata = c16538xa684c105.$state$inlined.getRightContractViewState().getMetadata();
        if (metadata == null) {
        }
        long jM21425getFg0d7_KjU32 = bentoTheme2.getColors(composer3, i3).m21425getFg0d7_KjU();
        composer3.startReplaceGroup(-1746271574);
        zChanged4 = composer3.changed(constraintLayoutBaseScope43) | composer3.changed(constraintLayoutBaseScope4Component5) | composer3.changed(fM21593getSmallD9Ej5fM);
        objRememberedValue5 = composer3.rememberedValue();
        if (!zChanged4) {
            objRememberedValue5 = new LiveEventCardKt$LiveEventCard$4$1$7$1(constraintLayoutBaseScope43, constraintLayoutBaseScope4Component5, fM21593getSmallD9Ej5fM);
            composer3.updateRememberedValue(objRememberedValue5);
        }
        composer3.endReplaceGroup();
        WrappedTickerKt.m19244TickerTextFNF3uiM(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope52.constrainAs(companion3, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue5), 0.0f, bentoTheme2.getSpacing(composer3, i3).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), metadata, jM21425getFg0d7_KjU32, style2, composer3, 3072);
        composer3.startReplaceGroup(-1633490746);
        zChanged5 = composer3.changed(constraintLayoutBaseScope4Component4) | composer3.changed(constraintLayoutBaseScope43);
        objRememberedValue6 = composer3.rememberedValue();
        if (!zChanged5) {
            objRememberedValue6 = new LiveEventCardKt$LiveEventCard$4$1$8$1(constraintLayoutBaseScope4Component4, constraintLayoutBaseScope43);
            composer3.updateRememberedValue(objRememberedValue6);
        }
        composer3.endReplaceGroup();
        Modifier modifierM5146paddingqDBjuR0$default22 = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope52.constrainAs(companion3, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue6), 0.0f, bentoTheme2.getSpacing(composer3, i3).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
        MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getEnd(), companion72.getCenterVertically(), composer3, 54);
        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default22);
        Function0<ComposeUiNode> constructor22 = companion82.getConstructor();
        if (composer3.getApplier() == null) {
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
        }
        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy22, companion82.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion82.getSetResolvedCompositionLocals());
        setCompositeKeyHash2 = companion82.getSetCompositeKeyHash();
        if (!composerM6388constructorimpl2.getInserting()) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion82.getSetModifier());
        composer3.startReplaceGroup(-1009832703);
        if (c16538xa684c105.$state$inlined.getRightContractViewState().isActive()) {
        }
        composer3.endReplaceGroup();
        secondaryText2 = c16538xa684c105.$state$inlined.getRightContractViewState().getSecondaryText();
        composer3.startReplaceGroup(-1009813509);
        if (secondaryText2 != null) {
        }
        composer3.endReplaceGroup();
        BentoTheme bentoTheme62 = bentoTheme3;
        int i82 = i4;
        Modifier.Companion companion112 = companion5;
        BentoText2.m20747BentoText38GnDrw(c16538xa684c105.$state$inlined.getRightContractViewState().getPrimaryText(), PaddingKt.m5146paddingqDBjuR0$default(row62.weight(companion112, 1.0f, false), bentoTheme62.getSpacing(composer3, i82).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, companion92.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme62.getTypography(composer3, i82).getTextM(), composer3, 24576, 0, 8172);
        SeedIcon.SeedIcon(c16538xa684c105.$state$inlined.getRightContractViewState().getImageUrl(), c16538xa684c105.$state$inlined.getRightContractViewState().getContractColor(), PaddingKt.m5146paddingqDBjuR0$default(companion112, bentoTheme62.getSpacing(composer3, i82).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), true, composer3, 3072, 0);
        composer3.endNode();
        CardPills7 pillState3 = c16538xa684c105.$state$inlined.getLeftContractViewState().getPillState();
        composer3.startReplaceGroup(-1224400529);
        zChanged6 = composer3.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default) | composer3.changed(c16538xa684c105.$state$inlined) | composer3.changed(constraintLayoutBaseScope4Component8) | composer3.changed(fM21590getDefaultD9Ej5fM);
        objRememberedValue7 = composer3.rememberedValue();
        if (!zChanged6) {
            objRememberedValue7 = new LiveEventCardKt$LiveEventCard$4$1$10$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default, c16538xa684c105.$state$inlined, constraintLayoutBaseScope4Component8, fM21590getDefaultD9Ej5fM);
            composer3.updateRememberedValue(objRememberedValue7);
        }
        composer3.endReplaceGroup();
        ConstraintLayoutScope constraintLayoutScope62 = constraintLayoutScope2;
        Modifier modifierConstrainAs3 = constraintLayoutScope62.constrainAs(companion112, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue7);
        if (c16538xa684c105.$state$inlined.isInAcqStreamlinedTradeFlowExperiment()) {
        }
        Modifier modifier3 = modifierConstrainAs3;
        boolean zIsInAcqStreamlinedTradeFlowExperiment3 = c16538xa684c105.$state$inlined.isInAcqStreamlinedTradeFlowExperiment();
        composer3.startReplaceGroup(-1633490746);
        zChangedInstance = composer3.changedInstance(c16538xa684c105.$callbacks$inlined) | composer3.changed(c16538xa684c105.$state$inlined);
        objRememberedValue8 = composer3.rememberedValue();
        if (!zChangedInstance) {
            objRememberedValue8 = new LiveEventCardKt$LiveEventCard$4$1$12$1(c16538xa684c105.$callbacks$inlined, c16538xa684c105.$state$inlined);
            composer3.updateRememberedValue(objRememberedValue8);
        }
        composer3.endReplaceGroup();
        CardPills.ContractPill(pillState3, modifier3, zIsInAcqStreamlinedTradeFlowExperiment3, (Function0) objRememberedValue8, composer3, 0, 0);
        CardPills7 pillState22 = c16538xa684c105.$state$inlined.getRightContractViewState().getPillState();
        composer3.startReplaceGroup(-1224400529);
        zChanged7 = composer3.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default) | composer3.changed(c16538xa684c105.$state$inlined) | composer3.changed(constraintLayoutBaseScope4Component8) | composer3.changed(fM21590getDefaultD9Ej5fM);
        objRememberedValue9 = composer3.rememberedValue();
        if (!zChanged7) {
            objRememberedValue9 = new LiveEventCardKt$LiveEventCard$4$1$13$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default, c16538xa684c105.$state$inlined, constraintLayoutBaseScope4Component8, fM21590getDefaultD9Ej5fM);
            composer3.updateRememberedValue(objRememberedValue9);
        }
        composer3.endReplaceGroup();
        Modifier modifierConstrainAs22 = constraintLayoutScope62.constrainAs(companion112, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue9);
        if (c16538xa684c105.$state$inlined.isInAcqStreamlinedTradeFlowExperiment()) {
        }
        Modifier modifier22 = modifierConstrainAs22;
        boolean zIsInAcqStreamlinedTradeFlowExperiment22 = c16538xa684c105.$state$inlined.isInAcqStreamlinedTradeFlowExperiment();
        composer3.startReplaceGroup(-1633490746);
        zChangedInstance2 = composer3.changedInstance(c16538xa684c105.$callbacks$inlined) | composer3.changed(c16538xa684c105.$state$inlined);
        objRememberedValue10 = composer3.rememberedValue();
        if (!zChangedInstance2) {
            objRememberedValue10 = new LiveEventCardKt$LiveEventCard$4$1$15$1(c16538xa684c105.$callbacks$inlined, c16538xa684c105.$state$inlined);
            composer3.updateRememberedValue(objRememberedValue10);
        }
        composer3.endReplaceGroup();
        CardPills.ContractPill(pillState22, modifier22, zIsInAcqStreamlinedTradeFlowExperiment22, (Function0) objRememberedValue10, composer3, 0, 0);
        Float progress2 = c16538xa684c105.$state$inlined.getProgress();
        if (progress2 == null) {
        }
        long progressBarActiveColor2 = c16538xa684c105.$state$inlined.getProgressBarActiveColor(composer3, 0);
        long progressBarBackgroundColor2 = c16538xa684c105.$state$inlined.getProgressBarBackgroundColor(composer3, 0);
        composer3.startReplaceGroup(1849434622);
        objRememberedValue11 = composer3.rememberedValue();
        if (objRememberedValue11 == companion.getEmpty()) {
        }
        composer3.endReplaceGroup();
        LastTradePriceBar5.m14375LastTradePriceBareopBjH0(fFloatValue, progressBarActiveColor2, progressBarBackgroundColor2, constraintLayoutScope62.constrainAs(companion112, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue11), composer3, 0, 0);
        composer3.endReplaceGroup();
        zChangedInstance3 = composer3.changedInstance(c16538xa684c105.$scope) | composer3.changedInstance(c16538xa684c105.$channel);
        constraintLayoutScope3 = c16538xa684c105.$scope;
        snapshotState = c16538xa684c105.$start;
        snapshotState2 = c16538xa684c105.$end;
        channel = c16538xa684c105.$channel;
        objRememberedValue12 = composer3.rememberedValue();
        if (!zChangedInstance3) {
            objRememberedValue12 = new Function0<Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$LiveEventCard$lambda$31$$inlined$ConstraintLayout$1.1
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
                    ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope3.getContainerObject().mo8187clone());
                    if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                        snapshotState.setValue(constraintSet3);
                        snapshotState2.setValue(snapshotState.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer3.updateRememberedValue(objRememberedValue12);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue12, composer3, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
    }
}
