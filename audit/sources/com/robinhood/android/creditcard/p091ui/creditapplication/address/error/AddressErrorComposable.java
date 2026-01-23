package com.robinhood.android.creditcard.p091ui.creditapplication.address.error;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
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
import com.robinhood.android.creditcard.p091ui.creditapplication.address.error.AddressErrorComposable;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.AddressType2;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AddressErrorComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aW\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\r\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"AddressError", "", "onHelpPress", "Lkotlin/Function0;", "onContinue", "onEdit", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "error", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressErrorType;", "isShipping", "", "isSkippable", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;Lcom/robinhood/android/models/creditcard/api/graphql/AddressErrorType;ZZLandroidx/compose/runtime/Composer;I)V", "ADDRESS_ERROR_TITLE_TEST_TAG", "", "ADDRESS_ERROR_SUBTITLE_TEST_TAG", "ADDRESS_ERROR_MESSAGE_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.error.AddressErrorComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AddressErrorComposable {
    public static final String ADDRESS_ERROR_MESSAGE_TEST_TAG = "address-error-message-test-tag";
    public static final String ADDRESS_ERROR_SUBTITLE_TEST_TAG = "address-error-subtitle-test-tag";
    public static final String ADDRESS_ERROR_TITLE_TEST_TAG = "address-error-title-test-tag";

    /* compiled from: AddressErrorComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.error.AddressErrorComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AddressType2.values().length];
            try {
                iArr[AddressType2.SKIPPABLE_INVALID_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddressType2.ZIP_CODE_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddressType2.PO_BOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AddressType2.SKIPPABLE_SUITE_REQUIRED_BUT_MISSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AddressType2.SKIPPABLE_MULTIPLE_MATCHES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AddressType2.SKIPPABLE_MISSING_OR_AMBIGUOUS_DIRECTIONAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AddressType2.SKIPPABLE_INVALID_SUITE_NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AddressType2.SKIPPABLE_INVALID_MULTI_UNIT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AddressType2.SKIPPABLE_INVALID_BUILDING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AddressType2.SKIPPABLE_DELIVERY_POINT_NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AddressType2.SKIPPABLE_UNEXPECTED_ERROR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AddressType2.INVALID_STATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AddressType2.SUITE_REQUIRED_BUT_MISSING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AddressType2.MULTIPLE_MATCHES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AddressType2.MISSING_OR_AMBIGUOUS_DIRECTIONAL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AddressType2.INVALID_SUITE_NUMBER.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[AddressType2.INVALID_MULTI_UNIT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[AddressType2.INVALID_BUILDING.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[AddressType2.DELIVERY_POINT_NOT_FOUND.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[AddressType2.UNEXPECTED_ERROR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[AddressType2.UNKNOWN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddressError$lambda$0(Function0 function0, Function0 function02, Function0 function03, AddressType addressType, AddressType2 addressType2, boolean z, boolean z2, int i, Composer composer, int i2) {
        AddressError(function0, function02, function03, addressType, addressType2, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AddressError(final Function0<Unit> onHelpPress, final Function0<Unit> onContinue, final Function0<Unit> onEdit, final AddressType address, final AddressType2 error, final boolean z, final boolean z2, Composer composer, final int i) {
        int i2;
        final int i3;
        Intrinsics.checkNotNullParameter(onHelpPress, "onHelpPress");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(onEdit, "onEdit");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(error, "error");
        Composer composerStartRestartGroup = composer.startRestartGroup(33085839);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onHelpPress) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onContinue) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEdit) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(address) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(error.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
        }
        if ((599187 & i2) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(33085839, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.error.AddressError (AddressErrorComposable.kt:43)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            switch (WhenMappings.$EnumSwitchMapping$0[error.ordinal()]) {
                case 1:
                    i3 = C12201R.string.credit_app_address_error_invalid_state;
                    break;
                case 2:
                    i3 = C12201R.string.credit_app_address_error_zip_code_not_found;
                    break;
                case 3:
                    i3 = C12201R.string.credit_app_address_error_po_box;
                    break;
                case 4:
                    i3 = C12201R.string.credit_app_address_error_suite_required_but_missing;
                    break;
                case 5:
                    i3 = C12201R.string.credit_app_address_error_multiple_matches;
                    break;
                case 6:
                    i3 = C12201R.string.credit_app_address_error_missing_or_ambiguous_directional;
                    break;
                case 7:
                    i3 = C12201R.string.credit_app_address_error_invalid_suite_number;
                    break;
                case 8:
                    i3 = C12201R.string.credit_app_address_error_invalid_multi_unit;
                    break;
                case 9:
                    i3 = C12201R.string.credit_app_address_error_invalid_building;
                    break;
                case 10:
                    i3 = C12201R.string.credit_app_address_error_delivery_point_not_found;
                    break;
                case 11:
                    i3 = C12201R.string.credit_app_address_error_general;
                    break;
                case 12:
                    i3 = C12201R.string.credit_app_address_error_invalid_state;
                    break;
                case 13:
                    i3 = C12201R.string.credit_app_address_error_suite_required_but_missing;
                    break;
                case 14:
                    i3 = C12201R.string.credit_app_address_error_multiple_matches;
                    break;
                case 15:
                    i3 = C12201R.string.credit_app_address_error_missing_or_ambiguous_directional;
                    break;
                case 16:
                    i3 = C12201R.string.credit_app_address_error_invalid_suite_number;
                    break;
                case 17:
                    i3 = C12201R.string.credit_app_address_error_invalid_multi_unit;
                    break;
                case 18:
                    i3 = C12201R.string.credit_app_address_error_invalid_building;
                    break;
                case 19:
                    i3 = C12201R.string.credit_app_address_error_delivery_point_not_found;
                    break;
                case 20:
                    i3 = C12201R.string.credit_app_address_error_general;
                    break;
                case 21:
                    i3 = C12201R.string.credit_app_address_error_general;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_ADDRESS_ERROR, null, null, null, 14, null), null, error.name(), null, null, onHelpPress, null, ComposableLambda3.rememberComposableLambda(-693191894, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.error.AddressErrorComposableKt.AddressError.1

                /* compiled from: AddressErrorComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.error.AddressErrorComposableKt$AddressError$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ EventLogger $eventLogger;
                    final /* synthetic */ boolean $isSkippable;
                    final /* synthetic */ Function0<Unit> $onContinue;
                    final /* synthetic */ Function0<Unit> $onEdit;

                    AnonymousClass1(boolean z, EventLogger eventLogger, Function0<Unit> function0, Function0<Unit> function02) {
                        this.$isSkippable = z;
                        this.$eventLogger = eventLogger;
                        this.$onContinue = function0;
                        this.$onEdit = function02;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        Function0 function0;
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-860164484, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.error.AddressError.<anonymous>.<anonymous> (AddressErrorComposable.kt:82)");
                        }
                        String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_address_error_edit, composer, 0);
                        composer.startReplaceGroup(-1984337947);
                        String strStringResource2 = this.$isSkippable ? StringResources_androidKt.stringResource(C12201R.string.credit_app_address_error_continue, composer, 0) : null;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-1984331995);
                        if (this.$isSkippable) {
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue);
                            final EventLogger eventLogger = this.$eventLogger;
                            final Function0<Unit> function02 = this.$onContinue;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.error.AddressErrorComposableKt$AddressError$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AddressErrorComposable.C122591.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, function02);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            function0 = (Function0) objRememberedValue;
                        } else {
                            function0 = null;
                        }
                        composer.endReplaceGroup();
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer, 6, 1);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onEdit);
                        final EventLogger eventLogger2 = this.$eventLogger;
                        final Function0<Unit> function03 = this.$onEdit;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.error.AddressErrorComposableKt$AddressError$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AddressErrorComposable.C122591.AnonymousClass1.invoke$lambda$3$lambda$2(eventLogger2, function03);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, (Function0) objRememberedValue2, strStringResource, false, null, false, function0, strStringResource2, false, null, false, composer, 0, 0, 59198);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, Function0 function0) {
                        loggingUtils.logEdit$default(eventLogger, null, 1, null);
                        function0.invoke();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0) {
                        loggingUtils.logContinue$default(eventLogger, null, 1, null);
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-693191894, i4, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.error.AddressError.<anonymous> (AddressErrorComposable.kt:81)");
                    }
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-860164484, true, new AnonymousClass1(z2, current, onContinue, onEdit), composer2, 54), composer2, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, false, ComposableLambda3.rememberComposableLambda(-788852645, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.error.AddressErrorComposableKt.AddressError.2
                public final void invoke(PaddingValues paddingValues, Composer composer2, int i4) {
                    int i5;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i4 & 6) == 0) {
                        i5 = i4 | (composer2.changed(paddingValues) ? 4 : 2);
                    } else {
                        i5 = i4;
                    }
                    if ((i5 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-788852645, i5, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.error.AddressError.<anonymous> (AddressErrorComposable.kt:104)");
                    }
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM());
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), paddingValues), 0.0f, composer2, 0, 1);
                    boolean z3 = z2;
                    boolean z4 = z;
                    AddressType addressType = address;
                    int i7 = i3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierTestTag = TestTag3.testTag(companion2, AddressErrorComposable.ADDRESS_ERROR_TITLE_TEST_TAG);
                    String strStringResource = StringResources_androidKt.stringResource(z3 ? C12201R.string.credit_app_address_error_title_skippable : C12201R.string.credit_app_address_error_title_blocking, composer2, 0);
                    TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer2, i6).getDisplayCapsuleLarge();
                    TextAlign.Companion companion4 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer2, 48, 0, 8124);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(z3 ? z4 ? C12201R.string.credit_app_address_error_subtitle_skippable_shipping : C12201R.string.credit_app_address_error_subtitle_skippable : z4 ? C12201R.string.credit_app_address_error_subtitle_blocking_shipping : C12201R.string.credit_app_address_error_subtitle_blocking, composer2, 0), TestTag3.testTag(companion2, AddressErrorComposable.ADDRESS_ERROR_SUBTITLE_TEST_TAG), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextM(), composer2, 48, 0, 8124);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM()), composer2, 0);
                    AddressCellComposable.AddressCell(addressType, composer2, 0);
                    Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                    Alignment.Vertical centerVertically = companion.getCenterVertically();
                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(center, centerVertically, composer2, 54);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.ALERT_FILLED_16), StringResources_androidKt.stringResource(i7, composer2, 0), bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM(), 0.0f, 11, null), null, false, composer2, BentoIcon4.Size16.$stable, 48);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i7, composer2, 0), TestTag3.testTag(companion2, AddressErrorComposable.ADDRESS_ERROR_MESSAGE_TEST_TAG), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 48, 0, 16380);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                    invoke(paddingValues, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 15) & 458752) | 12582912, 384, 3930);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.error.AddressErrorComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddressErrorComposable.AddressError$lambda$0(onHelpPress, onContinue, onEdit, address, error, z, z2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
