package com.robinhood.android.crypto.p094ui.detail.position.bottomSheets;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.detail.position.bottomSheets.CryptoAverageCostReturnUnavailableOrPendingState;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtonState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoAverageCostReturnUnavailableOrPendingBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"CryptoAverageCostReturnUnavailableOrPendingBottomSheet", "", "state", "Lcom/robinhood/android/crypto/ui/detail/position/bottomSheets/CryptoAverageCostReturnUnavailableOrPendingState;", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/crypto/ui/detail/position/bottomSheets/CryptoAverageCostReturnUnavailableOrPendingState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.position.bottomSheets.CryptoAverageCostReturnUnavailableOrPendingBottomSheetKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoAverageCostReturnUnavailableOrPendingBottomSheet {

    /* compiled from: CryptoAverageCostReturnUnavailableOrPendingBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.ui.detail.position.bottomSheets.CryptoAverageCostReturnUnavailableOrPendingBottomSheetKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoAverageCostReturnUnavailableOrPendingState.Type.values().length];
            try {
                iArr[CryptoAverageCostReturnUnavailableOrPendingState.Type.UNAVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoAverageCostReturnUnavailableOrPendingState.Type.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAverageCostReturnUnavailableOrPendingBottomSheet$lambda$1(CryptoAverageCostReturnUnavailableOrPendingState cryptoAverageCostReturnUnavailableOrPendingState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoAverageCostReturnUnavailableOrPendingBottomSheet(cryptoAverageCostReturnUnavailableOrPendingState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoAverageCostReturnUnavailableOrPendingBottomSheet(final CryptoAverageCostReturnUnavailableOrPendingState state, final Function0<Unit> onDismiss, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        char c;
        int i5;
        int i6;
        int i7;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-869167789);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-869167789, i3, -1, "com.robinhood.android.crypto.ui.detail.position.bottomSheets.CryptoAverageCostReturnUnavailableOrPendingBottomSheet (CryptoAverageCostReturnUnavailableOrPendingBottomSheet.kt:24)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), 1, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
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
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i9).getDisplayCapsuleSmall();
                CryptoAverageCostReturnUnavailableOrPendingState.Type type2 = state.getType();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                i4 = iArr[type2.ordinal()];
                if (i4 == 1) {
                    c = 2;
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = C12757R.string.crypto_average_cost_return_pending_title;
                } else {
                    c = 2;
                    i5 = C12757R.string.crypto_average_cost_return_unavailable_title;
                }
                String strStringResource = StringResources_androidKt.stringResource(i5, composerStartRestartGroup, 0);
                TextAlign.Companion companion3 = TextAlign.INSTANCE;
                Modifier modifier5 = modifier4;
                int i10 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 48, 0, 8124);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i9).getTextM();
                i6 = iArr[state.getType().ordinal()];
                if (i6 == 1) {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i7 = C12757R.string.crypto_average_cost_return_pending_message;
                } else if (state.isCryptoUsCostBasisExperimentEnabled()) {
                    i7 = C12757R.string.crypto_average_cost_return_unavailable_message_v2;
                } else {
                    i7 = C12757R.string.crypto_average_cost_return_unavailable_message;
                }
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i7, new Object[]{state.getAssetCurrencyCode()}, composerStartRestartGroup, 0), modifierFillMaxWidth$default2, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 48, 0, 8124);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                BentoButtonKt.BentoButton(new BentoButtonState(StringResources_androidKt.stringResource(C12757R.string.crypto_average_cost_return_unavailable_or_pending_dismiss_cta, composerStartRestartGroup, 0), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, false, false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2046, (DefaultConstructorMarker) null), onDismiss, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), (String) null, composerStartRestartGroup, BentoButtonState.$stable | 384 | (i10 & 112), 8);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.position.bottomSheets.CryptoAverageCostReturnUnavailableOrPendingBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoAverageCostReturnUnavailableOrPendingBottomSheet.CryptoAverageCostReturnUnavailableOrPendingBottomSheet$lambda$1(state, onDismiss, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i92 = BentoTheme.$stable;
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM(), 1, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2);
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
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                TextStyle displayCapsuleSmall2 = bentoTheme2.getTypography(composerStartRestartGroup, i92).getDisplayCapsuleSmall();
                CryptoAverageCostReturnUnavailableOrPendingState.Type type22 = state.getType();
                int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
                i4 = iArr2[type22.ordinal()];
                if (i4 == 1) {
                }
                String strStringResource2 = StringResources_androidKt.stringResource(i5, composerStartRestartGroup, 0);
                TextAlign.Companion companion32 = TextAlign.INSTANCE;
                Modifier modifier52 = modifier4;
                int i102 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierFillMaxWidth$default3, null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall2, composerStartRestartGroup, 48, 0, 8124);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i92).getTextM();
                i6 = iArr2[state.getType().ordinal()];
                if (i6 == 1) {
                }
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i7, new Object[]{state.getAssetCurrencyCode()}, composerStartRestartGroup, 0), modifierFillMaxWidth$default22, null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textM2, composerStartRestartGroup, 48, 0, 8124);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                BentoButtonKt.BentoButton(new BentoButtonState(StringResources_androidKt.stringResource(C12757R.string.crypto_average_cost_return_unavailable_or_pending_dismiss_cta, composerStartRestartGroup, 0), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, false, false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2046, (DefaultConstructorMarker) null), onDismiss, SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), (String) null, composerStartRestartGroup, BentoButtonState.$stable | 384 | (i102 & 112), 8);
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
}
