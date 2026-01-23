package com.robinhood.android.settings.p254ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import com.robinhood.android.settings.p254ui.SettingsAdapter;
import com.robinhood.compose.app.GenericComposeView;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: SelectOneItemView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\b\u0007\u0018\u0000 \u001e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u001eB\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0016J\r\u0010\u001c\u001a\u00020\u001aH\u0017¢\u0006\u0002\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R/\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/SelectOneItemView;", "Lcom/robinhood/compose/app/GenericComposeView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem;", "Lcom/robinhood/android/settings/ui/BaseSettingsView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/settings/ui/SettingsAdapter$Callbacks;)V", "<set-?>", "uiState", "getUiState", "()Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem;", "setUiState", "(Lcom/robinhood/android/settings/models/ui/TypedSettingsItem$SelectOneItem;)V", "uiState$delegate", "Landroidx/compose/runtime/MutableState;", "bind", "", "state", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-lib-settings_externalRelease", "loading", ""}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SelectOneItemView extends GenericComposeView implements Bindable<TypedSettingsItem.SelectOneItem>, BaseSettingsView {
    private SettingsAdapter.Callbacks callbacks;

    /* renamed from: uiState$delegate, reason: from kotlin metadata */
    private final SnapshotState uiState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(SelectOneItemView selectOneItemView, int i, Composer composer, int i2) {
        selectOneItemView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$10(SelectOneItemView selectOneItemView, int i, Composer composer, int i2) {
        selectOneItemView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ SelectOneItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectOneItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.uiState = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    @Override // com.robinhood.android.settings.p254ui.BaseSettingsView
    public SettingsAdapter.Callbacks getCallbacks() {
        return this.callbacks;
    }

    @Override // com.robinhood.android.settings.p254ui.BaseSettingsView
    public void setCallbacks(SettingsAdapter.Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TypedSettingsItem.SelectOneItem getUiState() {
        return (TypedSettingsItem.SelectOneItem) this.uiState.getValue();
    }

    private final void setUiState(TypedSettingsItem.SelectOneItem selectOneItem) {
        this.uiState.setValue(selectOneItem);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(TypedSettingsItem.SelectOneItem state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setUiState(state);
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        Composer composer2;
        final SnapshotState snapshotState;
        Composer composerStartRestartGroup = composer.startRestartGroup(610596896);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i : i;
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(610596896, i2, -1, "com.robinhood.android.settings.ui.SelectOneItemView.Content (SelectOneItemView.kt:44)");
            }
            TypedSettingsItem.SelectOneItem uiState = getUiState();
            if (uiState == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.settings.ui.SelectOneItemView$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SelectOneItemView.Content$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            SnapshotState snapshotState3 = snapshotState2;
            TypedSettingsItem.SelectOneItem selectOneItem = uiState;
            BentoText2.m20747BentoText38GnDrw(uiState.getTitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 24576, 0, 8174);
            Composer composer3 = composerStartRestartGroup;
            composer3.startReplaceGroup(1041494215);
            if (Content$lambda$2(snapshotState3)) {
                BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer3, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), BentoProgressIndicator3.f5153XS, 0L, composer3, 48, 4);
                composer3 = composer3;
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            composer3.startReplaceGroup(-544333640);
            for (final TypedSettingsItem.SelectOneItem.Option option : selectOneItem.getOptions()) {
                BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                String title = option.getTitle();
                String subtitle = option.getSubtitle();
                BentoSelectionRowState bentoSelectionRow3 = new BentoSelectionRowState(type2, title, Intrinsics.areEqual(option, selectOneItem.getSelectedOption()), (BentoBaseRowState.Text) (subtitle != null ? new BentoBaseRowState.Text.Plain(subtitle) : null), !Content$lambda$2(snapshotState3), false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2016, (DefaultConstructorMarker) null);
                composer3.startReplaceGroup(-1224400529);
                final TypedSettingsItem.SelectOneItem selectOneItem2 = selectOneItem;
                boolean zChangedInstance = composer3.changedInstance(this) | composer3.changedInstance(selectOneItem2) | composer3.changedInstance(option);
                Object objRememberedValue2 = composer3.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    snapshotState = snapshotState3;
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.settings.ui.SelectOneItemView$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SelectOneItemView.Content$lambda$9$lambda$8$lambda$7$lambda$6(this.f$0, selectOneItem2, option, snapshotState);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue2);
                } else {
                    snapshotState = snapshotState3;
                }
                composer3.endReplaceGroup();
                BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRow3, (Function0) objRememberedValue2, composer3, BentoSelectionRowState.$stable << 3, 1);
                selectOneItem = selectOneItem2;
                snapshotState3 = snapshotState;
            }
            composer2 = composer3;
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.settings.ui.SelectOneItemView$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectOneItemView.Content$lambda$10(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Content$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$9$lambda$8$lambda$7$lambda$6(SelectOneItemView selectOneItemView, TypedSettingsItem.SelectOneItem selectOneItem, TypedSettingsItem.SelectOneItem.Option option, final SnapshotState snapshotState) {
        Content$lambda$3(snapshotState, true);
        SettingsAdapter.Callbacks callbacks = selectOneItemView.getCallbacks();
        if (callbacks == null) {
            throw new IllegalStateException("Required value was null.");
        }
        callbacks.onSelectOneItemClicked(selectOneItem, option, new Function0() { // from class: com.robinhood.android.settings.ui.SelectOneItemView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectOneItemView.Content$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(snapshotState);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(SnapshotState snapshotState) {
        Content$lambda$3(snapshotState, false);
        return Unit.INSTANCE;
    }

    private static final boolean Content$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: SelectOneItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/SelectOneItemView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/settings/ui/SelectOneItemView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SelectOneItemView> {
        private final /* synthetic */ Inflater<SelectOneItemView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SelectOneItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SelectOneItemView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28356R.layout.include_select_one_item_view);
        }
    }
}
