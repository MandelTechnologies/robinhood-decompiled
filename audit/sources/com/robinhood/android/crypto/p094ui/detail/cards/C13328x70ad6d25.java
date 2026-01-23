package com.robinhood.android.crypto.p094ui.detail.cards;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.node.Ref;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSet3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoTheme;
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
/* renamed from: com.robinhood.android.crypto.ui.detail.cards.CryptoLearnAndEarnPromoCardComposableKt$CryptoLearnAndEarnPromoCardComposable$lambda$6$$inlined$ConstraintLayout$1 */
/* loaded from: classes2.dex */
public final class C13328x70ad6d25 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $cardText$inlined;
    final /* synthetic */ Channel $channel;
    final /* synthetic */ Function0 $closeAction$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ SnapshotState $contentTracker;
    final /* synthetic */ SnapshotState $end;
    final /* synthetic */ Function0 $getStartedAction$inlined;
    final /* synthetic */ Integer $imageResource$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ SnapshotState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13328x70ad6d25(SnapshotState snapshotState, Ref ref, ConstraintLayoutScope constraintLayoutScope, Channel channel, SnapshotState snapshotState2, SnapshotState snapshotState3, String str, Function0 function0, Integer num, Function0 function02) {
        super(2);
        this.$contentTracker = snapshotState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = channel;
        this.$start = snapshotState2;
        this.$end = snapshotState3;
        this.$cardText$inlined = str;
        this.$getStartedAction$inlined = function0;
        this.$imageResource$inlined = num;
        this.$closeAction$inlined = function02;
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
            ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(Unit.INSTANCE);
        if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        this.$scope.reset();
        ConstraintLayoutScope constraintLayoutScope = this.$scope;
        composer.startReplaceGroup(-203039019);
        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope.createRefs();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth = SizeKt.fillMaxWidth(companion, 0.7f);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(constraintLayoutBaseScope4Component3) | composer.changed(constraintLayoutBaseScope4Component2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new CryptoLearnAndEarnPromoCardComposable2(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component2);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(modifierFillMaxWidth, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        BentoText2.m20747BentoText38GnDrw(this.$cardText$inlined, PaddingKt.m5142padding3ABfNKs(modifierConstrainAs, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextL(), composer, 0, 0, 8188);
        Modifier modifierFillMaxWidth2 = SizeKt.fillMaxWidth(companion, 0.7f);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        Composer.Companion companion2 = Composer.INSTANCE;
        if (objRememberedValue2 == companion2.getEmpty()) {
            objRememberedValue2 = CryptoLearnAndEarnPromoCardComposable3.INSTANCE;
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(constraintLayoutScope.constrainAs(modifierFillMaxWidth2, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue2), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
        BentoTextButton2.m20715BentoTextButtonPIknLig(this.$getStartedAction$inlined, StringResources_androidKt.stringResource(C12757R.string.crypto_learn_and_earn_get_started, composer, 0), modifierM5142padding3ABfNKs, new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.ARROW_RIGHT_12, BentoTextButton3.Icon.Position.Trailing), null, false, null, composer, BentoTextButton3.Icon.Size12.$stable << 9, 112);
        composer.startReplaceGroup(-145057464);
        Integer num = this.$imageResource$inlined;
        if (num != null) {
            int iIntValue = num.intValue();
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 0.3f), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 1, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = CryptoLearnAndEarnPromoCardComposable4.INSTANCE;
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            ImageKt.Image(PainterResources_androidKt.painterResource(iIntValue, composer, 0), (String) null, constraintLayoutScope.constrainAs(modifierM5144paddingVpY3zN4$default, constraintLayoutBaseScope4Component3, (Function1) objRememberedValue3), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
        }
        composer.endReplaceGroup();
        Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion2.getEmpty()) {
            objRememberedValue4 = CryptoLearnAndEarnPromoCardComposable5.INSTANCE;
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_REMOVE_FILLED_24), StringResources_androidKt.stringResource(C11048R.string.general_label_close, composer, 0), Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, i2).getNova(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), constraintLayoutScope.constrainAs(modifierM5142padding3ABfNKs2, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue4), this.$closeAction$inlined, false, composer, BentoIcon4.Size24.$stable, 32);
        composer.endReplaceGroup();
        boolean zChangedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final SnapshotState snapshotState = this.$start;
        final SnapshotState snapshotState2 = this.$end;
        final Channel channel = this.$channel;
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue5 == companion2.getEmpty()) {
            objRememberedValue5 = new Function0<Unit>() { // from class: com.robinhood.android.crypto.ui.detail.cards.CryptoLearnAndEarnPromoCardComposableKt$CryptoLearnAndEarnPromoCardComposable$lambda$6$$inlined$ConstraintLayout$1.1
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
                    ConstraintSet3 constraintSet3 = new ConstraintSet3(constraintLayoutScope2.getContainerObject().mo8187clone());
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
