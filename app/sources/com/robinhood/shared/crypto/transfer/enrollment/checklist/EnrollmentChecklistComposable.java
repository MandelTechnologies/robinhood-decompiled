package com.robinhood.shared.crypto.transfer.enrollment.checklist;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EnrollmentChecklistComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001a,\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011H\u0002¨\u0006\u0012²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u008a\u0084\u0002"}, m3636d2 = {"EnrollmentChecklistComposable", "", "viewState", "Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2ViewState;", "onVerifyIdentity", "Lkotlin/Function0;", "onSetup2fa", "(Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2ViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "logChecklistRowEvent", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "descriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "identifier", "", "eventType", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "Lcom/robinhood/rosetta/eventlogging/EventType;", "feature-crypto-transfer_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class EnrollmentChecklistComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnrollmentChecklistComposable$lambda$13(EnrollmentChecklistV2ViewState enrollmentChecklistV2ViewState, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        EnrollmentChecklistComposable(enrollmentChecklistV2ViewState, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void EnrollmentChecklistComposable(final EnrollmentChecklistV2ViewState viewState, final Function0<Unit> onVerifyIdentity, Function0<Unit> onSetup2fa, Composer composer, final int i) {
        int i2;
        CharSequence text;
        final EventLogger eventLogger;
        Object obj;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        final Function0<Unit> function0;
        boolean z3;
        final Function0<Unit> function02;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onVerifyIdentity, "onVerifyIdentity");
        Intrinsics.checkNotNullParameter(onSetup2fa, "onSetup2fa");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1857863552);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onVerifyIdentity) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSetup2fa) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = onVerifyIdentity;
            function0 = onSetup2fa;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1857863552, i2, -1, "com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistComposable (EnrollmentChecklistComposable.kt:38)");
            }
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            int i6 = i2;
            LottieAnimation2.LottieAnimation(EnrollmentChecklistComposable$lambda$10$lambda$0(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(bentoTheme.getColors(composerStartRestartGroup, i5).getIsDay() ? C37934R.raw.lottie_enrollment_checklist_light : C37934R.raw.lottie_enrollment_checklist_dark)), null, null, null, null, null, composerStartRestartGroup, 0, 62)), column6.align(PaddingKt.m5144paddingVpY3zN4$default(AspectRatio3.aspectRatio$default(companion, 1.1818181f, false, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21596getXxlargeD9Ej5fM(), 1, null), companion2.getCenterHorizontally()), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composerStartRestartGroup, 0, 0, 0, 2097148);
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_enrollment_checklist_v2_title, composerStartRestartGroup, 0), PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getBookCoverCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
            ChecklistItem kycItem = viewState.getKycItem();
            final boolean zIsEnabled = kycItem.isEnabled();
            BentoBaseRowState.Start.NumberPog numberPog = new BentoBaseRowState.Start.NumberPog(1);
            StringResource primaryText = kycItem.getPrimaryText();
            int i7 = StringResource.$stable;
            String string2 = StringResource2.getString(primaryText, composerStartRestartGroup, i7);
            StringResource secondaryText = kycItem.getSecondaryText();
            composerStartRestartGroup.startReplaceGroup(-2083509901);
            if (secondaryText == null) {
                text = null;
            } else {
                Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                text = secondaryText.getText(resources);
            }
            composerStartRestartGroup.endReplaceGroup();
            String string3 = text != null ? text.toString() : null;
            ServerToBentoAssetMapper2 icon = kycItem.getIcon();
            BentoBaseRowState.Meta.Icon icon2 = icon != null ? new BentoBaseRowState.Meta.Icon(icon, "", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null) : null;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i6 & 112) == 32) | composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changed(zIsEnabled);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                eventLogger = current;
                i3 = i6;
                i4 = 2;
                z = true;
                obj = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EnrollmentChecklistComposable.m2778x1ef0d78(viewState, zIsEnabled, onVerifyIdentity, eventLogger, userInteractionEventDescriptor);
                    }
                };
                z2 = zIsEnabled;
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                eventLogger = current;
                z2 = zIsEnabled;
                obj = objRememberedValue;
                i4 = 2;
                z = true;
                i3 = i6;
            }
            composerStartRestartGroup.endReplaceGroup();
            int i8 = BentoBaseRowState.Start.NumberPog.$stable;
            int i9 = BentoBaseRowState.Meta.Icon.$stable;
            int i10 = i3;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, numberPog, string2, string3, null, icon2, null, false, z2, false, 0L, (Function0) obj, composerStartRestartGroup, (i8 << 3) | (i9 << 15), 0, 1745);
            ChecklistItem twoFactorItem = viewState.getTwoFactorItem();
            final boolean zIsEnabled2 = twoFactorItem.isEnabled();
            BentoBaseRowState.Start.NumberPog numberPog2 = new BentoBaseRowState.Start.NumberPog(i4);
            String string4 = StringResource2.getString(twoFactorItem.getPrimaryText(), composerStartRestartGroup, i7);
            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_enrollment_checklist_two_factor_eta, composerStartRestartGroup, 0);
            ServerToBentoAssetMapper2 icon3 = twoFactorItem.getIcon();
            BentoBaseRowState.Meta.Icon icon4 = icon3 != null ? new BentoBaseRowState.Meta.Icon(icon3, "", (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null) : null;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changed(zIsEnabled2) | ((i10 & 896) == 256 ? z : false);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                function0 = onSetup2fa;
                Function0 function03 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EnrollmentChecklistComposable.m2779xd314d1f8(viewState, zIsEnabled2, function0, eventLogger, userInteractionEventDescriptor);
                    }
                };
                z3 = zIsEnabled2;
                composerStartRestartGroup.updateRememberedValue(function03);
                objRememberedValue2 = function03;
            } else {
                function0 = onSetup2fa;
                z3 = zIsEnabled2;
            }
            composerStartRestartGroup.endReplaceGroup();
            function02 = onVerifyIdentity;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, numberPog2, string4, strStringResource, null, icon4, null, false, z3, false, 0L, (Function0) objRememberedValue2, composerStartRestartGroup, (i8 << 3) | (i9 << 15), 0, 1745);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            Boolean boolValueOf = Boolean.valueOf(viewState.getKycRowLoggingIdentifier() != null ? z : false);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new EnrollmentChecklistComposable2(viewState, eventLogger, userInteractionEventDescriptor, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            Boolean boolValueOf2 = Boolean.valueOf(viewState.getTwoFactorRowLoggingIdentifier() != null ? z : false);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new EnrollmentChecklistComposable3(viewState, eventLogger, userInteractionEventDescriptor, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.enrollment.checklist.EnrollmentChecklistComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return EnrollmentChecklistComposable.EnrollmentChecklistComposable$lambda$13(viewState, function02, function0, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EnrollmentChecklistComposable$lambda$10$lambda$9$lambda$4$lambda$3 */
    public static final Unit m2778x1ef0d78(EnrollmentChecklistV2ViewState enrollmentChecklistV2ViewState, boolean z, Function0 function0, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        String kycRowLoggingIdentifier = enrollmentChecklistV2ViewState.getKycRowLoggingIdentifier();
        if (kycRowLoggingIdentifier != null) {
            logChecklistRowEvent(eventLogger, userInteractionEventDescriptor, kycRowLoggingIdentifier, UserInteractionEventData.EventType.TAP);
        }
        if (z) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private static final LottieComposition EnrollmentChecklistComposable$lambda$10$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EnrollmentChecklistComposable$lambda$10$lambda$9$lambda$8$lambda$7 */
    public static final Unit m2779xd314d1f8(EnrollmentChecklistV2ViewState enrollmentChecklistV2ViewState, boolean z, Function0 function0, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        String twoFactorRowLoggingIdentifier = enrollmentChecklistV2ViewState.getTwoFactorRowLoggingIdentifier();
        if (twoFactorRowLoggingIdentifier != null) {
            logChecklistRowEvent(eventLogger, userInteractionEventDescriptor, twoFactorRowLoggingIdentifier, UserInteractionEventData.EventType.TAP);
        }
        if (z) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logChecklistRowEvent(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, String str, UserInteractionEventData.EventType eventType) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.ROW, str, null, 4, null), null, 47, null), eventType), false, false, 6, null);
    }
}
