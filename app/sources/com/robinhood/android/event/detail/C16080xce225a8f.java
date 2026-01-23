package com.robinhood.android.event.detail;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.ticker.DefaultTickerTextProvider;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.Channel;

/* compiled from: ConstraintLayout.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.EventDetailMultiContractListKt$ContractItem$$inlined$ConstraintLayout$1 */
/* loaded from: classes3.dex */
public final class C16080xce225a8f extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ String $contractMetadata$inlined;
    final /* synthetic */ String $contractName$inlined;
    final /* synthetic */ StringResource $contractSubTitle$inlined;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ boolean $isEnabled$inlined;
    final /* synthetic */ boolean $isSelected$inlined;
    final /* synthetic */ Function0 $onMetadataClick$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16080xce225a8f(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, boolean z, String str, StringResource stringResource, boolean z2, Function0 function0, String str2) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$isEnabled$inlined = z;
        this.$contractName$inlined = str;
        this.$contractSubTitle$inlined = stringResource;
        this.$isSelected$inlined = z2;
        this.$onMetadataClick$inlined = function0;
        this.$contractMetadata$inlined = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        long jM21427getFg30d7_KjU;
        ConstraintLayoutScope constraintLayoutScope;
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
        Modifier.Companion companion;
        BentoTheme bentoTheme;
        int i2;
        BentoTheme bentoTheme2;
        int i3;
        long jM21427getFg30d7_KjU2;
        long jM21373getBg30d7_KjU;
        BentoTheme bentoTheme3;
        int i4;
        long jM21427getFg30d7_KjU3;
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
        ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        composer.startReplaceGroup(-1568407039);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        ConstraintLayoutBaseScope3.Companion companion2 = ConstraintLayoutBaseScope3.INSTANCE;
        constraintLayoutScope2.createVerticalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2}, companion2.getPacked());
        constraintLayoutScope2.createHorizontalChain(new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component3}, companion2.getSpreadInside());
        TextOverflow.Companion companion3 = TextOverflow.INSTANCE;
        int iM7959getEllipsisgIe3tQ8 = companion3.m7959getEllipsisgIe3tQ8();
        if (this.$isEnabled$inlined) {
            composer.startReplaceGroup(1611983582);
            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
        } else {
            composer.startReplaceGroup(1611984415);
            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU();
        }
        composer.endReplaceGroup();
        Modifier.Companion companion4 = Modifier.INSTANCE;
        BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
        int i5 = BentoTheme.$stable;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, 0.0f, bentoTheme4.getSpacing(composer, i5).m21590getDefaultD9Ej5fM(), 0.0f, 11, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(constraintLayoutBaseScope4Component3) | composer.changed(constraintLayoutBaseScope4Component2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new EventDetailMultiContractListKt$ContractItem$3$1$1(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component2);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoText2.m20747BentoText38GnDrw(this.$contractName$inlined, constraintLayoutScope2.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue), Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, 0, null, composer, 817889280, 0, 15736);
        composer.startReplaceGroup(1611998680);
        StringResource stringResource = this.$contractSubTitle$inlined;
        if (stringResource != null) {
            String string2 = StringResources6.getText(stringResource, composer, StringResource.$stable).toString();
            if (this.$isEnabled$inlined) {
                composer.startReplaceGroup(360035951);
                bentoTheme3 = bentoTheme4;
                i4 = i5;
                jM21427getFg30d7_KjU3 = bentoTheme3.getColors(composer, i4).m21426getFg20d7_KjU();
            } else {
                bentoTheme3 = bentoTheme4;
                i4 = i5;
                composer.startReplaceGroup(360036815);
                jM21427getFg30d7_KjU3 = bentoTheme3.getColors(composer, i4).m21427getFg30d7_KjU();
            }
            composer.endReplaceGroup();
            TextStyle textS = bentoTheme3.getTypography(composer, i4).getTextS();
            int iM7959getEllipsisgIe3tQ82 = companion3.m7959getEllipsisgIe3tQ8();
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(constraintLayoutBaseScope4Component1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new EventDetailMultiContractListKt$ContractItem$3$2$1$1(constraintLayoutBaseScope4Component1);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            companion = companion4;
            constraintLayoutScope = constraintLayoutScope2;
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
            bentoTheme = bentoTheme3;
            i2 = i4;
            BentoText2.m20747BentoText38GnDrw(string2, constraintLayoutScope2.constrainAs(companion4, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue2), Color.m6701boximpl(jM21427getFg30d7_KjU3), null, null, null, null, iM7959getEllipsisgIe3tQ82, false, 1, 0, null, 0, textS, composer, 817889280, 0, 7544);
        } else {
            constraintLayoutScope = constraintLayoutScope2;
            constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component1;
            companion = companion4;
            bentoTheme = bentoTheme4;
            i2 = i5;
        }
        composer.endReplaceGroup();
        DefaultTickerTextProvider defaultTickerTextProvider = DefaultTickerTextProvider.INSTANCE;
        if (this.$isEnabled$inlined) {
            composer.startReplaceGroup(1612019006);
            bentoTheme2 = bentoTheme;
            i3 = i2;
            jM21427getFg30d7_KjU2 = bentoTheme2.getColors(composer, i3).m21425getFg0d7_KjU();
        } else {
            bentoTheme2 = bentoTheme;
            i3 = i2;
            composer.startReplaceGroup(1612019839);
            jM21427getFg30d7_KjU2 = bentoTheme2.getColors(composer, i3).m21427getFg30d7_KjU();
        }
        composer.endReplaceGroup();
        long j = jM21427getFg30d7_KjU2;
        TickerTextState.Style style = TickerTextState.Style.REGULAR_MEDIUM;
        Modifier.Companion companion5 = companion;
        Modifier modifierM5176widthInVpY3zN4$default = SizeKt.m5176widthInVpY3zN4$default(companion5, EventDetailMultiContractListKt.TrailingMetaTextRowFillMinWidth, 0.0f, 2, null);
        if (!this.$isEnabled$inlined) {
            composer.startReplaceGroup(-1566760351);
            jM21373getBg30d7_KjU = bentoTheme2.getColors(composer, i3).m21373getBg30d7_KjU();
            composer.endReplaceGroup();
        } else if (this.$isSelected$inlined) {
            composer.startReplaceGroup(-1566670110);
            jM21373getBg30d7_KjU = bentoTheme2.getColors(composer, i3).m21371getBg0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1566596671);
            jM21373getBg30d7_KjU = bentoTheme2.getColors(composer, i3).m21373getBg30d7_KjU();
            composer.endReplaceGroup();
        }
        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(ClickableKt.m4893clickableXHw0xAI$default(Clip.clip(Background3.m4871backgroundbw27NRU(modifierM5176widthInVpY3zN4$default, jM21373getBg30d7_KjU, EventDetailMultiContractListKt.TrailingMetaTextContainerShape), EventDetailMultiContractListKt.TrailingMetaTextContainerShape), false, null, Role.m7472boximpl(Role.INSTANCE.m7479getButtono7Vup1c()), this.$onMetadataClick$inlined, 3, null), bentoTheme2.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composer, i3).m21593getSmallD9Ej5fM());
        composer.startReplaceGroup(5004770);
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42 = constraintLayoutBaseScope4;
        boolean zChanged3 = composer.changed(constraintLayoutBaseScope42);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new EventDetailMultiContractListKt$ContractItem$3$3$1(constraintLayoutBaseScope42);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
        defaultTickerTextProvider.mo19237TickerTextFNF3uiM(constraintLayoutScope3.constrainAs(modifierM5143paddingVpY3zN4, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue3), this.$contractMetadata$inlined, j, style, composer, (DefaultTickerTextProvider.$stable << 12) | 3072);
        Color colorM21927getDividerColorQN2ZGVo = ((Styles) composer.consume(Styles2.getLocalStyles())).getRow(composer, 0).getColors().m21927getDividerColorQN2ZGVo();
        composer.startReplaceGroup(1612054560);
        long jM21373getBg30d7_KjU2 = colorM21927getDividerColorQN2ZGVo == null ? bentoTheme2.getColors(composer, i3).m21373getBg30d7_KjU() : colorM21927getDividerColorQN2ZGVo.getValue();
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        Composer.Companion companion6 = Composer.INSTANCE;
        if (objRememberedValue4 == companion6.getEmpty()) {
            objRememberedValue4 = EventDetailMultiContractListKt$ContractItem$3$4$1.INSTANCE;
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(constraintLayoutScope3.constrainAs(companion5, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue4), jM21373getBg30d7_KjU2, 0.0f, composer, 0, 4);
        composer.endReplaceGroup();
        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope4 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue5 == companion6.getEmpty()) {
            objRememberedValue5 = new Function0<Unit>() { // from class: com.robinhood.android.event.detail.EventDetailMultiContractListKt$ContractItem$$inlined$ConstraintLayout$1.1
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
                    ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope4.getContainerObject().mo8187clone());
                    if (snapshotState.getValue() == null || snapshotState2.getValue() == null) {
                        snapshotState.setValue(constraintSet3);
                        snapshotState2.setValue(snapshotState.getValue());
                    } else {
                        channel.mo8337trySendJP2dKIU(constraintSet3);
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue5, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
