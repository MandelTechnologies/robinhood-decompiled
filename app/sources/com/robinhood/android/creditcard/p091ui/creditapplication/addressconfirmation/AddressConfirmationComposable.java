package com.robinhood.android.creditcard.p091ui.creditapplication.addressconfirmation;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.addressconfirmation.AddressConfirmationComposable;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoRadioButton2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.Haptics;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AddressConfirmationComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aU\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a;\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0016\u001a\u00020\u0017X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0017X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0017X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0017X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0017X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0017X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"AddressConfirmation", "", "onHelpPress", "Lkotlin/Function0;", "onClose", "onContinue", "Lkotlin/Function1;", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "addresses", "Lkotlinx/collections/immutable/ImmutableList;", "isLoading", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlinx/collections/immutable/ImmutableList;ZLandroidx/compose/runtime/Composer;I)V", "AddressSelectionRow", PlaceTypes.ADDRESS, "selected", "onAddressClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AddressSelectionRowLoading", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ADDRESS_CONFIRMATION_TITLE_TEST_TAG", "", "ADDRESS_CONFIRMATION_SUBTITLE_TEST_TAG", "ADDRESS_SELECTION_ROW_LOADING_TEST_TAG", "ADDRESS_SELECTION_ROW_TEST_TAG", "ADDRESS_SELECTION_ROW_LABEL_TEST_TAG", "ADDRESS_SELECTION_ROW_VALUE_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AddressConfirmationComposable {
    public static final String ADDRESS_CONFIRMATION_SUBTITLE_TEST_TAG = "address-confirmation-subtitle-test-tag";
    public static final String ADDRESS_CONFIRMATION_TITLE_TEST_TAG = "address-confirmation-title-test-tag";
    public static final String ADDRESS_SELECTION_ROW_LABEL_TEST_TAG = "address-selection-row-label-test-tag";
    public static final String ADDRESS_SELECTION_ROW_LOADING_TEST_TAG = "address-selection-row-loading-test-tag";
    public static final String ADDRESS_SELECTION_ROW_TEST_TAG = "address-selection-row-test-tag";
    public static final String ADDRESS_SELECTION_ROW_VALUE_TEST_TAG = "address-selection-row-value-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddressConfirmation$lambda$2(Function0 function0, Function0 function02, Function1 function1, ImmutableList immutableList, boolean z, int i, Composer composer, int i2) {
        AddressConfirmation(function0, function02, function1, immutableList, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddressSelectionRow$lambda$3(AddressType addressType, boolean z, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AddressSelectionRow(addressType, z, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddressSelectionRowLoading$lambda$4(Modifier modifier, int i, int i2, Composer composer, int i3) {
        AddressSelectionRowLoading(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void AddressConfirmation(final Function0<Unit> onHelpPress, final Function0<Unit> onClose, final Function1<? super AddressType, Unit> onContinue, final ImmutableList<AddressType> immutableList, final boolean z, Composer composer, final int i) {
        int i2;
        boolean z2;
        Intrinsics.checkNotNullParameter(onHelpPress, "onHelpPress");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(1471852181);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onHelpPress) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClose) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onContinue) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(immutableList) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        int i3 = i2;
        if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1471852181, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmation (AddressConfirmationComposable.kt:59)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(-1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final boolean z3 = z2;
            CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_ADDRESS_CHALLENGE, null, null, null, 14, null), null, null, null, null, onHelpPress, null, ComposableLambda3.rememberComposableLambda(1515367130, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationComposableKt.AddressConfirmation.1
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
                        ComposerKt.traceEventStart(1515367130, i4, -1, "com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmation.<anonymous> (AddressConfirmationComposable.kt:68)");
                    }
                    if (immutableList != null) {
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, composer2, 6, 1);
                        SnapshotState<AddressType> snapshotState2 = snapshotState;
                        EventLogger eventLogger = current;
                        Function1<AddressType, Unit> function1 = onContinue;
                        boolean z4 = z3;
                        Function0<Unit> function0 = onClose;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(854875225, true, new AddressConfirmationComposable2(snapshotState2, eventLogger, function1, z4, function0), composer2, 54), composer2, 805306368, 510);
                        composer2.endNode();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, false, false, ComposableLambda3.rememberComposableLambda(-914044087, true, new C123072(immutableList, (SnapshotIntState2) objRememberedValue2, current, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 15) & 458752) | 12582912, 384, 3934);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddressConfirmationComposable.AddressConfirmation$lambda$2(onHelpPress, onClose, onContinue, immutableList, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AddressConfirmationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationComposableKt$AddressConfirmation$2 */
    static final class C123072 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList<AddressType> $addresses;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ SnapshotState<AddressType> $selectedAddress;
        final /* synthetic */ SnapshotIntState2 $selectedIndex;

        C123072(ImmutableList<AddressType> immutableList, SnapshotIntState2 snapshotIntState2, EventLogger eventLogger, SnapshotState<AddressType> snapshotState) {
            this.$addresses = immutableList;
            this.$selectedIndex = snapshotIntState2;
            this.$eventLogger = eventLogger;
            this.$selectedAddress = snapshotState;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            final SnapshotIntState2 snapshotIntState2;
            final SnapshotState<AddressType> snapshotState;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            int i2 = (i & 6) == 0 ? i | (composer.changed(paddingValues) ? 4 : 2) : i;
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-914044087, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmation.<anonymous> (AddressConfirmationComposable.kt:95)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), paddingValues), 0.0f, composer, 0, 1), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
            ImmutableList<AddressType> immutableList = this.$addresses;
            SnapshotIntState2 snapshotIntState22 = this.$selectedIndex;
            EventLogger eventLogger = this.$eventLogger;
            SnapshotState<AddressType> snapshotState2 = this.$selectedAddress;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion, AddressConfirmationComposable.ADDRESS_CONFIRMATION_TITLE_TEST_TAG);
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_address_confirmation_title, composer, 0);
            TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer, i3).getDisplayCapsuleLarge();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            SnapshotIntState2 snapshotIntState23 = snapshotIntState22;
            EventLogger eventLogger2 = eventLogger;
            SnapshotState<AddressType> snapshotState3 = snapshotState2;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer, 48, 0, 8124);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_address_confirmation_subtitle, composer, 0), TestTag3.testTag(companion, AddressConfirmationComposable.ADDRESS_CONFIRMATION_SUBTITLE_TEST_TAG), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 48, 0, 8124);
            Composer composer2 = composer;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM()), composer2, 0);
            Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getColors(composer2, i3).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12)));
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM4871backgroundbw27NRU);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            if (immutableList == null) {
                composer2.startReplaceGroup(883075987);
                AddressConfirmationComposable.AddressSelectionRowLoading(null, composer2, 0, 1);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer2, i3).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 5);
                AddressConfirmationComposable.AddressSelectionRowLoading(null, composer2, 0, 1);
                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer2, i3).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 5);
                AddressConfirmationComposable.AddressSelectionRowLoading(null, composer2, 0, 1);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(883417700);
                final int i4 = 0;
                for (AddressType addressType : immutableList) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    AddressType addressType2 = addressType;
                    Modifier modifierTestTag2 = TestTag3.testTag(Modifier.INSTANCE, "address-selection-row-test-tag-" + i4);
                    boolean z = snapshotIntState23.getIntValue() == i4;
                    composer2.startReplaceGroup(-1224400529);
                    final EventLogger eventLogger3 = eventLogger2;
                    boolean zChangedInstance = composer2.changedInstance(eventLogger3) | composer2.changed(i4);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        snapshotIntState2 = snapshotIntState23;
                        snapshotState = snapshotState3;
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationComposableKt$AddressConfirmation$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AddressConfirmationComposable.C123072.invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(eventLogger3, snapshotIntState2, i4, snapshotState, (AddressType) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    } else {
                        snapshotIntState2 = snapshotIntState23;
                        snapshotState = snapshotState3;
                    }
                    composer2.endReplaceGroup();
                    AddressConfirmationComposable.AddressSelectionRow(addressType2, z, (Function1) objRememberedValue, modifierTestTag2, composer2, 0, 0);
                    composer2.startReplaceGroup(998356995);
                    if (i4 != immutableList.size() - 1) {
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 5);
                    }
                    composer.endReplaceGroup();
                    composer2 = composer;
                    i4 = i5;
                    eventLogger2 = eventLogger3;
                    snapshotIntState23 = snapshotIntState2;
                    snapshotState3 = snapshotState;
                }
                composer.endReplaceGroup();
            }
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(EventLogger eventLogger, SnapshotIntState2 snapshotIntState2, int i, SnapshotState snapshotState, AddressType it) {
            Intrinsics.checkNotNullParameter(it, "it");
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SELECT, loggingUtils.getCcScreen(), new Component(Component.ComponentType.MENU_ITEM, null, null, 6, null), null, null, false, 56, null);
            snapshotIntState2.setIntValue(i);
            snapshotState.setValue(it);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AddressConfirmationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationComposableKt$AddressSelectionRow$1 */
    static final class C123081 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AddressType $address;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<AddressType, Unit> $onAddressClicked;
        final /* synthetic */ boolean $selected;

        /* JADX WARN: Multi-variable type inference failed */
        C123081(Modifier modifier, boolean z, Function1<? super AddressType, Unit> function1, AddressType addressType) {
            this.$modifier = modifier;
            this.$selected = z;
            this.$onAddressClicked = function1;
            this.$address = addressType;
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
                ComposerKt.traceEventStart(-716234793, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressSelectionRow.<anonymous> (AddressConfirmationComposable.kt:165)");
            }
            Modifier modifier = this.$modifier;
            boolean z = this.$selected;
            Role roleM7472boximpl = Role.m7472boximpl(Role.INSTANCE.m7484getRadioButtono7Vup1c());
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onAddressClicked) | composer.changedInstance(this.$address);
            final Function1<AddressType, Unit> function1 = this.$onAddressClicked;
            final AddressType addressType = this.$address;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationComposableKt$AddressSelectionRow$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AddressConfirmationComposable.C123081.invoke$lambda$1$lambda$0(function1, addressType);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM5142padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(Selectable3.m5316selectableXHw0xAI$default(modifier, z, false, roleM7472boximpl, Haptics.hapticClick((Function0) objRememberedValue, composer, 0), 2, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM());
            final AddressType addressType2 = this.$address;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1282025708, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationComposableKt.AddressSelectionRow.1.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1282025708, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressSelectionRow.<anonymous>.<anonymous> (AddressConfirmationComposable.kt:178)");
                    }
                    BentoText2.m20747BentoText38GnDrw(addressType2.getPrimaryAddressLine() + PlaceholderUtils.XXShortPlaceholderText + addressType2.getSecondaryAddressLine(), TestTag3.testTag(Modifier.INSTANCE, AddressConfirmationComposable.ADDRESS_SELECTION_ROW_LABEL_TEST_TAG), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), composer2, 24624, 0, 8172);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54);
            final AddressType addressType3 = this.$address;
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1781649045, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationComposableKt.AddressSelectionRow.1.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1781649045, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressSelectionRow.<anonymous>.<anonymous> (AddressConfirmationComposable.kt:187)");
                    }
                    Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, AddressConfirmationComposable.ADDRESS_SELECTION_ROW_VALUE_TEST_TAG);
                    AddressType addressType4 = addressType3;
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    builder.append(addressType4.getLocality());
                    builder.append(", ");
                    builder.append(addressType4.getSubdivision());
                    builder.append(PlaceholderUtils.XXShortPlaceholderText);
                    builder.append(addressType4.getZip());
                    BentoText2.m20748BentoTextQnj7Zds(builder.toAnnotatedString(), modifierTestTag, null, null, null, null, null, 0, false, 0, 0, null, null, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS(), composer2, 48, 0, 8188);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54);
            final boolean z2 = this.$selected;
            BentoBaseRowLayout.BentoBaseRowLayout(modifierM5142padding3ABfNKs, null, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, null, ComposableLambda3.rememberComposableLambda(-680936041, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationComposableKt.AddressSelectionRow.1.4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-680936041, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressSelectionRow.<anonymous>.<anonymous> (AddressConfirmationComposable.kt:201)");
                    }
                    BentoRadioButton2.BentoRadioButton(z2, null, true, composer2, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), false, true, true, null, composer, 920153088, 0, 1062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, AddressType addressType) {
            function1.invoke(addressType);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddressSelectionRow(final AddressType address, final boolean z, final Function1<? super AddressType, Unit> onAddressClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(onAddressClicked, "onAddressClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1817836567);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(address) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAddressClicked) ? 256 : 128;
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
                    ComposerKt.traceEventStart(-1817836567, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressSelectionRow (AddressConfirmationComposable.kt:163)");
                }
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-716234793, true, new C123081(modifier4, z, onAddressClicked, address), composerStartRestartGroup, 54), composer2, 805306368, 510);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AddressConfirmationComposable.AddressSelectionRow$lambda$3(address, z, onAddressClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-716234793, true, new C123081(modifier4, z, onAddressClicked, address), composerStartRestartGroup, 54), composer2, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void AddressSelectionRowLoading(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(838081202);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(838081202, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressSelectionRowLoading (AddressConfirmationComposable.kt:212)");
            }
            Modifier modifierTestTag = TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(modifier4, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), ADDRESS_SELECTION_ROW_LOADING_TEST_TAG);
            AddressConfirmationComposable3 addressConfirmationComposable3 = AddressConfirmationComposable3.INSTANCE;
            modifier3 = modifier4;
            BentoBaseRowLayout.BentoBaseRowLayout(modifierTestTag, null, null, addressConfirmationComposable3.getLambda$1701846933$feature_credit_card_externalDebug(), addressConfirmationComposable3.m12661getLambda$569620812$feature_credit_card_externalDebug(), null, addressConfirmationComposable3.m12662getLambda$817589006$feature_credit_card_externalDebug(), false, true, true, null, composerStartRestartGroup, 920153088, 0, 1062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AddressConfirmationComposable.AddressSelectionRowLoading$lambda$4(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
