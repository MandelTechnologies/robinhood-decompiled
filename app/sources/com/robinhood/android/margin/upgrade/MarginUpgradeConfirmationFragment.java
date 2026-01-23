package com.robinhood.android.margin.upgrade;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment;
import com.robinhood.android.common.margin.p083ui.MarginUpgradeStep;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistViewState4;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey2;
import com.robinhood.android.margin.upgrade.MarginUpgradeConfirmationFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.math.BigDecimal;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: MarginUpgradeConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001b\u001c\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0018\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010\u001aR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeConfirmationFragment;", "Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment;", "<init>", "()V", "localityStringResources", "Lcom/robinhood/android/margin/upgrade/LocalityStringResources;", "getLocalityStringResources", "()Lcom/robinhood/android/margin/upgrade/LocalityStringResources;", "setLocalityStringResources", "(Lcom/robinhood/android/margin/upgrade/LocalityStringResources;)V", "callbacks", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/margin/upgrade/MarginUpgradeConfirmationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "step", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "getStep", "()Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginUpgradeConfirmationFragment extends BaseMarginUpgradeStepComposeFragment {
    public LocalityStringResources localityStringResources;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginUpgradeConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/margin/upgrade/MarginUpgradeConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeConfirmationFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MarginUpgradeConfirmationFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final MarginUpgradeStep step = MarginUpgradeStep.DEFAULT_CONFIRMATION;

    /* compiled from: MarginUpgradeConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001c\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeConfirmationFragment$Callbacks;", "", "onDoneClicked", "", "onDepositClicked", "minAmount", "Ljava/math/BigDecimal;", "recommendedAmount", "onSetBorrowingLimitClicked", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDepositClicked(BigDecimal minAmount, BigDecimal recommendedAmount);

        void onDoneClicked();

        void onSetBorrowingLimitClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8(MarginUpgradeConfirmationFragment marginUpgradeConfirmationFragment, int i, Composer composer, int i2) throws Resources.NotFoundException {
        marginUpgradeConfirmationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final LocalityStringResources getLocalityStringResources() {
        LocalityStringResources localityStringResources = this.localityStringResources;
        if (localityStringResources != null) {
            return localityStringResources;
        }
        Intrinsics.throwUninitializedPropertyAccessException("localityStringResources");
        return null;
    }

    public final void setLocalityStringResources(LocalityStringResources localityStringResources) {
        Intrinsics.checkNotNullParameter(localityStringResources, "<set-?>");
        this.localityStringResources = localityStringResources;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    public MarginUpgradeStep getStep() {
        return this.step;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment, com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        String strStringResource;
        String strStringResource2;
        final MarginUpgradeConfirmationFragment marginUpgradeConfirmationFragment;
        int i3;
        Function0 function0;
        Composer composerStartRestartGroup = composer.startRestartGroup(1231769437);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            marginUpgradeConfirmationFragment = this;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1231769437, i2, -1, "com.robinhood.android.margin.upgrade.MarginUpgradeConfirmationFragment.ComposeContent (MarginUpgradeConfirmationFragment.kt:55)");
            }
            Companion companion = INSTANCE;
            int i4 = ((Args) companion.getArgs((Fragment) this)).isGold() ? C21137R.drawable.margin_upgrade_confirmation_illustration_gold : C21137R.drawable.margin_upgrade_confirmation_illustration_default;
            boolean z = ((Args) companion.getArgs((Fragment) this)).getMarginFlowType() instanceof MarginEligibilityChecklistViewState4.Skip2KCheck;
            composerStartRestartGroup.startReplaceGroup(-1680532687);
            if (z) {
                MarginEligibilityChecklistViewState4 marginFlowType = ((Args) companion.getArgs((Fragment) this)).getMarginFlowType();
                Intrinsics.checkNotNull(marginFlowType, "null cannot be cast to non-null type com.robinhood.android.common.margin.ui.eligibility.MarginFlow.Skip2KCheck");
                String str = Money3.format$default(((MarginEligibilityChecklistViewState4.Skip2KCheck) marginFlowType).getMinimumDeposit(), null, 1, null);
                if (str == null) {
                    str = "";
                }
                strStringResource = !(((Args) companion.getArgs((Fragment) this)).getSourceType() instanceof EnableMarginInvestingKey2.ShortSelling) ? getLocalityStringResources().margin_upgrade_confirmation_description_to_deposit(str) : getLocalityStringResources().margin_upgrade_confirmation_description_to_deposit_short(str);
            } else {
                strStringResource = StringResources_androidKt.stringResource(C21137R.string.margin_upgrade_confirmation_description, new Object[]{Money.format$default(((Args) companion.getArgs((Fragment) this)).getNewBuyingPower(), null, false, null, false, 0, null, false, null, false, false, 1023, null)}, composerStartRestartGroup, 0);
            }
            String str2 = strStringResource;
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(companion2);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierSystemBarsPadding, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 7, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
            Spacer2.Spacer(Column5.weight$default(column6, companion2, 2.0f, false, 2, null), composerStartRestartGroup, 0);
            ImageKt.Image(PainterResources_androidKt.painterResource(i4, composerStartRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null);
            if (((Args) companion.getArgs((Fragment) this)).getSourceType() instanceof EnableMarginInvestingKey2.ShortSelling) {
                composerStartRestartGroup.startReplaceGroup(1837678439);
                strStringResource2 = StringResources_androidKt.stringResource(C21137R.string.margin_upgrade_confirmation_title_short, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1837462648);
                strStringResource2 = StringResources_androidKt.stringResource(C21137R.string.margin_upgrade_confirmation_title, new Object[]{StringResources6.getText(((Args) companion.getArgs((Fragment) this)).getDisplayName().getWithAccount().getTitle(), composerStartRestartGroup, StringResource.$stable)}, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8124);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
            BentoText2.m20747BentoText38GnDrw(str2, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 2, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16316);
            Spacer2.Spacer(Column5.weight$default(column6, companion2, 2.0f, false, 2, null), composerStartRestartGroup, 0);
            marginUpgradeConfirmationFragment = this;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(((Args) companion.getArgs((Fragment) this)).getMarginReviewHelperRes(), composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8120);
            composerStartRestartGroup = composerStartRestartGroup;
            if (z) {
                i3 = C11048R.string.general_action_deposit_funds;
            } else {
                EnableMarginInvestingKey2 sourceType = ((Args) companion.getArgs((Fragment) marginUpgradeConfirmationFragment)).getSourceType();
                if (Intrinsics.areEqual(sourceType, EnableMarginInvestingKey2.InternalAssetTransfer.INSTANCE)) {
                    i3 = C11048R.string.general_label_continue;
                } else if (sourceType instanceof EnableMarginInvestingKey2.ShortSelling) {
                    i3 = C21137R.string.margin_upgrade_confirmation_continue_short;
                } else {
                    if (!Intrinsics.areEqual(sourceType, EnableMarginInvestingKey2.Default.INSTANCE) && !Intrinsics.areEqual(sourceType, EnableMarginInvestingKey2.AcatsIn.INSTANCE) && !Intrinsics.areEqual(sourceType, EnableMarginInvestingKey2.GoldWelcome.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = C11048R.string.general_label_done;
                }
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1839481368);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(marginUpgradeConfirmationFragment);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeConfirmationFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MarginUpgradeConfirmationFragment.ComposeContent$lambda$7$lambda$2$lambda$1(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1839401295);
                Callbacks callbacks = marginUpgradeConfirmationFragment.getCallbacks();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(callbacks);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new MarginUpgradeConfirmationFragment4(callbacks);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
                function0 = (Function0) ((KFunction) objRememberedValue2);
            }
            if (((Args) companion.getArgs((Fragment) marginUpgradeConfirmationFragment)).isGold()) {
                composerStartRestartGroup.startReplaceGroup(1839912516);
                BentoButtonKt.BentoGoldButton((Function0<Unit>) function0, StringResources_androidKt.stringResource(i3, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null), (BentoButtons.Icon.Size16) null, BentoButtons.Type.Primary, false, false, (String) null, composerStartRestartGroup, 24576, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1840214952);
                BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(i3, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1840556169);
                if (((Args) companion.getArgs((Fragment) marginUpgradeConfirmationFragment)).isGold()) {
                    composerStartRestartGroup.startReplaceGroup(1840576908);
                    Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                    String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composerStartRestartGroup, 0);
                    BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                    Callbacks callbacks2 = marginUpgradeConfirmationFragment.getCallbacks();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(callbacks2);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new MarginUpgradeConfirmationFragment2(callbacks2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonKt.BentoGoldButton((Function0<Unit>) ((KFunction) objRememberedValue3), strStringResource3, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, (BentoButtons.Icon.Size16) null, type2, false, false, (String) null, composerStartRestartGroup, 24576, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1840967043);
                    Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2 = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                    String margin_upgrade_confirmation_secondary_cta = marginUpgradeConfirmationFragment.getLocalityStringResources().getMargin_upgrade_confirmation_secondary_cta();
                    BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                    Callbacks callbacks3 = marginUpgradeConfirmationFragment.getCallbacks();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(callbacks3);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new MarginUpgradeConfirmationFragment3(callbacks3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer2 = composerStartRestartGroup;
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue4), margin_upgrade_confirmation_secondary_cta, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2, null, type3, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else if (((Args) companion.getArgs((Fragment) marginUpgradeConfirmationFragment)).isUk()) {
                composerStartRestartGroup.startReplaceGroup(1841393634);
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default3 = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                String strStringResource4 = StringResources_androidKt.stringResource(C21137R.string.set_borrowing_limit, composerStartRestartGroup, 0);
                BentoButtons.Type type4 = BentoButtons.Type.Secondary;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(marginUpgradeConfirmationFragment);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeConfirmationFragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MarginUpgradeConfirmationFragment.ComposeContent$lambda$7$lambda$6$lambda$5(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer3 = composerStartRestartGroup;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue5, strStringResource4, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default3, null, type4, false, false, null, null, null, null, false, null, composer3, 24576, 0, 8168);
                composerStartRestartGroup = composer3;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1841744399);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeConfirmationFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginUpgradeConfirmationFragment.ComposeContent$lambda$8(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7$lambda$2$lambda$1(MarginUpgradeConfirmationFragment marginUpgradeConfirmationFragment) {
        MarginEligibilityChecklistViewState4 marginFlowType = ((Args) INSTANCE.getArgs((Fragment) marginUpgradeConfirmationFragment)).getMarginFlowType();
        Intrinsics.checkNotNull(marginFlowType, "null cannot be cast to non-null type com.robinhood.android.common.margin.ui.eligibility.MarginFlow.Skip2KCheck");
        MarginEligibilityChecklistViewState4.Skip2KCheck skip2KCheck = (MarginEligibilityChecklistViewState4.Skip2KCheck) marginFlowType;
        Money minimumDeposit = skip2KCheck.getMinimumDeposit();
        Money recommendedDeposit = skip2KCheck.getRecommendedDeposit();
        marginUpgradeConfirmationFragment.getCallbacks().onDepositClicked(minimumDeposit != null ? minimumDeposit.getDecimalValue() : null, recommendedDeposit != null ? recommendedDeposit.getDecimalValue() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7$lambda$6$lambda$5(MarginUpgradeConfirmationFragment marginUpgradeConfirmationFragment) {
        marginUpgradeConfirmationFragment.getCallbacks().onSetBorrowingLimitClicked();
        return Unit.INSTANCE;
    }

    /* compiled from: MarginUpgradeConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\u000eHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0006\u0010$\u001a\u00020\u0005J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0017R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeConfirmationFragment$Args;", "Landroid/os/Parcelable;", "newBuyingPower", "Lcom/robinhood/models/util/Money;", "marginReviewHelperRes", "", "displayName", "Lcom/robinhood/android/account/strings/DisplayName;", "isGold", "", "isUk", "sourceType", "Lcom/robinhood/android/margin/contracts/EnableMarginSourceType;", "marginFlowType", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "<init>", "(Lcom/robinhood/models/util/Money;ILcom/robinhood/android/account/strings/DisplayName;ZZLcom/robinhood/android/margin/contracts/EnableMarginSourceType;Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;)V", "getNewBuyingPower", "()Lcom/robinhood/models/util/Money;", "getMarginReviewHelperRes", "()I", "getDisplayName", "()Lcom/robinhood/android/account/strings/DisplayName;", "()Z", "getSourceType", "()Lcom/robinhood/android/margin/contracts/EnableMarginSourceType;", "getMarginFlowType", "()Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final DisplayName displayName;
        private final boolean isGold;
        private final boolean isUk;
        private final MarginEligibilityChecklistViewState4 marginFlowType;
        private final int marginReviewHelperRes;
        private final Money newBuyingPower;
        private final EnableMarginInvestingKey2 sourceType;

        /* compiled from: MarginUpgradeConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((Money) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt(), (DisplayName) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, (EnableMarginInvestingKey2) parcel.readParcelable(Args.class.getClassLoader()), (MarginEligibilityChecklistViewState4) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Money money, int i, DisplayName displayName, boolean z, boolean z2, EnableMarginInvestingKey2 enableMarginInvestingKey2, MarginEligibilityChecklistViewState4 marginEligibilityChecklistViewState4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                money = args.newBuyingPower;
            }
            if ((i2 & 2) != 0) {
                i = args.marginReviewHelperRes;
            }
            if ((i2 & 4) != 0) {
                displayName = args.displayName;
            }
            if ((i2 & 8) != 0) {
                z = args.isGold;
            }
            if ((i2 & 16) != 0) {
                z2 = args.isUk;
            }
            if ((i2 & 32) != 0) {
                enableMarginInvestingKey2 = args.sourceType;
            }
            if ((i2 & 64) != 0) {
                marginEligibilityChecklistViewState4 = args.marginFlowType;
            }
            EnableMarginInvestingKey2 enableMarginInvestingKey22 = enableMarginInvestingKey2;
            MarginEligibilityChecklistViewState4 marginEligibilityChecklistViewState42 = marginEligibilityChecklistViewState4;
            boolean z3 = z2;
            DisplayName displayName2 = displayName;
            return args.copy(money, i, displayName2, z, z3, enableMarginInvestingKey22, marginEligibilityChecklistViewState42);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getNewBuyingPower() {
            return this.newBuyingPower;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMarginReviewHelperRes() {
            return this.marginReviewHelperRes;
        }

        /* renamed from: component3, reason: from getter */
        public final DisplayName getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsGold() {
            return this.isGold;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsUk() {
            return this.isUk;
        }

        /* renamed from: component6, reason: from getter */
        public final EnableMarginInvestingKey2 getSourceType() {
            return this.sourceType;
        }

        /* renamed from: component7, reason: from getter */
        public final MarginEligibilityChecklistViewState4 getMarginFlowType() {
            return this.marginFlowType;
        }

        public final Args copy(Money newBuyingPower, int marginReviewHelperRes, DisplayName displayName, boolean isGold, boolean isUk, EnableMarginInvestingKey2 sourceType, MarginEligibilityChecklistViewState4 marginFlowType) {
            Intrinsics.checkNotNullParameter(newBuyingPower, "newBuyingPower");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            Intrinsics.checkNotNullParameter(marginFlowType, "marginFlowType");
            return new Args(newBuyingPower, marginReviewHelperRes, displayName, isGold, isUk, sourceType, marginFlowType);
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
            return Intrinsics.areEqual(this.newBuyingPower, args.newBuyingPower) && this.marginReviewHelperRes == args.marginReviewHelperRes && Intrinsics.areEqual(this.displayName, args.displayName) && this.isGold == args.isGold && this.isUk == args.isUk && Intrinsics.areEqual(this.sourceType, args.sourceType) && Intrinsics.areEqual(this.marginFlowType, args.marginFlowType);
        }

        public int hashCode() {
            return (((((((((((this.newBuyingPower.hashCode() * 31) + Integer.hashCode(this.marginReviewHelperRes)) * 31) + this.displayName.hashCode()) * 31) + Boolean.hashCode(this.isGold)) * 31) + Boolean.hashCode(this.isUk)) * 31) + this.sourceType.hashCode()) * 31) + this.marginFlowType.hashCode();
        }

        public String toString() {
            return "Args(newBuyingPower=" + this.newBuyingPower + ", marginReviewHelperRes=" + this.marginReviewHelperRes + ", displayName=" + this.displayName + ", isGold=" + this.isGold + ", isUk=" + this.isUk + ", sourceType=" + this.sourceType + ", marginFlowType=" + this.marginFlowType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.newBuyingPower, flags);
            dest.writeInt(this.marginReviewHelperRes);
            dest.writeParcelable(this.displayName, flags);
            dest.writeInt(this.isGold ? 1 : 0);
            dest.writeInt(this.isUk ? 1 : 0);
            dest.writeParcelable(this.sourceType, flags);
            dest.writeParcelable(this.marginFlowType, flags);
        }

        public Args(Money newBuyingPower, int i, DisplayName displayName, boolean z, boolean z2, EnableMarginInvestingKey2 sourceType, MarginEligibilityChecklistViewState4 marginFlowType) {
            Intrinsics.checkNotNullParameter(newBuyingPower, "newBuyingPower");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            Intrinsics.checkNotNullParameter(marginFlowType, "marginFlowType");
            this.newBuyingPower = newBuyingPower;
            this.marginReviewHelperRes = i;
            this.displayName = displayName;
            this.isGold = z;
            this.isUk = z2;
            this.sourceType = sourceType;
            this.marginFlowType = marginFlowType;
        }

        public final Money getNewBuyingPower() {
            return this.newBuyingPower;
        }

        public final int getMarginReviewHelperRes() {
            return this.marginReviewHelperRes;
        }

        public final DisplayName getDisplayName() {
            return this.displayName;
        }

        public final boolean isGold() {
            return this.isGold;
        }

        public final boolean isUk() {
            return this.isUk;
        }

        public /* synthetic */ Args(Money money, int i, DisplayName displayName, boolean z, boolean z2, EnableMarginInvestingKey2 enableMarginInvestingKey2, MarginEligibilityChecklistViewState4 marginEligibilityChecklistViewState4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(money, i, displayName, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? EnableMarginInvestingKey2.Default.INSTANCE : enableMarginInvestingKey2, (i2 & 64) != 0 ? MarginEligibilityChecklistViewState4.Default.INSTANCE : marginEligibilityChecklistViewState4);
        }

        public final EnableMarginInvestingKey2 getSourceType() {
            return this.sourceType;
        }

        public final MarginEligibilityChecklistViewState4 getMarginFlowType() {
            return this.marginFlowType;
        }
    }

    /* compiled from: MarginUpgradeConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeConfirmationFragment;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeConfirmationFragment$Args;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MarginUpgradeConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MarginUpgradeConfirmationFragment marginUpgradeConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, marginUpgradeConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarginUpgradeConfirmationFragment newInstance(Args args) {
            return (MarginUpgradeConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarginUpgradeConfirmationFragment marginUpgradeConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, marginUpgradeConfirmationFragment, args);
        }
    }
}
