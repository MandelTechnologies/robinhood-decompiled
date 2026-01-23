package com.robinhood.shared.crypto.p375ui.settings;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.crypto.p375ui.C38572R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SetAllowlistingStatusSheetContent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"SetAllowlistingStatusSheetContent", "", "isAllowlistingRequestInFlight", "", "enablingDescription", "", "disablingDescription", "isEnablingAllowlisting", "onPrimaryButtonClick", "Lkotlin/Function0;", "onCancelButtonClick", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.settings.SetAllowlistingStatusSheetContentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SetAllowlistingStatusSheetContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SetAllowlistingStatusSheetContent$lambda$0(boolean z, String str, String str2, boolean z2, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SetAllowlistingStatusSheetContent(z, str, str2, z2, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SetAllowlistingStatusSheetContent(final boolean z, final String enablingDescription, final String disablingDescription, final boolean z2, final Function0<Unit> onPrimaryButtonClick, final Function0<Unit> onCancelButtonClick, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(enablingDescription, "enablingDescription");
        Intrinsics.checkNotNullParameter(disablingDescription, "disablingDescription");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onCancelButtonClick, "onCancelButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-54143203);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else if ((i & 6) == 0) {
            z3 = z;
            i3 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(enablingDescription) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(disablingDescription) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                z4 = z2;
                i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onPrimaryButtonClick) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onCancelButtonClick) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-54143203, i3, -1, "com.robinhood.shared.crypto.ui.settings.SetAllowlistingStatusSheetContent (SetAllowlistingStatusSheetContent.kt:35)");
                    }
                    final boolean z5 = z4;
                    final boolean z6 = z3;
                    final Modifier modifier5 = modifier4;
                    AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, "allowlist_status_toggle", null, 4, null), null, 47, null)), ComposableLambda3.rememberComposableLambda(306389768, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.settings.SetAllowlistingStatusSheetContentKt.SetAllowlistingStatusSheetContent.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            String strStringResource;
                            String strStringResource2;
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(306389768, i5, -1, "com.robinhood.shared.crypto.ui.settings.SetAllowlistingStatusSheetContent.<anonymous> (SetAllowlistingStatusSheetContent.kt:46)");
                            }
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(ModifiersKt.autoLogEvents$default(modifier5, null, true, false, false, false, false, null, 125, null), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            boolean z7 = z5;
                            String str = enablingDescription;
                            String str2 = disablingDescription;
                            Function0<Unit> function0 = onPrimaryButtonClick;
                            boolean z8 = z6;
                            Function0<Unit> function02 = onCancelButtonClick;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            if (z7) {
                                composer2.startReplaceGroup(-1342254167);
                                strStringResource = StringResources_androidKt.stringResource(C38572R.string.enable_allowlisting_bottom_sheet_title, composer2, 0);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-1342146008);
                                strStringResource = StringResources_androidKt.stringResource(C38572R.string.disable_allowlisting_bottom_sheet_title, composer2, 0);
                                composer2.endReplaceGroup();
                            }
                            TextAlign.Companion companion3 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getDisplayCapsuleSmall(), composer2, 0, 0, 8124);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM()), composer2, 0);
                            BentoText2.m20747BentoText38GnDrw(z7 ? str : str2, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextM(), composer2, 0, 0, 8126);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM()), composer2, 0);
                            Component.ComponentType componentType = Component.ComponentType.BUTTON;
                            new Component(componentType, null, null, 6, null);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, z7 ? "enable" : AnalyticsStrings.BUTTON_FRIDAY_TRADING_SETTING_DISABLE, null, 4, null), null, 47, null)), false, false, false, true, false, null, 110, null), 0.0f, 1, null);
                            if (z7) {
                                composer2.startReplaceGroup(-1340462367);
                                strStringResource2 = StringResources_androidKt.stringResource(C38572R.string.enable_allowlisting_bottom_sheet_enable_button, composer2, 0);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-1340346241);
                                strStringResource2 = StringResources_androidKt.stringResource(C38572R.string.disable_allowlisting_bottom_sheet_disable_button, composer2, 0);
                                composer2.endReplaceGroup();
                            }
                            BentoButtonKt.m20586BentoButtonEikTQX8(function0, strStringResource2, modifierFillMaxWidth$default, null, BentoButtons.Type.Primary, false, z8, null, null, null, null, false, null, composer2, 24576, 0, 8104);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM()), composer2, 0);
                            BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C38572R.string.allowlisting_bottom_sheet_cancel_button, composer2, 0), SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, "cancel", null, 4, null), null, 47, null)), false, false, false, true, false, null, 110, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 7, null), 0.0f, 1, null), null, BentoButtons.Type.Secondary, !z8, false, null, null, null, null, false, null, composer2, 24576, 0, 8136);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.settings.SetAllowlistingStatusSheetContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SetAllowlistingStatusSheetContent.SetAllowlistingStatusSheetContent$lambda$0(z, enablingDescription, disablingDescription, z2, onPrimaryButtonClick, onCancelButtonClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            modifier2 = modifier;
            if ((599187 & i3) != 599186) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final boolean z52 = z4;
                final boolean z62 = z3;
                final Modifier modifier52 = modifier4;
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, "allowlist_status_toggle", null, 4, null), null, 47, null)), ComposableLambda3.rememberComposableLambda(306389768, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.settings.SetAllowlistingStatusSheetContentKt.SetAllowlistingStatusSheetContent.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        String strStringResource;
                        String strStringResource2;
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(306389768, i5, -1, "com.robinhood.shared.crypto.ui.settings.SetAllowlistingStatusSheetContent.<anonymous> (SetAllowlistingStatusSheetContent.kt:46)");
                        }
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(ModifiersKt.autoLogEvents$default(modifier52, null, true, false, false, false, false, null, 125, null), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        boolean z7 = z52;
                        String str = enablingDescription;
                        String str2 = disablingDescription;
                        Function0<Unit> function0 = onPrimaryButtonClick;
                        boolean z8 = z62;
                        Function0<Unit> function02 = onCancelButtonClick;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        if (z7) {
                            composer2.startReplaceGroup(-1342254167);
                            strStringResource = StringResources_androidKt.stringResource(C38572R.string.enable_allowlisting_bottom_sheet_title, composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1342146008);
                            strStringResource = StringResources_androidKt.stringResource(C38572R.string.disable_allowlisting_bottom_sheet_title, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getDisplayCapsuleSmall(), composer2, 0, 0, 8124);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM()), composer2, 0);
                        BentoText2.m20747BentoText38GnDrw(z7 ? str : str2, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextM(), composer2, 0, 0, 8126);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM()), composer2, 0);
                        Component.ComponentType componentType = Component.ComponentType.BUTTON;
                        new Component(componentType, null, null, 6, null);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, z7 ? "enable" : AnalyticsStrings.BUTTON_FRIDAY_TRADING_SETTING_DISABLE, null, 4, null), null, 47, null)), false, false, false, true, false, null, 110, null), 0.0f, 1, null);
                        if (z7) {
                            composer2.startReplaceGroup(-1340462367);
                            strStringResource2 = StringResources_androidKt.stringResource(C38572R.string.enable_allowlisting_bottom_sheet_enable_button, composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1340346241);
                            strStringResource2 = StringResources_androidKt.stringResource(C38572R.string.disable_allowlisting_bottom_sheet_disable_button, composer2, 0);
                            composer2.endReplaceGroup();
                        }
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, strStringResource2, modifierFillMaxWidth$default, null, BentoButtons.Type.Primary, false, z8, null, null, null, null, false, null, composer2, 24576, 0, 8104);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM()), composer2, 0);
                        BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C38572R.string.allowlisting_bottom_sheet_cancel_button, composer2, 0), SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, "cancel", null, 4, null), null, 47, null)), false, false, false, true, false, null, 110, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), 7, null), 0.0f, 1, null), null, BentoButtons.Type.Secondary, !z8, false, null, null, null, null, false, null, composer2, 24576, 0, 8136);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z4 = z2;
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
