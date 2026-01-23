package com.robinhood.android.creditcard.p091ui.creditapplication.address.manualEntry;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Screen;
import io.jsonwebtoken.Header;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ManualAddressEntryComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\u001aV\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\r\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010$\u001a\u00020\u000bX\u008a\u008e\u0002"}, m3636d2 = {"ManualAddressEntry", "", "onBack", "Lkotlin/Function0;", "onContinue", "Lkotlin/Function1;", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "Lkotlin/ParameterName;", "name", PlaceTypes.ADDRESS, "isShipping", "", "isLoading", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;ZZLandroidx/compose/runtime/Composer;I)V", "MANUAL_ADDRESS_ENTRY_TITLE_KEY", "", "MANUAL_ADDRESS_ENTRY_ADDRESS_SPACER_KEY", "MANUAL_ADDRESS_ENTRY_ADDRESS_LINE1_INPUT_KEY", "MANUAL_ADDRESS_ENTRY_ADDRESS_LINE2_INPUT_KEY", "MANUAL_ADDRESS_ENTRY_ADDRESS_CITY_INPUT_KEY", "MANUAL_ADDRESS_ENTRY_ADDRESS_STATE_INPUT_KEY", "MANUAL_ADDRESS_ENTRY_ADDRESS_ZIP_INPUT_KEY", "MANUAL_ADDRESS_ENTRY_TITLE_TEST_TAG", "MANUAL_ADDRESS_ENTRY_ADDRESS_CONTAINER_TEST_TAG", "MANUAL_ADDRESS_ENTRY_ADDRESS_LINE1_INPUT_TEST_TAG", "MANUAL_ADDRESS_ENTRY_ADDRESS_LINE2_INPUT_TEST_TAG", "MANUAL_ADDRESS_ENTRY_ADDRESS_CITY_INPUT_TEST_TAG", "MANUAL_ADDRESS_ENTRY_ADDRESS_STATE_INPUT_TEST_TAG", "MANUAL_ADDRESS_ENTRY_ADDRESS_STATE_DROPDOWN_TEST_TAG", "MANUAL_ADDRESS_ENTRY_ADDRESS_ZIP_INPUT_TEST_TAG", "feature-credit-card_externalDebug", "line1", "line2", "city", "state", Header.COMPRESSION_ALGORITHM, "cityDropdownExpanded"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ManualAddressEntryComposableKt {
    public static final String MANUAL_ADDRESS_ENTRY_ADDRESS_CITY_INPUT_KEY = "manual-address-entry-address-city-input-key";
    public static final String MANUAL_ADDRESS_ENTRY_ADDRESS_CITY_INPUT_TEST_TAG = "manual-address-entry-address-city-input-test-tag";
    public static final String MANUAL_ADDRESS_ENTRY_ADDRESS_CONTAINER_TEST_TAG = "manual-address-entry-address-container-test-tag";
    public static final String MANUAL_ADDRESS_ENTRY_ADDRESS_LINE1_INPUT_KEY = "manual-address-entry-address-line1-input-key";
    public static final String MANUAL_ADDRESS_ENTRY_ADDRESS_LINE1_INPUT_TEST_TAG = "manual-address-entry-address-line1-input-test-tag";
    public static final String MANUAL_ADDRESS_ENTRY_ADDRESS_LINE2_INPUT_KEY = "manual-address-entry-address-line2-input-key";
    public static final String MANUAL_ADDRESS_ENTRY_ADDRESS_LINE2_INPUT_TEST_TAG = "manual-address-entry-address-line2-input-test-tag";
    public static final String MANUAL_ADDRESS_ENTRY_ADDRESS_SPACER_KEY = "manual-address-entry-address-spacer-key";
    public static final String MANUAL_ADDRESS_ENTRY_ADDRESS_STATE_DROPDOWN_TEST_TAG = "manual-address-entry-address-state-dropdown-test-tag";
    public static final String MANUAL_ADDRESS_ENTRY_ADDRESS_STATE_INPUT_KEY = "manual-address-entry-address-state-input-key";
    public static final String MANUAL_ADDRESS_ENTRY_ADDRESS_STATE_INPUT_TEST_TAG = "manual-address-entry-address-state-input-test-tag";
    public static final String MANUAL_ADDRESS_ENTRY_ADDRESS_ZIP_INPUT_KEY = "manual-address-entry-address-zip-input-key";
    public static final String MANUAL_ADDRESS_ENTRY_ADDRESS_ZIP_INPUT_TEST_TAG = "manual-address-entry-address-zip-input-test-tag";
    public static final String MANUAL_ADDRESS_ENTRY_TITLE_KEY = "manual-address-entry-title-key";
    public static final String MANUAL_ADDRESS_ENTRY_TITLE_TEST_TAG = "manual-address-entry-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManualAddressEntry$lambda$24(Function0 function0, Function1 function1, AddressType addressType, boolean z, boolean z2, int i, Composer composer, int i2) {
        ManualAddressEntry(function0, function1, addressType, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ManualAddressEntry(final Function0<Unit> onBack, final Function1<? super AddressType, Unit> onContinue, final AddressType address, final boolean z, final boolean z2, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(address, "address");
        Composer composerStartRestartGroup = composer.startRestartGroup(483337150);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onBack) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onContinue) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(address) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(483337150, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntry (ManualAddressEntryComposable.kt:56)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(address);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ManualAddressEntryComposableKt.ManualAddressEntry$lambda$1$lambda$0(address);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(address);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ManualAddressEntryComposableKt.ManualAddressEntry$lambda$5$lambda$4(address);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
            Object[] objArr3 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(address);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ManualAddressEntryComposableKt.ManualAddressEntry$lambda$9$lambda$8(address);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 6);
            Object[] objArr4 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(address);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ManualAddressEntryComposableKt.ManualAddressEntry$lambda$13$lambda$12(address);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState4 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr4, (Saver) null, (String) null, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 6);
            Object[] objArr5 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(address);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ManualAddressEntryComposableKt.ManualAddressEntry$lambda$17$lambda$16(address);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState5 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr5, (Saver) null, (String) null, (Function0) objRememberedValue5, composerStartRestartGroup, 0, 6);
            Object[] objArr6 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ManualAddressEntryComposableKt.ManualAddressEntry$lambda$21$lambda$20();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_ADDRESS_MANUAL, null, null, null, 14, null), null, null, onBack, null, null, null, ComposableLambda3.rememberComposableLambda(2132211651, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt.ManualAddressEntry.1

                /* compiled from: ManualAddressEntryComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$ManualAddressEntry$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState<String> $city$delegate;
                    final /* synthetic */ EventLogger $eventLogger;
                    final /* synthetic */ boolean $isLoading;
                    final /* synthetic */ boolean $isShipping;
                    final /* synthetic */ SnapshotState<String> $line1$delegate;
                    final /* synthetic */ SnapshotState<String> $line2$delegate;
                    final /* synthetic */ Function1<AddressType, Unit> $onContinue;
                    final /* synthetic */ SnapshotState<String> $state$delegate;
                    final /* synthetic */ SnapshotState<String> $zip$delegate;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(boolean z, EventLogger eventLogger, Function1<? super AddressType, Unit> function1, SnapshotState<String> snapshotState, SnapshotState<String> snapshotState2, SnapshotState<String> snapshotState3, SnapshotState<String> snapshotState4, SnapshotState<String> snapshotState5, boolean z2) {
                        this.$isShipping = z;
                        this.$eventLogger = eventLogger;
                        this.$onContinue = function1;
                        this.$line1$delegate = snapshotState;
                        this.$line2$delegate = snapshotState2;
                        this.$city$delegate = snapshotState3;
                        this.$state$delegate = snapshotState4;
                        this.$zip$delegate = snapshotState5;
                        this.$isLoading = z2;
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
                            ComposerKt.traceEventStart(-395419599, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntry.<anonymous>.<anonymous> (ManualAddressEntryComposable.kt:76)");
                        }
                        composer.startReplaceGroup(-2041110366);
                        String strStringResource = !this.$isShipping ? StringResources_androidKt.stringResource(C12201R.string.credit_app_update_helper_text, composer, 0) : null;
                        composer.endReplaceGroup();
                        boolean z = ManualAddressEntryComposableKt.ManualAddressEntry$lambda$2(this.$line1$delegate).length() > 0 && ManualAddressEntryComposableKt.ManualAddressEntry$lambda$10(this.$city$delegate).length() > 0 && ManualAddressEntryComposableKt.ManualAddressEntry$lambda$14(this.$state$delegate).length() > 0 && ManualAddressEntryComposableKt.ManualAddressEntry$lambda$18(this.$zip$delegate).length() > 0;
                        String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer, 6, 1);
                        composer.startReplaceGroup(-1224400529);
                        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onContinue) | composer.changed(this.$line1$delegate) | composer.changed(this.$line2$delegate) | composer.changed(this.$city$delegate) | composer.changed(this.$state$delegate) | composer.changed(this.$zip$delegate);
                        final EventLogger eventLogger = this.$eventLogger;
                        final Function1<AddressType, Unit> function1 = this.$onContinue;
                        final SnapshotState<String> snapshotState = this.$line1$delegate;
                        final SnapshotState<String> snapshotState2 = this.$line2$delegate;
                        final SnapshotState<String> snapshotState3 = this.$city$delegate;
                        final SnapshotState<String> snapshotState4 = this.$state$delegate;
                        final SnapshotState<String> snapshotState5 = this.$zip$delegate;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            Function0 function0 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$ManualAddressEntry$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ManualAddressEntryComposableKt.C122731.AnonymousClass1.invoke$lambda$1$lambda$0(eventLogger, function1, snapshotState, snapshotState2, snapshotState3, snapshotState4, snapshotState5);
                                }
                            };
                            composer.updateRememberedValue(function0);
                            objRememberedValue = function0;
                        }
                        composer.endReplaceGroup();
                        BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, strStringResource, null, false, null, null, (Function0) objRememberedValue, strStringResource2, this.$isLoading, null, z, null, null, false, null, false, composer, 0, 0, 64060);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState snapshotState4, SnapshotState snapshotState5) {
                        loggingUtils.logContinue$default(eventLogger, null, 1, null);
                        function1.invoke(new AddressType(ManualAddressEntryComposableKt.ManualAddressEntry$lambda$2(snapshotState), ManualAddressEntryComposableKt.ManualAddressEntry$lambda$6(snapshotState2), ManualAddressEntryComposableKt.ManualAddressEntry$lambda$10(snapshotState3), ManualAddressEntryComposableKt.ManualAddressEntry$lambda$14(snapshotState4), ManualAddressEntryComposableKt.ManualAddressEntry$lambda$18(snapshotState5)));
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
                        ComposerKt.traceEventStart(2132211651, i4, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntry.<anonymous> (ManualAddressEntryComposable.kt:75)");
                    }
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-395419599, true, new AnonymousClass1(z, current, onContinue, snapshotState, snapshotState2, snapshotState3, snapshotState4, snapshotState5, z2), composer2, 54), composer2, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, false, ComposableLambda3.rememberComposableLambda(-993405070, true, new C122742(z, snapshotState, snapshotState2, snapshotState3, snapshotState4, (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr6, (Saver) null, (String) null, (Function0) objRememberedValue6, composerStartRestartGroup, 3072, 6), (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager()), ArraysKt.zip(StringResources_androidKt.stringArrayResource(C11048R.array.us_states, composerStartRestartGroup, 0), StringResources_androidKt.stringArrayResource(C11048R.array.us_states_full_name, composerStartRestartGroup, 0)), snapshotState5), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 9) & 7168) | 12582912, 384, 3958);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ManualAddressEntryComposableKt.ManualAddressEntry$lambda$24(onBack, onContinue, address, z, z2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState ManualAddressEntry$lambda$1$lambda$0(AddressType addressType) {
        return SnapshotState3.mutableStateOf$default(addressType.getPrimaryAddressLine(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState ManualAddressEntry$lambda$5$lambda$4(AddressType addressType) {
        String secondaryAddressLine = addressType.getSecondaryAddressLine();
        if (secondaryAddressLine == null) {
            secondaryAddressLine = "";
        }
        return SnapshotState3.mutableStateOf$default(secondaryAddressLine, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState ManualAddressEntry$lambda$9$lambda$8(AddressType addressType) {
        return SnapshotState3.mutableStateOf$default(addressType.getLocality(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState ManualAddressEntry$lambda$13$lambda$12(AddressType addressType) {
        return SnapshotState3.mutableStateOf$default(addressType.getSubdivision(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState ManualAddressEntry$lambda$17$lambda$16(AddressType addressType) {
        return SnapshotState3.mutableStateOf$default(addressType.getZip(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState ManualAddressEntry$lambda$21$lambda$20() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ManualAddressEntry$lambda$23(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ManualAddressEntry$lambda$10(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ManualAddressEntry$lambda$14(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ManualAddressEntry$lambda$18(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ManualAddressEntry$lambda$2(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ManualAddressEntry$lambda$22(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ManualAddressEntry$lambda$6(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* compiled from: ManualAddressEntryComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$ManualAddressEntry$2 */
    static final class C122742 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<String> $city$delegate;
        final /* synthetic */ SnapshotState<Boolean> $cityDropdownExpanded$delegate;
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ boolean $isShipping;
        final /* synthetic */ SnapshotState<String> $line1$delegate;
        final /* synthetic */ SnapshotState<String> $line2$delegate;
        final /* synthetic */ SnapshotState<String> $state$delegate;
        final /* synthetic */ List<Tuples2<String, String>> $stateCodesToNames;
        final /* synthetic */ SnapshotState<String> $zip$delegate;

        C122742(boolean z, SnapshotState<String> snapshotState, SnapshotState<String> snapshotState2, SnapshotState<String> snapshotState3, SnapshotState<String> snapshotState4, SnapshotState<Boolean> snapshotState5, FocusManager focusManager, List<Tuples2<String, String>> list, SnapshotState<String> snapshotState6) {
            this.$isShipping = z;
            this.$line1$delegate = snapshotState;
            this.$line2$delegate = snapshotState2;
            this.$city$delegate = snapshotState3;
            this.$state$delegate = snapshotState4;
            this.$cityDropdownExpanded$delegate = snapshotState5;
            this.$focusManager = focusManager;
            this.$stateCodesToNames = list;
            this.$zip$delegate = snapshotState6;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-993405070, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntry.<anonymous> (ManualAddressEntryComposable.kt:101)");
            }
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), 0.0f, composer, 0, 1), ManualAddressEntryComposableKt.MANUAL_ADDRESS_ENTRY_ADDRESS_CONTAINER_TEST_TAG);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(this.$isShipping) | composer.changed(this.$line1$delegate) | composer.changed(this.$line2$delegate) | composer.changed(this.$city$delegate) | composer.changed(this.$state$delegate) | composer.changed(this.$cityDropdownExpanded$delegate) | composer.changedInstance(this.$focusManager) | composer.changedInstance(this.$stateCodesToNames) | composer.changed(this.$zip$delegate);
            final boolean z = this.$isShipping;
            final SnapshotState<String> snapshotState = this.$line1$delegate;
            final SnapshotState<String> snapshotState2 = this.$line2$delegate;
            final SnapshotState<String> snapshotState3 = this.$city$delegate;
            final SnapshotState<Boolean> snapshotState4 = this.$cityDropdownExpanded$delegate;
            final SnapshotState<String> snapshotState5 = this.$state$delegate;
            final FocusManager focusManager = this.$focusManager;
            final List<Tuples2<String, String>> list = this.$stateCodesToNames;
            final SnapshotState<String> snapshotState6 = this.$zip$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$ManualAddressEntry$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ManualAddressEntryComposableKt.C122742.invoke$lambda$1$lambda$0(z, snapshotState, snapshotState2, snapshotState3, snapshotState4, snapshotState5, focusManager, list, snapshotState6, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierTestTag, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, null, false, null, (Function1) objRememberedValue, composer, 196608, 462);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(final boolean z, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, SnapshotState snapshotState4, SnapshotState snapshotState5, FocusManager focusManager, List list, SnapshotState snapshotState6, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, ManualAddressEntryComposableKt.MANUAL_ADDRESS_ENTRY_TITLE_KEY, null, ComposableLambda3.composableLambdaInstance(2080139783, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2080139783, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.address.manualEntry.ManualAddressEntry.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ManualAddressEntryComposable.kt:111)");
                    }
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(z ? C12201R.string.credit_app_address_title_shipping : C12201R.string.credit_app_address_title_residential, composer, 0), TestTag3.testTag(Modifier.INSTANCE, ManualAddressEntryComposableKt.MANUAL_ADDRESS_ENTRY_TITLE_TEST_TAG), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleLarge(), composer, 48, 0, 8124);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 2, null);
            LazyListScope.item$default(LazyColumn, ManualAddressEntryComposableKt.MANUAL_ADDRESS_ENTRY_ADDRESS_SPACER_KEY, null, ComposableSingletons$ManualAddressEntryComposableKt.INSTANCE.getLambda$796851070$feature_credit_card_externalDebug(), 2, null);
            LazyListScope.item$default(LazyColumn, ManualAddressEntryComposableKt.MANUAL_ADDRESS_ENTRY_ADDRESS_LINE1_INPUT_KEY, null, ComposableLambda3.composableLambdaInstance(-1396287681, true, new ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$2(snapshotState)), 2, null);
            LazyListScope.item$default(LazyColumn, ManualAddressEntryComposableKt.MANUAL_ADDRESS_ENTRY_ADDRESS_LINE2_INPUT_KEY, null, ComposableLambda3.composableLambdaInstance(705540864, true, new ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$3(snapshotState2)), 2, null);
            LazyListScope.item$default(LazyColumn, ManualAddressEntryComposableKt.MANUAL_ADDRESS_ENTRY_ADDRESS_CITY_INPUT_KEY, null, ComposableLambda3.composableLambdaInstance(-1487597887, true, new ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$4(snapshotState3)), 2, null);
            LazyListScope.item$default(LazyColumn, ManualAddressEntryComposableKt.MANUAL_ADDRESS_ENTRY_ADDRESS_STATE_INPUT_KEY, null, ComposableLambda3.composableLambdaInstance(614230658, true, new ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$5(snapshotState4, snapshotState5, focusManager, list)), 2, null);
            LazyListScope.item$default(LazyColumn, ManualAddressEntryComposableKt.MANUAL_ADDRESS_ENTRY_ADDRESS_ZIP_INPUT_KEY, null, ComposableLambda3.composableLambdaInstance(-1578908093, true, new ManualAddressEntryComposableKt$ManualAddressEntry$2$1$1$6(snapshotState6)), 2, null);
            return Unit.INSTANCE;
        }
    }
}
