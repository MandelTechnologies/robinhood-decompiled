package com.robinhood.android.optionschain;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.painter.Painter;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.optionschain.OptionSideBySideUpsellBottomSheetFragment;
import com.robinhood.android.optionschain.sbschain.logging.OptionSideBySideChainLogger;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.librobinhood.data.store.OptionSideBySideChainStore;
import com.robinhood.models.p320db.OptionLevel;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: OptionSideBySideUpsellBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002)*B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u001e\u001a\u00020\u001fH\u0017¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u001fH\u0016J\t\u0010\"\u001a\u00020#H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionSideBySideUpsellBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "optionSideBySideChainLogger", "Lcom/robinhood/android/optionschain/sbschain/logging/OptionSideBySideChainLogger;", "getOptionSideBySideChainLogger", "()Lcom/robinhood/android/optionschain/sbschain/logging/OptionSideBySideChainLogger;", "setOptionSideBySideChainLogger", "(Lcom/robinhood/android/optionschain/sbschain/logging/OptionSideBySideChainLogger;)V", "optionSideBySideChainStore", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "getOptionSideBySideChainStore", "()Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;", "setOptionSideBySideChainStore", "(Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainStore;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getScreenEventComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onStart", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionSideBySideUpsellBottomSheetFragment extends GenericComposeBottomSheetDialogFragment implements RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
    public OptionSideBySideChainLogger optionSideBySideChainLogger;
    public OptionSideBySideChainStore optionSideBySideChainStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(OptionSideBySideUpsellBottomSheetFragment optionSideBySideUpsellBottomSheetFragment, int i, Composer composer, int i2) {
        optionSideBySideUpsellBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
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

    public final OptionSideBySideChainLogger getOptionSideBySideChainLogger() {
        OptionSideBySideChainLogger optionSideBySideChainLogger = this.optionSideBySideChainLogger;
        if (optionSideBySideChainLogger != null) {
            return optionSideBySideChainLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionSideBySideChainLogger");
        return null;
    }

    public final void setOptionSideBySideChainLogger(OptionSideBySideChainLogger optionSideBySideChainLogger) {
        Intrinsics.checkNotNullParameter(optionSideBySideChainLogger, "<set-?>");
        this.optionSideBySideChainLogger = optionSideBySideChainLogger;
    }

    public final OptionSideBySideChainStore getOptionSideBySideChainStore() {
        OptionSideBySideChainStore optionSideBySideChainStore = this.optionSideBySideChainStore;
        if (optionSideBySideChainStore != null) {
            return optionSideBySideChainStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("optionSideBySideChainStore");
        return null;
    }

    public final void setOptionSideBySideChainStore(OptionSideBySideChainStore optionSideBySideChainStore) {
        Intrinsics.checkNotNullParameter(optionSideBySideChainStore, "<set-?>");
        this.optionSideBySideChainStore = optionSideBySideChainStore;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.OPTION_CHAIN, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return new Component(Component.ComponentType.BOTTOM_SHEET, "sbs_nux_popup", null, 4, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OptionsContext(((Args) INSTANCE.getArgs((Fragment) this)).getChainIdsForLogging(), null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null);
    }

    /* compiled from: OptionSideBySideUpsellBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionschain.OptionSideBySideUpsellBottomSheetFragment$ComposeContent$1 */
    static final class C241331 implements Function2<Composer, Integer, Unit> {
        C241331() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            long jM21372getBg20d7_KjU;
            Painter painterPainterResource;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(441505736, i, -1, "com.robinhood.android.optionschain.OptionSideBySideUpsellBottomSheetFragment.ComposeContent.<anonymous> (OptionSideBySideUpsellBottomSheetFragment.kt:61)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Companion companion2 = OptionSideBySideUpsellBottomSheetFragment.INSTANCE;
            if (((Args) companion2.getArgs((Fragment) OptionSideBySideUpsellBottomSheetFragment.this)).isDay()) {
                composer.startReplaceGroup(-914746038);
                jM21372getBg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU();
            } else {
                composer.startReplaceGroup(-914745205);
                jM21372getBg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21372getBg20d7_KjU();
            }
            composer.endReplaceGroup();
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, jM21372getBg20d7_KjU, null, 2, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierM4872backgroundbw27NRU$default, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            final OptionSideBySideUpsellBottomSheetFragment optionSideBySideUpsellBottomSheetFragment = OptionSideBySideUpsellBottomSheetFragment.this;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
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
            if (((Args) companion2.getArgs((Fragment) optionSideBySideUpsellBottomSheetFragment)).isDay() && Intrinsics.areEqual(((Args) companion2.getArgs((Fragment) optionSideBySideUpsellBottomSheetFragment)).getOptionLevel(), OptionLevel.LEVEL_3)) {
                composer.startReplaceGroup(-159153919);
                painterPainterResource = PainterResources_androidKt.painterResource(C24135R.drawable.option_side_by_side_chain_upsell_l3_day, composer, 0);
                composer.endReplaceGroup();
            } else if (!((Args) companion2.getArgs((Fragment) optionSideBySideUpsellBottomSheetFragment)).isDay() && Intrinsics.areEqual(((Args) companion2.getArgs((Fragment) optionSideBySideUpsellBottomSheetFragment)).getOptionLevel(), OptionLevel.LEVEL_3)) {
                composer.startReplaceGroup(-159148221);
                painterPainterResource = PainterResources_androidKt.painterResource(C24135R.drawable.option_side_by_side_chain_upsell_l3_night, composer, 0);
                composer.endReplaceGroup();
            } else if (((Args) companion2.getArgs((Fragment) optionSideBySideUpsellBottomSheetFragment)).isDay() && Intrinsics.areEqual(((Args) companion2.getArgs((Fragment) optionSideBySideUpsellBottomSheetFragment)).getOptionLevel(), OptionLevel.LEVEL_2)) {
                composer.startReplaceGroup(-159142495);
                painterPainterResource = PainterResources_androidKt.painterResource(C24135R.drawable.option_side_by_side_chain_upsell_l2_day, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-159139293);
                painterPainterResource = PainterResources_androidKt.painterResource(C24135R.drawable.option_side_by_side_chain_upsell_l2_night, composer, 0);
                composer.endReplaceGroup();
            }
            BentoImage.BentoImage(painterPainterResource, null, null, null, null, 0.0f, null, composer, 48, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 5, null);
            String strStringResource = StringResources_androidKt.stringResource(C24135R.string.option_side_by_side_chain_nux_bottom_sheet_title, composer, 0);
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 0, 0, 8124);
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 7, null);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24135R.string.option_side_by_side_chain_nux_bottom_sheet_subtitle, composer, 0), modifierM5146paddingqDBjuR0$default2, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8124);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            String strStringResource2 = StringResources_androidKt.stringResource(C24135R.string.option_side_by_side_chain_nux_bottom_sheet_primary_button, composer, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(C24135R.string.option_side_by_side_chain_nux_bottom_sheet_secondary_button, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(optionSideBySideUpsellBottomSheetFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionschain.OptionSideBySideUpsellBottomSheetFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionSideBySideUpsellBottomSheetFragment.C241331.invoke$lambda$4$lambda$1$lambda$0(optionSideBySideUpsellBottomSheetFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(optionSideBySideUpsellBottomSheetFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionschain.OptionSideBySideUpsellBottomSheetFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionSideBySideUpsellBottomSheetFragment.C241331.invoke$lambda$4$lambda$3$lambda$2(optionSideBySideUpsellBottomSheetFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierFillMaxWidth$default, null, null, false, null, null, function0, strStringResource2, false, null, false, (Function0) objRememberedValue2, strStringResource3, false, null, false, composer, 6, 0, 59198);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(OptionSideBySideUpsellBottomSheetFragment optionSideBySideUpsellBottomSheetFragment) {
            LifecycleHostCoroutineScope lifecycleScope;
            optionSideBySideUpsellBottomSheetFragment.getOptionSideBySideChainLogger().logNuxBottomSheetPositiveAction(((Args) OptionSideBySideUpsellBottomSheetFragment.INSTANCE.getArgs((Fragment) optionSideBySideUpsellBottomSheetFragment)).getChainIdsForLogging());
            optionSideBySideUpsellBottomSheetFragment.getOptionSideBySideChainStore().toggleSideBySideChain(true);
            FragmentActivity fragmentActivityRequireActivity = optionSideBySideUpsellBottomSheetFragment.requireActivity();
            OptionChainActivity optionChainActivity = fragmentActivityRequireActivity instanceof OptionChainActivity ? (OptionChainActivity) fragmentActivityRequireActivity : null;
            if (optionChainActivity != null && (lifecycleScope = optionChainActivity.getLifecycleScope()) != null) {
                BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new OptionSideBySideUpsellBottomSheetFragment2(optionChainActivity, null), 3, null);
            }
            optionSideBySideUpsellBottomSheetFragment.dismiss();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(OptionSideBySideUpsellBottomSheetFragment optionSideBySideUpsellBottomSheetFragment) {
            optionSideBySideUpsellBottomSheetFragment.dismiss();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1321262064);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1321262064, i2, -1, "com.robinhood.android.optionschain.OptionSideBySideUpsellBottomSheetFragment.ComposeContent (OptionSideBySideUpsellBottomSheetFragment.kt:59)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(441505736, true, new C241331(), composerStartRestartGroup, 54), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionschain.OptionSideBySideUpsellBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionSideBySideUpsellBottomSheetFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getOptionSideBySideChainStore().recordSideBySideChainBottomSheetShown();
    }

    /* compiled from: OptionSideBySideUpsellBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionSideBySideUpsellBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "isDay", "", "optionLevel", "", "chainIdsForLogging", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "()Z", "getOptionLevel", "()Ljava/lang/String;", "getChainIdsForLogging", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String chainIdsForLogging;
        private final boolean isDay;
        private final String optionLevel;

        /* compiled from: OptionSideBySideUpsellBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0, parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.isDay;
            }
            if ((i & 2) != 0) {
                str = args.optionLevel;
            }
            if ((i & 4) != 0) {
                str2 = args.chainIdsForLogging;
            }
            return args.copy(z, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsDay() {
            return this.isDay;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOptionLevel() {
            return this.optionLevel;
        }

        /* renamed from: component3, reason: from getter */
        public final String getChainIdsForLogging() {
            return this.chainIdsForLogging;
        }

        public final Args copy(boolean isDay, String optionLevel, String chainIdsForLogging) {
            Intrinsics.checkNotNullParameter(chainIdsForLogging, "chainIdsForLogging");
            return new Args(isDay, optionLevel, chainIdsForLogging);
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
            return this.isDay == args.isDay && Intrinsics.areEqual(this.optionLevel, args.optionLevel) && Intrinsics.areEqual(this.chainIdsForLogging, args.chainIdsForLogging);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isDay) * 31;
            String str = this.optionLevel;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.chainIdsForLogging.hashCode();
        }

        public String toString() {
            return "Args(isDay=" + this.isDay + ", optionLevel=" + this.optionLevel + ", chainIdsForLogging=" + this.chainIdsForLogging + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isDay ? 1 : 0);
            dest.writeString(this.optionLevel);
            dest.writeString(this.chainIdsForLogging);
        }

        public Args(boolean z, String str, String chainIdsForLogging) {
            Intrinsics.checkNotNullParameter(chainIdsForLogging, "chainIdsForLogging");
            this.isDay = z;
            this.optionLevel = str;
            this.chainIdsForLogging = chainIdsForLogging;
        }

        public final boolean isDay() {
            return this.isDay;
        }

        public final String getOptionLevel() {
            return this.optionLevel;
        }

        public final String getChainIdsForLogging() {
            return this.chainIdsForLogging;
        }
    }

    /* compiled from: OptionSideBySideUpsellBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionSideBySideUpsellBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionschain/OptionSideBySideUpsellBottomSheetFragment;", "Lcom/robinhood/android/optionschain/OptionSideBySideUpsellBottomSheetFragment$Args;", "<init>", "()V", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionSideBySideUpsellBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionSideBySideUpsellBottomSheetFragment optionSideBySideUpsellBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionSideBySideUpsellBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionSideBySideUpsellBottomSheetFragment newInstance(Args args) {
            return (OptionSideBySideUpsellBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionSideBySideUpsellBottomSheetFragment optionSideBySideUpsellBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionSideBySideUpsellBottomSheetFragment, args);
        }
    }
}
