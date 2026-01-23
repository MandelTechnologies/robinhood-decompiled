package com.robinhood.android.optionschain.chainsettings;

import android.content.Intent;
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
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.navigation.app.ReturnedData;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.android.optionschain.chainsettings.logging.OptionChainSettingsLogging;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.models.p355ui.OptionChainSettingsSideBySideBidAskPriceLabelType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionChainSettingsBidAskPriceLabelBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u001d\u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010\u001fJ3\u0010 \u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\"2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001e0%H\u0003¢\u0006\u0002\u0010&R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006(²\u0006\n\u0010!\u001a\u00020\"X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsBidAskPriceLabelBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "getOptionSettingsStore", "()Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "setOptionSettingsStore", "(Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getScreenEventComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Option", "selectedSetting", "Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;", "setting", "onSettingsChanged", "Lkotlin/Function1;", "(Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;Lcom/robinhood/models/ui/OptionChainSettingsSideBySideBidAskPriceLabelType;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainSettingsBidAskPriceLabelBottomSheetFragment extends GenericComposeBottomSheetDialogFragment implements AutoLoggableFragment {
    public EventLogger eventLogger;
    public OptionSettingsStore optionSettingsStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionChainSettingsBidAskPriceLabelBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChainSettingsSideBySideBidAskPriceLabelType.values().length];
            try {
                iArr[OptionChainSettingsSideBySideBidAskPriceLabelType.BID_ASK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChainSettingsSideBySideBidAskPriceLabelType.SELL_BUY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7(OptionChainSettingsBidAskPriceLabelBottomSheetFragment optionChainSettingsBidAskPriceLabelBottomSheetFragment, int i, Composer composer, int i2) {
        optionChainSettingsBidAskPriceLabelBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Option$lambda$11(OptionChainSettingsBidAskPriceLabelBottomSheetFragment optionChainSettingsBidAskPriceLabelBottomSheetFragment, OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType, OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType2, Function1 function1, int i, Composer composer, int i2) {
        optionChainSettingsBidAskPriceLabelBottomSheetFragment.Option(optionChainSettingsSideBySideBidAskPriceLabelType, optionChainSettingsSideBySideBidAskPriceLabelType2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.OPTION_CHAIN_SETTINGS, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return new Component(Component.ComponentType.BOTTOM_SHEET, "bid_ask_price_label_bottom_sheet", null, 4, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return new Context(0, 0, 0, getOptionSettingsStore().getSideBySideBidAskPriceLabelSetting().toString(), null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composer2;
        final OptionChainSettingsBidAskPriceLabelBottomSheetFragment optionChainSettingsBidAskPriceLabelBottomSheetFragment;
        final OptionChainSettingsBidAskPriceLabelBottomSheetFragment optionChainSettingsBidAskPriceLabelBottomSheetFragment2 = this;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2060081310);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(optionChainSettingsBidAskPriceLabelBottomSheetFragment2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2060081310, i2, -1, "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsBidAskPriceLabelBottomSheetFragment.ComposeContent (OptionChainSettingsBidAskPriceLabelBottomSheetFragment.kt:58)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(optionChainSettingsBidAskPriceLabelBottomSheetFragment2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsBidAskPriceLabelBottomSheetFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainSettingsBidAskPriceLabelBottomSheetFragment.ComposeContent$lambda$1$lambda$0(this.f$0);
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
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsBidAskPriceLabelBottomSheetFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionChainSettingsBidAskPriceLabelBottomSheetFragment.ComposeContent$lambda$5$lambda$4(snapshotState, (OptionChainSettingsSideBySideBidAskPriceLabelType) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1<? super OptionChainSettingsSideBySideBidAskPriceLabelType, Unit> function1 = (Function1) objRememberedValue2;
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
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24135R.string.option_chain_settings_sbs_price_label_bottom_sheet_title, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21597getXxsmallD9Ej5fM(), 5, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24135R.string.option_chain_settings_sbs_price_label_bottom_sheet_subtitle, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 7, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 0, 0, 8184);
            int i4 = ((i2 << 9) & 7168) | 48;
            optionChainSettingsBidAskPriceLabelBottomSheetFragment2.Option(ComposeContent$lambda$2(snapshotState), OptionChainSettingsSideBySideBidAskPriceLabelType.BID_ASK, function1, composerStartRestartGroup, i4);
            OptionChainSettingsBidAskPriceLabelBottomSheetFragment optionChainSettingsBidAskPriceLabelBottomSheetFragment3 = this;
            optionChainSettingsBidAskPriceLabelBottomSheetFragment3.Option(ComposeContent$lambda$2(snapshotState), OptionChainSettingsSideBySideBidAskPriceLabelType.SELL_BUY, function1, composerStartRestartGroup, i4);
            composer2 = composerStartRestartGroup;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM()), composer2, 0);
            composer2.endNode();
            optionChainSettingsBidAskPriceLabelBottomSheetFragment = optionChainSettingsBidAskPriceLabelBottomSheetFragment3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                optionChainSettingsBidAskPriceLabelBottomSheetFragment = optionChainSettingsBidAskPriceLabelBottomSheetFragment3;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            optionChainSettingsBidAskPriceLabelBottomSheetFragment = optionChainSettingsBidAskPriceLabelBottomSheetFragment2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsBidAskPriceLabelBottomSheetFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainSettingsBidAskPriceLabelBottomSheetFragment.ComposeContent$lambda$7(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState ComposeContent$lambda$1$lambda$0(OptionChainSettingsBidAskPriceLabelBottomSheetFragment optionChainSettingsBidAskPriceLabelBottomSheetFragment) {
        return SnapshotState3.mutableStateOf$default(optionChainSettingsBidAskPriceLabelBottomSheetFragment.getOptionSettingsStore().getSideBySideBidAskPriceLabelSetting(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(SnapshotState snapshotState, OptionChainSettingsSideBySideBidAskPriceLabelType setting) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        snapshotState.setValue(setting);
        return Unit.INSTANCE;
    }

    private static final OptionChainSettingsSideBySideBidAskPriceLabelType ComposeContent$lambda$2(SnapshotState<OptionChainSettingsSideBySideBidAskPriceLabelType> snapshotState) {
        return snapshotState.getValue();
    }

    private final void Option(final OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType, final OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType2, final Function1<? super OptionChainSettingsSideBySideBidAskPriceLabelType, Unit> function1, Composer composer, final int i) {
        int i2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-471379435);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(optionChainSettingsSideBySideBidAskPriceLabelType == null ? -1 : optionChainSettingsSideBySideBidAskPriceLabelType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(optionChainSettingsSideBySideBidAskPriceLabelType2.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-471379435, i2, -1, "com.robinhood.android.optionschain.chainsettings.OptionChainSettingsBidAskPriceLabelBottomSheetFragment.Option (OptionChainSettingsBidAskPriceLabelBottomSheetFragment.kt:102)");
            }
            BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
            int i4 = WhenMappings.$EnumSwitchMapping$0[optionChainSettingsSideBySideBidAskPriceLabelType2.ordinal()];
            if (i4 == 1) {
                i3 = C24135R.string.option_chain_settings_sbs_price_label_bid_ask;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = C24135R.string.option_chain_settings_sbs_price_label_sell_buy;
            }
            String strStringResource = StringResources_androidKt.stringResource(i3, composerStartRestartGroup, 0);
            boolean z = optionChainSettingsSideBySideBidAskPriceLabelType == optionChainSettingsSideBySideBidAskPriceLabelType2;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsBidAskPriceLabelBottomSheetFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionChainSettingsBidAskPriceLabelBottomSheetFragment.Option$lambda$10$lambda$9(optionChainSettingsSideBySideBidAskPriceLabelType, optionChainSettingsSideBySideBidAskPriceLabelType2, function1, this);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoSelectionRow2.BentoSelectionRow(null, type2, strStringResource, z, null, true, null, false, false, false, (Function0) objRememberedValue, composer2, 196656, 0, 977);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.chainsettings.OptionChainSettingsBidAskPriceLabelBottomSheetFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainSettingsBidAskPriceLabelBottomSheetFragment.Option$lambda$11(this.f$0, optionChainSettingsSideBySideBidAskPriceLabelType, optionChainSettingsSideBySideBidAskPriceLabelType2, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Option$lambda$10$lambda$9(OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType, OptionChainSettingsSideBySideBidAskPriceLabelType optionChainSettingsSideBySideBidAskPriceLabelType2, Function1 function1, OptionChainSettingsBidAskPriceLabelBottomSheetFragment optionChainSettingsBidAskPriceLabelBottomSheetFragment) {
        if (optionChainSettingsSideBySideBidAskPriceLabelType == optionChainSettingsSideBySideBidAskPriceLabelType2) {
            return Unit.INSTANCE;
        }
        function1.invoke(optionChainSettingsSideBySideBidAskPriceLabelType2);
        OptionChainSettingsLogging.logOnBidAskPriceLabelChanged(optionChainSettingsBidAskPriceLabelBottomSheetFragment.getEventLogger(), optionChainSettingsSideBySideBidAskPriceLabelType2);
        FragmentActivity fragmentActivityRequireActivity = optionChainSettingsBidAskPriceLabelBottomSheetFragment.requireActivity();
        Intent intent = new Intent();
        intent.putExtra(ReturnedData.EXTRA_RETURNED_DATA, optionChainSettingsSideBySideBidAskPriceLabelType2);
        Unit unit = Unit.INSTANCE;
        fragmentActivityRequireActivity.setResult(-1, intent);
        optionChainSettingsBidAskPriceLabelBottomSheetFragment.getOptionSettingsStore().setSideBySideBidAskPriceLabelSetting(optionChainSettingsSideBySideBidAskPriceLabelType2);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionChainSettingsBidAskPriceLabelBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsBidAskPriceLabelBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsBidAskPriceLabelBottomSheetFragment;", "<init>", "()V", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<OptionChainSettingsBidAskPriceLabelBottomSheetFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((OptionChainSettingsBidAskPriceLabelBottomSheetFragment) fragment);
        }

        public Void getArgs(OptionChainSettingsBidAskPriceLabelBottomSheetFragment optionChainSettingsBidAskPriceLabelBottomSheetFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, optionChainSettingsBidAskPriceLabelBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public OptionChainSettingsBidAskPriceLabelBottomSheetFragment newInstance() {
            return (OptionChainSettingsBidAskPriceLabelBottomSheetFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public OptionChainSettingsBidAskPriceLabelBottomSheetFragment newInstance(Void r1) {
            return (OptionChainSettingsBidAskPriceLabelBottomSheetFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
