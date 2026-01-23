package com.robinhood.android.margin.upgrade;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment;
import com.robinhood.android.common.margin.p083ui.MarginUpgradeStep;
import com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResponse2;
import com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: MarginUpgradeErrorFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0017\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016R\u001b\u0010\u0004\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeErrorFragment;", "Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment;", "<init>", "()V", "step", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "getStep", "()Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "step$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeErrorFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/margin/upgrade/MarginUpgradeErrorFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "MarginUpgradeErrorScreen", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Callbacks", "Args", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginUpgradeErrorFragment extends BaseMarginUpgradeStepComposeFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginUpgradeErrorFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/margin/upgrade/MarginUpgradeErrorFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: step$delegate, reason: from kotlin metadata */
    private final Lazy step = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarginUpgradeErrorFragment.step_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MarginUpgradeErrorFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: MarginUpgradeErrorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeErrorFragment$Callbacks;", "", "onMarginUpgradeErrorContinue", "", "showGoldConfirmation", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onMarginUpgradeErrorContinue(boolean showGoldConfirmation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(MarginUpgradeErrorFragment marginUpgradeErrorFragment, int i, Composer composer, int i2) {
        marginUpgradeErrorFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeErrorScreen$lambda$2(MarginUpgradeErrorFragment marginUpgradeErrorFragment, Modifier modifier, int i, int i2, Composer composer, int i3) {
        marginUpgradeErrorFragment.MarginUpgradeErrorScreen(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    public MarginUpgradeStep getStep() {
        return (MarginUpgradeStep) this.step.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarginUpgradeStep step_delegate$lambda$0(MarginUpgradeErrorFragment marginUpgradeErrorFragment) {
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) marginUpgradeErrorFragment)).getResult() == ApiToggleMarginInvestingResponse2.ENABLE_MARGIN_INVESTING_ERROR && ((Args) companion.getArgs((Fragment) marginUpgradeErrorFragment)).isUpgradingGold()) {
            return MarginUpgradeStep.GOLD_ONLY_CONFIRMATION;
        }
        return MarginUpgradeStep.MARGIN_UPGRADE_ERROR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment, com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(322341311);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(322341311, i2, -1, "com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment.ComposeContent (MarginUpgradeErrorFragment.kt:51)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2041914614, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2041914614, i3, -1, "com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment.ComposeContent.<anonymous> (MarginUpgradeErrorFragment.kt:53)");
                    }
                    MarginUpgradeErrorFragment.this.MarginUpgradeErrorScreen(Modifier.INSTANCE, composer2, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginUpgradeErrorFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void MarginUpgradeErrorScreen(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1973999753);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1973999753, i3, -1, "com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment.MarginUpgradeErrorScreen (MarginUpgradeErrorFragment.kt:62)");
            }
            Companion companion = INSTANCE;
            boolean z = ((Args) companion.getArgs((Fragment) this)).getResult() == ApiToggleMarginInvestingResponse2.ENABLE_MARGIN_INVESTING_ERROR && ((Args) companion.getArgs((Fragment) this)).isUpgradingGold();
            if (z) {
                i4 = C11048R.string.general_label_continue;
            } else {
                i4 = C11048R.string.general_label_got_it;
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.statusBarsPadding(modifier)), 0.0f, composerStartRestartGroup, 0, 1), false, ComposableLambda3.rememberComposableLambda(582415458, true, new C211221(i4, z), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(937716111, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment.MarginUpgradeErrorScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i6 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(937716111, i6, -1, "com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment.MarginUpgradeErrorScreen.<anonymous> (MarginUpgradeErrorFragment.kt:85)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    MarginUpgradeErrorFragment marginUpgradeErrorFragment = MarginUpgradeErrorFragment.this;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
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
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(C11048R.drawable.svg_ic_caution_tube_white_no_shadow, composer2, 0);
                    String strStringResource = StringResources_androidKt.stringResource(C11048R.string.error_image_content_description, composer2, 0);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    ImageKt.Image(painterPainterResource, strStringResource, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i7).m21594getXlargeD9Ej5fM(), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 0, 120);
                    String strStringResource2 = StringResources_androidKt.stringResource(C21137R.string.margin_upgrade_error_title, composer2, 0);
                    TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer2, i7).getDisplayCapsuleMedium();
                    TextAlign.Companion companion4 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource2, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8126);
                    int iM7919getCentere0LSkKk = companion4.m7919getCentere0LSkKk();
                    BentoText2.m20747BentoText38GnDrw(((Args) MarginUpgradeErrorFragment.INSTANCE.getArgs((Fragment) marginUpgradeErrorFragment)).getErrorReason(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8124);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginUpgradeErrorFragment.MarginUpgradeErrorScreen$lambda$2(this.f$0, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: MarginUpgradeErrorFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment$MarginUpgradeErrorScreen$1 */
    static final class C211221 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ int $errorButtonText;
        final /* synthetic */ boolean $showGoldConfirmation;

        C211221(int i, boolean z) {
            this.$errorButtonText = i;
            this.$showGoldConfirmation = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(582415458, i, -1, "com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment.MarginUpgradeErrorScreen.<anonymous> (MarginUpgradeErrorFragment.kt:77)");
            }
            String string2 = MarginUpgradeErrorFragment.this.getString(this.$errorButtonText);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(MarginUpgradeErrorFragment.this) | composer.changed(this.$showGoldConfirmation);
            final MarginUpgradeErrorFragment marginUpgradeErrorFragment = MarginUpgradeErrorFragment.this;
            final boolean z = this.$showGoldConfirmation;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment$MarginUpgradeErrorScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginUpgradeErrorFragment.C211221.invoke$lambda$1$lambda$0(marginUpgradeErrorFragment, z);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, (Function0) objRememberedValue, string2, false, null, false, null, null, false, null, false, composer, 0, 0, 65343);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(MarginUpgradeErrorFragment marginUpgradeErrorFragment, boolean z) {
            marginUpgradeErrorFragment.getCallbacks().onMarginUpgradeErrorContinue(z);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MarginUpgradeErrorFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeErrorFragment$Args;", "Landroid/os/Parcelable;", "result", "Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "errorReason", "", "isUpgradingGold", "", "<init>", "(Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;Ljava/lang/String;Z)V", "getResult", "()Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "getErrorReason", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String errorReason;
        private final boolean isUpgradingGold;
        private final ApiToggleMarginInvestingResponse2 result;

        /* compiled from: MarginUpgradeErrorFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiToggleMarginInvestingResponse2) parcel.readParcelable(Args.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiToggleMarginInvestingResponse2 apiToggleMarginInvestingResponse2, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                apiToggleMarginInvestingResponse2 = args.result;
            }
            if ((i & 2) != 0) {
                str = args.errorReason;
            }
            if ((i & 4) != 0) {
                z = args.isUpgradingGold;
            }
            return args.copy(apiToggleMarginInvestingResponse2, str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiToggleMarginInvestingResponse2 getResult() {
            return this.result;
        }

        /* renamed from: component2, reason: from getter */
        public final String getErrorReason() {
            return this.errorReason;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsUpgradingGold() {
            return this.isUpgradingGold;
        }

        public final Args copy(ApiToggleMarginInvestingResponse2 result, String errorReason, boolean isUpgradingGold) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            return new Args(result, errorReason, isUpgradingGold);
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
            return this.result == args.result && Intrinsics.areEqual(this.errorReason, args.errorReason) && this.isUpgradingGold == args.isUpgradingGold;
        }

        public int hashCode() {
            return (((this.result.hashCode() * 31) + this.errorReason.hashCode()) * 31) + Boolean.hashCode(this.isUpgradingGold);
        }

        public String toString() {
            return "Args(result=" + this.result + ", errorReason=" + this.errorReason + ", isUpgradingGold=" + this.isUpgradingGold + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.result, flags);
            dest.writeString(this.errorReason);
            dest.writeInt(this.isUpgradingGold ? 1 : 0);
        }

        public Args(ApiToggleMarginInvestingResponse2 result, String errorReason, boolean z) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            this.result = result;
            this.errorReason = errorReason;
            this.isUpgradingGold = z;
        }

        public /* synthetic */ Args(ApiToggleMarginInvestingResponse2 apiToggleMarginInvestingResponse2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(apiToggleMarginInvestingResponse2, str, (i & 4) != 0 ? false : z);
        }

        public final ApiToggleMarginInvestingResponse2 getResult() {
            return this.result;
        }

        public final String getErrorReason() {
            return this.errorReason;
        }

        public final boolean isUpgradingGold() {
            return this.isUpgradingGold;
        }
    }

    /* compiled from: MarginUpgradeErrorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeErrorFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeErrorFragment;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeErrorFragment$Args;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MarginUpgradeErrorFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MarginUpgradeErrorFragment marginUpgradeErrorFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, marginUpgradeErrorFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarginUpgradeErrorFragment newInstance(Args args) {
            return (MarginUpgradeErrorFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarginUpgradeErrorFragment marginUpgradeErrorFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, marginUpgradeErrorFragment, args);
        }
    }
}
