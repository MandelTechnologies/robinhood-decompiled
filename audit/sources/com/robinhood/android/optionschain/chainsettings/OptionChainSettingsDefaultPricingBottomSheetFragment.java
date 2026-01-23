package com.robinhood.android.optionschain.chainsettings;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.navigation.app.ReturnedData;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.chainsettings.logging.OptionChainSettingsLogging;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionChainSettingsDefaultPricingBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012J3\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00110\u0018H\u0003¢\u0006\u0002\u0010\u0019R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001c²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDefaultPricingBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "getOptionSettingsStore", "()Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "setOptionSettingsStore", "(Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "DefaultPricingOption", "selectedSetting", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "setting", "onSettingsChanged", "Lkotlin/Function1;", "(Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainSettingsDefaultPricingBottomSheetFragment extends GenericComposeBottomSheetDialogFragment {
    public EventLogger eventLogger;
    public OptionSettingsStore optionSettingsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final float BOTTOM_SPACER_HEIGHT = C2002Dp.m7995constructorimpl(6);

    /* compiled from: OptionChainSettingsDefaultPricingBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionSettings.DefaultPricingSetting.values().length];
            try {
                iArr[OptionSettings.DefaultPricingSetting.NATURAL_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionSettings.DefaultPricingSetting.MARK_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7(OptionChainSettingsDefaultPricingBottomSheetFragment optionChainSettingsDefaultPricingBottomSheetFragment, int i, Composer composer, int i2) {
        optionChainSettingsDefaultPricingBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultPricingOption$lambda$11(OptionChainSettingsDefaultPricingBottomSheetFragment optionChainSettingsDefaultPricingBottomSheetFragment, OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.DefaultPricingSetting defaultPricingSetting2, Function1 function1, int i, Composer composer, int i2) {
        optionChainSettingsDefaultPricingBottomSheetFragment.DefaultPricingOption(defaultPricingSetting, defaultPricingSetting2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final OptionSettingsStore getOptionSettingsStore() {
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore;
        if (optionSettingsStore != null) {
            return optionSettingsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionSettingsStore");
        return null;
    }

    public final void setOptionSettingsStore(OptionSettingsStore optionSettingsStore) {
        Intrinsics.checkNotNullParameter(optionSettingsStore, "<set-?>");
        this.optionSettingsStore = optionSettingsStore;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composer2;
        final OptionChainSettingsDefaultPricingBottomSheetFragment optionChainSettingsDefaultPricingBottomSheetFragment;
        final OptionChainSettingsDefaultPricingBottomSheetFragment optionChainSettingsDefaultPricingBottomSheetFragment2 = this;
        Composer composerStartRestartGroup = composer.startRestartGroup(1475496034);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(optionChainSettingsDefaultPricingBottomSheetFragment2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1475496034, i2, -1, "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDefaultPricingBottomSheetFragment.ComposeContent (OptionChainSettingsDefaultPricingBottomSheetFragment.kt:42)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(optionChainSettingsDefaultPricingBottomSheetFragment2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDefaultPricingBottomSheetFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainSettingsDefaultPricingBottomSheetFragment.ComposeContent$lambda$1$lambda$0(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(snapshotState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDefaultPricingBottomSheetFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainSettingsDefaultPricingBottomSheetFragment.ComposeContent$lambda$5$lambda$4(snapshotState, (OptionSettings.DefaultPricingSetting) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1<? super OptionSettings.DefaultPricingSetting, Unit> function1 = (Function1) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24135R.string.option_chain_settings_default_price_bottom_sheet_title, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 5, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
            int i4 = 48 | ((i2 << 9) & 7168);
            Composer composer3 = composerStartRestartGroup;
            optionChainSettingsDefaultPricingBottomSheetFragment2.DefaultPricingOption(ComposeContent$lambda$2(snapshotState), OptionSettings.DefaultPricingSetting.NATURAL_PRICE, function1, composer3, i4);
            OptionChainSettingsDefaultPricingBottomSheetFragment optionChainSettingsDefaultPricingBottomSheetFragment3 = this;
            optionChainSettingsDefaultPricingBottomSheetFragment3.DefaultPricingOption(ComposeContent$lambda$2(snapshotState), OptionSettings.DefaultPricingSetting.MARK_PRICE, function1, composer3, i4);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BOTTOM_SPACER_HEIGHT), composer3, 6);
            composer3.endNode();
            optionChainSettingsDefaultPricingBottomSheetFragment = optionChainSettingsDefaultPricingBottomSheetFragment3;
            composer2 = composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                optionChainSettingsDefaultPricingBottomSheetFragment = optionChainSettingsDefaultPricingBottomSheetFragment3;
                composer2 = composer3;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            optionChainSettingsDefaultPricingBottomSheetFragment = optionChainSettingsDefaultPricingBottomSheetFragment2;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDefaultPricingBottomSheetFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainSettingsDefaultPricingBottomSheetFragment.ComposeContent$lambda$7(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState ComposeContent$lambda$1$lambda$0(OptionChainSettingsDefaultPricingBottomSheetFragment optionChainSettingsDefaultPricingBottomSheetFragment) {
        return SnapshotState3.mutableStateOf$default(((Args) INSTANCE.getArgs((Fragment) optionChainSettingsDefaultPricingBottomSheetFragment)).getInitialSetting(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(SnapshotState snapshotState, OptionSettings.DefaultPricingSetting setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        snapshotState.setValue(setting);
        return Unit.INSTANCE;
    }

    private final void DefaultPricingOption(final OptionSettings.DefaultPricingSetting defaultPricingSetting, final OptionSettings.DefaultPricingSetting defaultPricingSetting2, final Function1<? super OptionSettings.DefaultPricingSetting, Unit> function1, Composer composer, final int i) {
        int i2;
        int i3;
        int i4;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1415475302);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(defaultPricingSetting == null ? -1 : defaultPricingSetting.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(defaultPricingSetting2.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1415475302, i2, -1, "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDefaultPricingBottomSheetFragment.DefaultPricingOption (OptionChainSettingsDefaultPricingBottomSheetFragment.kt:78)");
            }
            BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i5 = iArr[defaultPricingSetting2.ordinal()];
            if (i5 == 1) {
                i3 = C24135R.string.option_default_price_setting_natural_price_title;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = C24135R.string.option_default_price_setting_mark_price_title;
            }
            String strStringResource = StringResources_androidKt.stringResource(i3, composerStartRestartGroup, 0);
            int i6 = iArr[defaultPricingSetting2.ordinal()];
            if (i6 == 1) {
                i4 = C24135R.string.option_default_price_setting_natural_price_subtitle;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i4 = C24135R.string.option_default_price_setting_mark_price_subtitle;
            }
            String strStringResource2 = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0);
            boolean z = defaultPricingSetting == defaultPricingSetting2;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDefaultPricingBottomSheetFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainSettingsDefaultPricingBottomSheetFragment.DefaultPricingOption$lambda$10$lambda$9(defaultPricingSetting, defaultPricingSetting2, function1, this);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoSelectionRow2.BentoSelectionRow(null, type2, strStringResource, z, strStringResource2, true, null, false, false, false, (Function0) objRememberedValue, composer2, 196656, 0, 961);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsDefaultPricingBottomSheetFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainSettingsDefaultPricingBottomSheetFragment.DefaultPricingOption$lambda$11(this.f$0, defaultPricingSetting, defaultPricingSetting2, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final OptionSettings.DefaultPricingSetting ComposeContent$lambda$2(SnapshotState<OptionSettings.DefaultPricingSetting> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultPricingOption$lambda$10$lambda$9(OptionSettings.DefaultPricingSetting defaultPricingSetting, OptionSettings.DefaultPricingSetting defaultPricingSetting2, Function1 function1, OptionChainSettingsDefaultPricingBottomSheetFragment optionChainSettingsDefaultPricingBottomSheetFragment) {
        if (defaultPricingSetting == defaultPricingSetting2) {
            return Unit.INSTANCE;
        }
        function1.invoke(defaultPricingSetting2);
        OptionChainSettingsLogging.logOnDefaultPriceChanged(optionChainSettingsDefaultPricingBottomSheetFragment.getEventLogger(), defaultPricingSetting2);
        FragmentActivity fragmentActivityRequireActivity = optionChainSettingsDefaultPricingBottomSheetFragment.requireActivity();
        Intent intent = new Intent();
        intent.putExtra(ReturnedData.EXTRA_RETURNED_DATA, defaultPricingSetting2);
        Unit unit = Unit.INSTANCE;
        fragmentActivityRequireActivity.setResult(-1, intent);
        optionChainSettingsDefaultPricingBottomSheetFragment.getOptionSettingsStore().setDefaultPricingSetting(((Args) INSTANCE.getArgs((Fragment) optionChainSettingsDefaultPricingBottomSheetFragment)).getAccountNumber(), defaultPricingSetting2);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionChainSettingsDefaultPricingBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDefaultPricingBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "initialSetting", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;)V", "getAccountNumber", "()Ljava/lang/String;", "getInitialSetting", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final OptionSettings.DefaultPricingSetting initialSetting;

        /* compiled from: OptionChainSettingsDefaultPricingBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readInt() == 0 ? null : OptionSettings.DefaultPricingSetting.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, OptionSettings.DefaultPricingSetting defaultPricingSetting, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                defaultPricingSetting = args.initialSetting;
            }
            return args.copy(str, defaultPricingSetting);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionSettings.DefaultPricingSetting getInitialSetting() {
            return this.initialSetting;
        }

        public final Args copy(String accountNumber, OptionSettings.DefaultPricingSetting initialSetting) {
            return new Args(accountNumber, initialSetting);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && this.initialSetting == args.initialSetting;
        }

        public int hashCode() {
            String str = this.accountNumber;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            OptionSettings.DefaultPricingSetting defaultPricingSetting = this.initialSetting;
            return iHashCode + (defaultPricingSetting != null ? defaultPricingSetting.hashCode() : 0);
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", initialSetting=" + this.initialSetting + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            OptionSettings.DefaultPricingSetting defaultPricingSetting = this.initialSetting;
            if (defaultPricingSetting == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(defaultPricingSetting.name());
            }
        }

        public Args(String str, OptionSettings.DefaultPricingSetting defaultPricingSetting) {
            this.accountNumber = str;
            this.initialSetting = defaultPricingSetting;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final OptionSettings.DefaultPricingSetting getInitialSetting() {
            return this.initialSetting;
        }
    }

    /* compiled from: OptionChainSettingsDefaultPricingBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDefaultPricingBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDefaultPricingBottomSheetFragment;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsDefaultPricingBottomSheetFragment$Args;", "<init>", "()V", "BOTTOM_SPACER_HEIGHT", "Landroidx/compose/ui/unit/Dp;", "F", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionChainSettingsDefaultPricingBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionChainSettingsDefaultPricingBottomSheetFragment optionChainSettingsDefaultPricingBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionChainSettingsDefaultPricingBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionChainSettingsDefaultPricingBottomSheetFragment newInstance(Args args) {
            return (OptionChainSettingsDefaultPricingBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionChainSettingsDefaultPricingBottomSheetFragment optionChainSettingsDefaultPricingBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionChainSettingsDefaultPricingBottomSheetFragment, args);
        }
    }
}
