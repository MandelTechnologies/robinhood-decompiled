package com.robinhood.android.futures.onboarding.p145ui.result;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.futures.onboarding.C17293R;
import com.robinhood.android.futures.onboarding.p145ui.result.FuturesAccountResultDuxo4;
import com.robinhood.android.shoestring.ShoeString;
import com.robinhood.android.shoestring.StringsKt;
import com.robinhood.android.shoestring.TagHandlers;
import com.robinhood.android.shoestring.handlers.Bold;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountApprovedScreen.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\f²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\u000eX\u008a\u0084\u0002"}, m3636d2 = {"AccountApprovedScreen", "", "state", "Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultViewState$Approved;", "modifier", "Landroidx/compose/ui/Modifier;", "onContinueClicked", "Lkotlin/Function0;", "(Lcom/robinhood/android/futures/onboarding/ui/result/FuturesAccountResultViewState$Approved;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PreviewAccountApprovedScreen_mib", "(Landroidx/compose/runtime/Composer;I)V", "PreviewAccountApprovedScreen_not_mib", "feature-futures-onboarding_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.onboarding.ui.result.AccountApprovedScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class AccountApprovedScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountApprovedScreen$lambda$2(FuturesAccountResultDuxo4.Approved approved, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        AccountApprovedScreen(approved, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewAccountApprovedScreen_mib$lambda$3(int i, Composer composer, int i2) {
        PreviewAccountApprovedScreen_mib(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewAccountApprovedScreen_not_mib$lambda$4(int i, Composer composer, int i2) {
        PreviewAccountApprovedScreen_not_mib(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountApprovedScreen(final FuturesAccountResultDuxo4.Approved state, Modifier modifier, final Function0<Unit> onContinueClicked, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String rhdAccountNumber;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1988137292);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988137292, i4, -1, "com.robinhood.android.futures.onboarding.ui.result.AccountApprovedScreen (AccountApprovedScreen.kt:36)");
                }
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierFillMaxSize$default, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM());
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                Modifier modifier5 = modifier4;
                LottieAnimation2.LottieAnimation(AccountApprovedScreen$lambda$1$lambda$0(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(LottieUrl.ACATS_ELIGIBLE_YES.getUrl().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62)), SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE)), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, ContentScale.INSTANCE.getFit(), false, false, null, false, null, composerStartRestartGroup, 48, 196608, 0, 2064380);
                Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                String strStringResource = StringResources_androidKt.stringResource(state.getTitleRes(), composerStartRestartGroup, 0);
                TextAlign.Companion companion3 = TextAlign.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8126);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                StringResource body = state.getBody();
                TagHandlers tagHandlers = new TagHandlers(new Bold());
                int i7 = StringResource.$stable;
                int i8 = TagHandlers.$stable;
                ShoeString shoeString = StringsKt.toShoeString(body, tagHandlers, composerStartRestartGroup, i7 | (i8 << 3));
                BentoText2.m20748BentoTextQnj7Zds(shoeString.getAnnotatedString(), null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, shoeString.getInlineContent(), null, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 0, 0, 6078);
                Spacer2.Spacer(Column5.weight$default(column6, companion2, 2.0f, false, 2, null), composerStartRestartGroup, 0);
                int i9 = C17293R.string.futures_account_approved_id_info;
                rhdAccountNumber = state.getRhdAccountNumber();
                if (rhdAccountNumber == null) {
                    rhdAccountNumber = "-";
                }
                ShoeString shoeString2 = StringsKt.toShoeString(StringResources_androidKt.stringResource(i9, new Object[]{rhdAccountNumber}, composerStartRestartGroup, 0), new TagHandlers(new Bold()), composerStartRestartGroup, i8 << 3);
                BentoText2.m20748BentoTextQnj7Zds(shoeString2.getAnnotatedString(), PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 1, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, shoeString2.getInlineContent(), null, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, 0, 0, 6072);
                BentoButtonKt.m20586BentoButtonEikTQX8(onContinueClicked, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i4 >> 6) & 14) | 384, 0, 8184);
                composer2 = composerStartRestartGroup;
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.onboarding.ui.result.AccountApprovedScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountApprovedScreen.AccountApprovedScreen$lambda$2(state, modifier3, onContinueClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(modifierFillMaxSize$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Spacer2.Spacer(Column5.weight$default(column62, companion22, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                Modifier modifier52 = modifier4;
                LottieAnimation2.LottieAnimation(AccountApprovedScreen$lambda$1$lambda$0(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(LottieUrl.ACATS_ELIGIBLE_YES.getUrl().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62)), SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE)), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, ContentScale.INSTANCE.getFit(), false, false, null, false, null, composerStartRestartGroup, 48, 196608, 0, 2064380);
                Spacer2.Spacer(Column5.weight$default(column62, companion22, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(state.getTitleRes(), composerStartRestartGroup, 0);
                TextAlign.Companion companion32 = TextAlign.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, null, null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8126);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                StringResource body2 = state.getBody();
                TagHandlers tagHandlers2 = new TagHandlers(new Bold());
                int i72 = StringResource.$stable;
                int i82 = TagHandlers.$stable;
                ShoeString shoeString3 = StringsKt.toShoeString(body2, tagHandlers2, composerStartRestartGroup, i72 | (i82 << 3));
                BentoText2.m20748BentoTextQnj7Zds(shoeString3.getAnnotatedString(), null, null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, shoeString3.getInlineContent(), null, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, 0, 0, 6078);
                Spacer2.Spacer(Column5.weight$default(column62, companion22, 2.0f, false, 2, null), composerStartRestartGroup, 0);
                int i92 = C17293R.string.futures_account_approved_id_info;
                rhdAccountNumber = state.getRhdAccountNumber();
                if (rhdAccountNumber == null) {
                }
                ShoeString shoeString22 = StringsKt.toShoeString(StringResources_androidKt.stringResource(i92, new Object[]{rhdAccountNumber}, composerStartRestartGroup, 0), new TagHandlers(new Bold()), composerStartRestartGroup, i82 << 3);
                BentoText2.m20748BentoTextQnj7Zds(shoeString22.getAnnotatedString(), PaddingKt.m5144paddingVpY3zN4$default(companion22, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 1, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, shoeString22.getInlineContent(), null, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextS(), composerStartRestartGroup, 0, 0, 6072);
                BentoButtonKt.m20586BentoButtonEikTQX8(onContinueClicked, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i4 >> 6) & 14) | 384, 0, 8184);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final LottieComposition AccountApprovedScreen$lambda$1$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final void PreviewAccountApprovedScreen_mib(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1672692947);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1672692947, i, -1, "com.robinhood.android.futures.onboarding.ui.result.PreviewAccountApprovedScreen_mib (AccountApprovedScreen.kt:102)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, AccountApprovedScreen2.INSTANCE.getLambda$1289542885$feature_futures_onboarding_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.onboarding.ui.result.AccountApprovedScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountApprovedScreen.PreviewAccountApprovedScreen_mib$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewAccountApprovedScreen_not_mib(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1721255527);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1721255527, i, -1, "com.robinhood.android.futures.onboarding.ui.result.PreviewAccountApprovedScreen_not_mib (AccountApprovedScreen.kt:123)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, AccountApprovedScreen2.INSTANCE.getLambda$1562394449$feature_futures_onboarding_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.onboarding.ui.result.AccountApprovedScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountApprovedScreen.PreviewAccountApprovedScreen_not_mib$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
