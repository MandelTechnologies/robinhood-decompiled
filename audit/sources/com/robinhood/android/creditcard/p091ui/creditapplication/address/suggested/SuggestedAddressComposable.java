package com.robinhood.android.creditcard.p091ui.creditapplication.address.suggested;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.components.AddressCellComposable;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.suggested.SuggestedAddressComposable;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SuggestedAddressComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\"\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"SuggestedAddress", "", "onAccept", "Lkotlin/Function0;", "onKeep", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "isShipping", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;ZLandroidx/compose/runtime/Composer;I)V", "SUGGESTED_ADDRESS_TITLE_TEST_TAG", "", "SUGGESTED_ADDRESS_SUBTITLE_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.suggested.SuggestedAddressComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class SuggestedAddressComposable {
    public static final String SUGGESTED_ADDRESS_SUBTITLE_TEST_TAG = "suggested-address-subtitle-test-tag";
    public static final String SUGGESTED_ADDRESS_TITLE_TEST_TAG = "suggested-address-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuggestedAddress$lambda$0(Function0 function0, Function0 function02, AddressType addressType, boolean z, int i, Composer composer, int i2) {
        SuggestedAddress(function0, function02, addressType, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SuggestedAddress(final Function0<Unit> onAccept, final Function0<Unit> onKeep, final AddressType address, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onAccept, "onAccept");
        Intrinsics.checkNotNullParameter(onKeep, "onKeep");
        Intrinsics.checkNotNullParameter(address, "address");
        Composer composerStartRestartGroup = composer.startRestartGroup(441391562);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onAccept) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onKeep) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(address) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(441391562, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.suggested.SuggestedAddress (SuggestedAddressComposable.kt:35)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            composer2 = composerStartRestartGroup;
            CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_ADDRESS_SUGGESTION, null, null, null, 14, null), null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-816174449, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.suggested.SuggestedAddressComposableKt.SuggestedAddress.1

                /* compiled from: SuggestedAddressComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.suggested.SuggestedAddressComposableKt$SuggestedAddress$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ EventLogger $eventLogger;
                    final /* synthetic */ Function0<Unit> $onAccept;
                    final /* synthetic */ Function0<Unit> $onKeep;

                    AnonymousClass1(EventLogger eventLogger, Function0<Unit> function0, Function0<Unit> function02) {
                        this.$eventLogger = eventLogger;
                        this.$onAccept = function0;
                        this.$onKeep = function02;
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
                            ComposerKt.traceEventStart(1003277181, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.suggested.SuggestedAddress.<anonymous>.<anonymous> (SuggestedAddressComposable.kt:41)");
                        }
                        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_address_error_accept_suggested, composer, 0);
                        String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.credit_app_address_error_keep_entered, composer, 0);
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer, 6, 1);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onAccept);
                        final EventLogger eventLogger = this.$eventLogger;
                        final Function0<Unit> function0 = this.$onAccept;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.suggested.SuggestedAddressComposableKt$SuggestedAddress$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SuggestedAddressComposable.C122991.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, function0);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function02 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onKeep);
                        final EventLogger eventLogger2 = this.$eventLogger;
                        final Function0<Unit> function03 = this.$onKeep;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.suggested.SuggestedAddressComposableKt$SuggestedAddress$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SuggestedAddressComposable.C122991.AnonymousClass1.invoke$lambda$3$lambda$2(eventLogger2, function03);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, function02, strStringResource, false, null, false, (Function0) objRememberedValue2, strStringResource2, false, null, false, composer, 0, 0, 59198);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0) {
                        loggingUtils.logAccept$default(eventLogger, null, 1, null);
                        function0.invoke();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, Function0 function0) {
                        loggingUtils.logContinue$default(eventLogger, null, 1, null);
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-816174449, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.suggested.SuggestedAddress.<anonymous> (SuggestedAddressComposable.kt:40)");
                    }
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(1003277181, true, new AnonymousClass1(current, onAccept, onKeep), composer3, 54), composer3, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, false, ComposableLambda3.rememberComposableLambda(733452414, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.suggested.SuggestedAddressComposableKt.SuggestedAddress.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i3) {
                    int i4;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i3 & 6) == 0) {
                        i4 = i3 | (composer3.changed(paddingValues) ? 4 : 2);
                    } else {
                        i4 = i3;
                    }
                    if ((i4 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(733452414, i4, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.suggested.SuggestedAddress.<anonymous> (SuggestedAddressComposable.kt:59)");
                    }
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer3, i5).m21592getMediumD9Ej5fM());
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), paddingValues), 0.0f, composer3, 0, 1);
                    boolean z2 = z;
                    AddressType addressType = address;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer3, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierTestTag = TestTag3.testTag(companion, SuggestedAddressComposable.SUGGESTED_ADDRESS_TITLE_TEST_TAG);
                    String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_suggested_address_title, composer3, 0);
                    TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer3, i5).getDisplayCapsuleLarge();
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer3, 48, 0, 8124);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(z2 ? C12201R.string.credit_app_suggested_address_shipping_subtitle : C12201R.string.credit_app_suggested_address_subtitle, composer3, 0), TestTag3.testTag(companion, SuggestedAddressComposable.SUGGESTED_ADDRESS_SUBTITLE_TEST_TAG), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i5).getTextM(), composer3, 48, 0, 8124);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i5).m21593getSmallD9Ej5fM()), composer3, 0);
                    AddressCellComposable.AddressCell(addressType, composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 12582912, 384, 3966);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.suggested.SuggestedAddressComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SuggestedAddressComposable.SuggestedAddress$lambda$0(onAccept, onKeep, address, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
