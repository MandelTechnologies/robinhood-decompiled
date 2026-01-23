package com.robinhood.android.transfers.international.p266ui.confirmation;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import bff_money_movement.service.p019v1.LottieInfoDto;
import bff_money_movement.service.p019v1.StandardScreenDataDto;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DepositConfirmationComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, m3636d2 = {"DepositConfirmationComposable", "", "state", "Lbff_money_movement/service/v1/StandardScreenDataDto;", "onDoneButtonClick", "Lkotlin/Function0;", "(Lbff_money_movement/service/v1/StandardScreenDataDto;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lottie", "lottieInfo", "Lbff_money_movement/service/v1/LottieInfoDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lbff_money_movement/service/v1/LottieInfoDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-international-transfers_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.international.ui.confirmation.DepositConfirmationComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class DepositConfirmationComposable {

    /* compiled from: DepositConfirmationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.international.ui.confirmation.DepositConfirmationComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NightModeManager2.values().length];
            try {
                iArr[NightModeManager2.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NightModeManager2.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DepositConfirmationComposable$lambda$3(StandardScreenDataDto standardScreenDataDto, Function0 function0, int i, Composer composer, int i2) {
        DepositConfirmationComposable(standardScreenDataDto, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Lottie$lambda$8(LottieInfoDto lottieInfoDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Lottie(lottieInfoDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void DepositConfirmationComposable(final StandardScreenDataDto state, Function0<Unit> function0, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        Object obj;
        float f;
        final int i3;
        final Function0<Unit> onDoneButtonClick = function0;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDoneButtonClick, "onDoneButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-529748663);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDoneButtonClick) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-529748663, i2, -1, "com.robinhood.android.transfers.international.ui.confirmation.DepositConfirmationComposable (DepositConfirmationComposable.kt:32)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
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
            int i4 = i2;
            String title = state.getTitle();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            int iM7919getCentere0LSkKk = companion4.m7919getCentere0LSkKk();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5145paddingqDBjuR0(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8124);
            String subtitle_markdown = state.getSubtitle_markdown();
            BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
            TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM();
            int iM7919getCentere0LSkKk2 = companion4.m7919getCentere0LSkKk();
            int i6 = BentoMarkdownText.$stable;
            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(textM, iM7919getCentere0LSkKk2, jM21425getFg0d7_KjU, 0L, false, composerStartRestartGroup, i6 << 15, 24);
            Composer composer2 = composerStartRestartGroup;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 2, null);
            int i7 = MarkdownStyle.$stable;
            BentoMarkdownText2.BentoMarkdownText(subtitle_markdown, modifierM5146paddingqDBjuR0$default, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, i7 << 6, 24);
            LottieInfoDto lottie_info = state.getLottie_info();
            composer2.startReplaceGroup(-1281105003);
            if (lottie_info == null) {
                companion = companion2;
            } else {
                companion = companion2;
                Lottie(lottie_info, Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer2, 0, 0);
            }
            composer2.endReplaceGroup();
            String disclosure_markdown = state.getDisclosure_markdown();
            composer2.startReplaceGroup(-1281099409);
            if (disclosure_markdown == null) {
                obj = null;
                f = 0.0f;
            } else {
                obj = null;
                f = 0.0f;
                MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I2 = bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i5).getTextS(), 0, bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU(), 0L, false, composer2, i6 << 15, 26);
                composer2 = composer2;
                BentoMarkdownText2.BentoMarkdownText(disclosure_markdown, PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), markdownStyleM21100withTextStylesYhh7B2I2, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, i7 << 6, 24);
            }
            composer2.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), f, 1, obj);
            Composer composer3 = composer2;
            onDoneButtonClick = function0;
            i3 = i;
            BentoButtonKt.m20586BentoButtonEikTQX8(onDoneButtonClick, StringResources_androidKt.stringResource(C11048R.string.general_label_ok, composer2, 0), modifierFillMaxWidth$default, null, null, false, false, null, null, null, null, false, null, composer3, (i4 >> 3) & 14, 0, 8184);
            composerStartRestartGroup = composer3;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            i3 = i;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.international.ui.confirmation.DepositConfirmationComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DepositConfirmationComposable.DepositConfirmationComposable$lambda$3(state, onDoneButtonClick, i3, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final LottieComposition Lottie$lambda$4(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Lottie$lambda$5(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Lottie(final LottieInfoDto lottieInfoDto, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String light_mode_url;
        final Modifier modifier3;
        final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-552448065);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(lottieInfoDto) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-552448065, i3, -1, "com.robinhood.android.transfers.international.ui.confirmation.Lottie (DepositConfirmationComposable.kt:94)");
                }
                i4 = WhenMappings.$EnumSwitchMapping$0[Contexts7.requireBaseActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getNightModeManager().getDayNightMode().ordinal()];
                if (i4 != 1) {
                    light_mode_url = lottieInfoDto.getLight_mode_url();
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    light_mode_url = lottieInfoDto.getDark_mode_url();
                }
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(light_mode_url)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                LottieComposition lottieCompositionLottie$lambda$4 = Lottie$lambda$4(lottieCompositionResultRememberLottieComposition);
                modifier3 = modifier4;
                lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(lottieCompositionLottie$lambda$4, false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, 1572864, 958);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                LottieComposition lottieCompositionLottie$lambda$42 = Lottie$lambda$4(lottieCompositionResultRememberLottieComposition);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.international.ui.confirmation.DepositConfirmationComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(DepositConfirmationComposable.Lottie$lambda$5(lottieAnimationStateAnimateLottieCompositionAsState));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(lottieCompositionLottie$lambda$42, (Function0) objRememberedValue, modifierFillMaxWidth$default, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, 0, 0, 65528);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.international.ui.confirmation.DepositConfirmationComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DepositConfirmationComposable.Lottie$lambda$8(lottieInfoDto, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            i4 = WhenMappings.$EnumSwitchMapping$0[Contexts7.requireBaseActivityBaseContext((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getNightModeManager().getDayNightMode().ordinal()];
            if (i4 != 1) {
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(light_mode_url)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            LottieComposition lottieCompositionLottie$lambda$43 = Lottie$lambda$4(lottieCompositionResultRememberLottieComposition2);
            modifier3 = modifier4;
            lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(lottieCompositionLottie$lambda$43, false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, 1572864, 958);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            LottieComposition lottieCompositionLottie$lambda$422 = Lottie$lambda$4(lottieCompositionResultRememberLottieComposition2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.international.ui.confirmation.DepositConfirmationComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(DepositConfirmationComposable.Lottie$lambda$5(lottieAnimationStateAnimateLottieCompositionAsState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(lottieCompositionLottie$lambda$422, (Function0) objRememberedValue, modifierFillMaxWidth$default2, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, 0, 0, 65528);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
