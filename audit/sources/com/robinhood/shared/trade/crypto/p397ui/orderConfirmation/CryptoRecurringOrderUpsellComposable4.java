package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation;

import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.trade.crypto.C40095R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoRecurringOrderUpsellComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"CryptoRecurringOrderUpsellComposable", "", "assetCurrencyCode", "", "onGetStartedClick", "Lkotlin/Function0;", "onDoneClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoRecurringOrderUpsellComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoRecurringOrderUpsellComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoRecurringOrderUpsellComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoRecurringOrderUpsellComposable$lambda$2(String str, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        CryptoRecurringOrderUpsellComposable(str, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoRecurringOrderUpsellComposablePreview$lambda$3(int i, Composer composer, int i2) {
        CryptoRecurringOrderUpsellComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoRecurringOrderUpsellComposable(final String assetCurrencyCode, final Function0<Unit> onGetStartedClick, final Function0<Unit> onDoneClick, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(assetCurrencyCode, "assetCurrencyCode");
        Intrinsics.checkNotNullParameter(onGetStartedClick, "onGetStartedClick");
        Intrinsics.checkNotNullParameter(onDoneClick, "onDoneClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(767529794);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(assetCurrencyCode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onGetStartedClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDoneClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(767529794, i3, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoRecurringOrderUpsellComposable (CryptoRecurringOrderUpsellComposable.kt:47)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Background3.m4871backgroundbw27NRU(modifier4, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM())), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeDrawing(WindowInsets.INSTANCE, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5199getHorizontalJoeWqyM()));
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding);
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
                int i6 = i3;
                Modifier modifier5 = modifier4;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_clr_rds_order_types_recurring_investment, null, false, BentoPogSize.Hero, null, null, null, composerStartRestartGroup, 27648, 102);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                String strStringResource = StringResources_androidKt.stringResource(C40095R.string.order_confirmation_crypto_recurring_upsell_title, new Object[]{assetCurrencyCode}, composerStartRestartGroup, 0);
                TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall();
                TextAlign.Companion companion3 = TextAlign.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 0, 0, 8126);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40095R.string.order_confirmation_crypto_recurring_upsell_description, new Object[]{assetCurrencyCode}, composerStartRestartGroup, 0), null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16318);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                BentoButtonKt.m20586BentoButtonEikTQX8(onGetStartedClick, StringResources_androidKt.stringResource(C40095R.string.order_confirmation_crypto_recurring_upsell_get_started, composerStartRestartGroup, 0), ModifiersKt.autoLogEvents$default(modifierFillMaxWidth$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, userInteractionEventDescriptor.getScreen(), UserInteractionEventData.Action.ENTER_RECURRING_CREATION, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RecurringContext(null, null, null, null, null, 0.0d, null, RecurringContext.UpsellType.AGGRESSIVE, 0.0d, null, null, 1919, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 33, null), true, false, false, true, false, null, 108, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i6 >> 3) & 14, 0, 8184);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                composer2 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8(onDoneClick, StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer2, ((i6 >> 6) & 14) | 24960, 0, 8168);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoRecurringOrderUpsellComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoRecurringOrderUpsellComposable4.CryptoRecurringOrderUpsellComposable$lambda$2(assetCurrencyCode, onGetStartedClick, onDoneClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierWindowInsetsPadding2 = WindowInsetsPadding6.windowInsetsPadding(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Background3.m4871backgroundbw27NRU(modifier4, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM())), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeDrawing(WindowInsets.INSTANCE, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5199getHorizontalJoeWqyM()));
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding2);
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
                int i62 = i3;
                Modifier modifier52 = modifier4;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_clr_rds_order_types_recurring_investment, null, false, BentoPogSize.Hero, null, null, null, composerStartRestartGroup, 27648, 102);
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(C40095R.string.order_confirmation_crypto_recurring_upsell_title, new Object[]{assetCurrencyCode}, composerStartRestartGroup, 0);
                TextStyle displayCapsuleSmall2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall();
                TextAlign.Companion companion32 = TextAlign.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, null, null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall2, composerStartRestartGroup, 0, 0, 8126);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40095R.string.order_confirmation_crypto_recurring_upsell_description, new Object[]{assetCurrencyCode}, composerStartRestartGroup, 0), null, null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16318);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21591getLargeD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                BentoButtonKt.m20586BentoButtonEikTQX8(onGetStartedClick, StringResources_androidKt.stringResource(C40095R.string.order_confirmation_crypto_recurring_upsell_get_started, composerStartRestartGroup, 0), ModifiersKt.autoLogEvents$default(modifierFillMaxWidth$default2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, userInteractionEventDescriptor2.getScreen(), UserInteractionEventData.Action.ENTER_RECURRING_CREATION, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RecurringContext(null, null, null, null, null, 0.0d, null, RecurringContext.UpsellType.AGGRESSIVE, 0.0d, null, null, 1919, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 33, null), true, false, false, true, false, null, 108, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i62 >> 3) & 14, 0, 8184);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                composer2 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8(onDoneClick, StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer2, ((i62 >> 6) & 14) | 24960, 0, 8168);
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

    public static final void CryptoRecurringOrderUpsellComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1700904492);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1700904492, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoRecurringOrderUpsellComposablePreview (CryptoRecurringOrderUpsellComposable.kt:116)");
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(new UserInteractionEventDescriptor(null, null, null, null, null, null, 63, null))}, CryptoRecurringOrderUpsellComposable.INSTANCE.m25861getLambda$1824270700$feature_trade_crypto_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoRecurringOrderUpsellComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoRecurringOrderUpsellComposable4.CryptoRecurringOrderUpsellComposablePreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
