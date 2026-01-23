package com.robinhood.android.margin.upgrade;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment;
import com.robinhood.android.common.margin.p083ui.MarginUpgradeStep;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.margin.upgrade.MarginUpgradeEducationFragment;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarginUpgradeEducationFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0003\u0018\u0019\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\r\u0010\u0014\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001dX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeEducationFragment;", "Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment;", "<init>", "()V", "step", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "getStep", "()Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "callbacks", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeEducationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/margin/upgrade/MarginUpgradeEducationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "MarginUpgradeStepComposable", "(Landroidx/compose/runtime/Composer;I)V", "onDisclosureClick", "onContinueButtonClick", "Callbacks", "Args", "Companion", "feature-margin-upgrade_externalDebug", "hasScrolledToEnd", "", "shouldScrollToEnd"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginUpgradeEducationFragment extends BaseMarginUpgradeStepComposeFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginUpgradeEducationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/margin/upgrade/MarginUpgradeEducationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final MarginUpgradeStep step = MarginUpgradeStep.EDUCATION;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeEducationFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MarginUpgradeEducationFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: MarginUpgradeEducationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeEducationFragment$Callbacks;", "", "onEducationContinue", "", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEducationContinue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeStepComposable$lambda$12(MarginUpgradeEducationFragment marginUpgradeEducationFragment, int i, Composer composer, int i2) {
        marginUpgradeEducationFragment.MarginUpgradeStepComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    public MarginUpgradeStep getStep() {
        return this.step;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        BaseFragments2.setContentBelowToolbar(this, viewRequireView);
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    public void MarginUpgradeStepComposable(Composer composer, final int i) {
        int i2;
        final MarginUpgradeEducationFragment marginUpgradeEducationFragment;
        Composer composerStartRestartGroup = composer.startRestartGroup(1822893115);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            marginUpgradeEducationFragment = this;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1822893115, i2, -1, "com.robinhood.android.margin.upgrade.MarginUpgradeEducationFragment.MarginUpgradeStepComposable (MarginUpgradeEducationFragment.kt:75)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            boolean isDay = bentoTheme.getColors(composerStartRestartGroup, i3).getIsDay();
            final int i4 = isDay ? C21137R.drawable.gains_chart_day : C21137R.drawable.gains_chart_night;
            final int i5 = isDay ? C21137R.drawable.losses_chart_day : C21137R.drawable.losses_chart_night;
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeEducationFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(TopBarScrollState3.isScrolledToTheEnd(lazyListStateRememberLazyListState));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf = Boolean.valueOf(MarginUpgradeStepComposable$lambda$4(snapshotState));
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new MarginUpgradeEducationFragment2(lazyListStateRememberLazyListState, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            final boolean zIsSmallScreen = MarginUpgradeEducationFragment6.isSmallScreen((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration()));
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
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
            Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChanged2 = composerStartRestartGroup.changed(zIsSmallScreen) | composerStartRestartGroup.changed(i4) | composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(i5);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeEducationFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginUpgradeEducationFragment.MarginUpgradeStepComposable$lambda$11$lambda$8$lambda$7(zIsSmallScreen, i4, this, i5, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierWeight$default, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue4, composerStartRestartGroup, 0, 508);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            marginUpgradeEducationFragment = this;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(marginUpgradeEducationFragment);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeEducationFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarginUpgradeEducationFragment.MarginUpgradeStepComposable$lambda$11$lambda$10$lambda$9(this.f$0, snapshotState4, snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Function0 function0 = (Function0) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            if (((Args) INSTANCE.getArgs((Fragment) marginUpgradeEducationFragment)).isGold()) {
                composerStartRestartGroup.startReplaceGroup(279208359);
                BentoButtonKt.BentoGoldButton((Function0<Unit>) function0, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, false, false, (String) null, composerStartRestartGroup, 384, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(279458219);
                BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 384, 0, 8184);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeEducationFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginUpgradeEducationFragment.MarginUpgradeStepComposable$lambda$12(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean MarginUpgradeStepComposable$lambda$2(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MarginUpgradeStepComposable$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MarginUpgradeStepComposable$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeStepComposable$lambda$11$lambda$8$lambda$7(final boolean z, final int i, final MarginUpgradeEducationFragment marginUpgradeEducationFragment, final int i2, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1192467792, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeEducationFragment$MarginUpgradeStepComposable$2$1$1$1
            public final void invoke(LazyItemScope item, Composer composer, int i3) {
                int i4;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i3 & 6) == 0) {
                    i4 = i3 | (composer.changed(item) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i4 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1192467792, i4, -1, "com.robinhood.android.margin.upgrade.MarginUpgradeEducationFragment.MarginUpgradeStepComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarginUpgradeEducationFragment.kt:118)");
                }
                Modifier modifierFillParentMaxSize$default = z ? Modifier.INSTANCE : LazyItemScope.fillParentMaxSize$default(item, Modifier.INSTANCE, 0.0f, 1, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                int i5 = i;
                MarginUpgradeEducationFragment marginUpgradeEducationFragment2 = marginUpgradeEducationFragment;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillParentMaxSize$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String strStringResource = StringResources_androidKt.stringResource(C21137R.string.margin_upgrade_education_title, composer, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i6).getDisplayCapsuleMedium();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i6).m21425getFg0d7_KjU();
                TextAlign.Companion companion3 = TextAlign.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 0, 0, 8122);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21137R.string.amplify_your_returns, composer, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer, i6).m21456getPositive0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i6).getDisplayCapsuleMedium(), composer, 0, 0, 8122);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composer, 0);
                ImageKt.Image(PainterResources_androidKt.painterResource(i5, composer, 0), (String) null, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), companion.getCenter(), ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer, 28080, 96);
                Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composer, 0);
                BentoMarkdownText2.BentoMarkdownText(((MarginUpgradeEducationFragment.Args) MarginUpgradeEducationFragment.INSTANCE.getArgs((Fragment) marginUpgradeEducationFragment2)).getGainsContent().getMarkdown2(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, companion3.m7919getCentere0LSkKk(), 0L, 0L, false, composer, BentoMarkdownText.$stable << 15, 29), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme.getSpacing(composer, i6).m21596getXxlargeD9Ej5fM()), composer, 0);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-426668039, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeEducationFragment$MarginUpgradeStepComposable$2$1$1$2
            public final void invoke(LazyItemScope item, Composer composer, int i3) {
                int i4;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i3 & 6) == 0) {
                    i4 = i3 | (composer.changed(item) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i4 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-426668039, i4, -1, "com.robinhood.android.margin.upgrade.MarginUpgradeEducationFragment.MarginUpgradeStepComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MarginUpgradeEducationFragment.kt:155)");
                }
                Modifier modifierFillParentMaxSize$default = z ? Modifier.INSTANCE : LazyItemScope.fillParentMaxSize$default(item, Modifier.INSTANCE, 0.0f, 1, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                int i5 = i2;
                MarginUpgradeEducationFragment marginUpgradeEducationFragment2 = marginUpgradeEducationFragment;
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillParentMaxSize$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String strStringResource = StringResources_androidKt.stringResource(C21137R.string.margin_upgrade_education_title_alternate, composer, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i6).getDisplayCapsuleMedium();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i6).m21425getFg0d7_KjU();
                TextAlign.Companion companion3 = TextAlign.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 0, 0, 8122);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21137R.string.magnify_your_losses, composer, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer, i6).getSol()), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i6).getDisplayCapsuleMedium(), composer, 0, 0, 8122);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composer, 0);
                ImageKt.Image(PainterResources_androidKt.painterResource(i5, composer, 0), (String) null, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), companion.getCenter(), ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer, 28080, 96);
                Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composer, 0);
                MarginUpgradeEducationFragment.Companion companion5 = MarginUpgradeEducationFragment.INSTANCE;
                BentoMarkdownText2.BentoMarkdownText(((MarginUpgradeEducationFragment.Args) companion5.getArgs((Fragment) marginUpgradeEducationFragment2)).getLossesContent().getMarkdown2(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, companion3.m7919getCentere0LSkKk(), 0L, 0L, false, composer, BentoMarkdownText.$stable << 15, 29), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme.getSpacing(composer, i6).m21594getXlargeD9Ej5fM()), composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(marginUpgradeEducationFragment2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MarginUpgradeEducationFragment5(marginUpgradeEducationFragment2);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion4, false, null, null, (Function0) ((KFunction) objRememberedValue), 7, null), BaseMarginUpgradeStepComposeFragment.getEventDescriptor$default(marginUpgradeEducationFragment2, Component.ComponentType.BUTTON, "view_margin_risks_disclosure", null, null, 12, null), true, false, false, true, false, null, 108, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composer, 48);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierAutoLogEvents$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                String strStringResource2 = StringResources_androidKt.stringResource(C21137R.string.margin_disclosure, composer, 0);
                TextStyle textS = bentoTheme.getTypography(composer, i6).getTextS();
                int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
                BentoText2.m20747BentoText38GnDrw(strStringResource2, null, Color.m6701boximpl(bentoTheme.getColors(composer, i6).m21426getFg20d7_KjU()), null, FontWeight.INSTANCE.getBold(), TextDecoration.INSTANCE.getUnderline(), TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textS, composer, 221184, 0, 8074);
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion4, bentoTheme.getSpacing(composer, i6).m21595getXsmallD9Ej5fM()), composer, 0);
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.POP_OUT_16), null, bentoTheme.getColors(composer, i6).m21426getFg20d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
                composer.endNode();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme.getSpacing(composer, i6).m21595getXsmallD9Ej5fM()), composer, 0);
                composer.startReplaceGroup(85750488);
                if (((MarginUpgradeEducationFragment.Args) companion5.getArgs((Fragment) marginUpgradeEducationFragment2)).isInSlipRegionGate()) {
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21137R.string.gated_stock_lending_margin_disclaimer, composer, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer, i6).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i6).getTextS(), composer, 0, 0, 8122);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme.getSpacing(composer, i6).m21595getXsmallD9Ej5fM()), composer, 0);
                }
                composer.endReplaceGroup();
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeStepComposable$lambda$11$lambda$10$lambda$9(MarginUpgradeEducationFragment marginUpgradeEducationFragment, SnapshotState4 snapshotState4, SnapshotState snapshotState) {
        if (MarginUpgradeStepComposable$lambda$2(snapshotState4)) {
            marginUpgradeEducationFragment.onContinueButtonClick();
        } else {
            MarginUpgradeStepComposable$lambda$5(snapshotState, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDisclosureClick() {
        BaseMarginUpgradeStepComposeFragment.logTap$default(this, null, null, UserInteractionEventData.Action.VIEW_MARGIN_UPGRADE_DISCLOSURE_STATEMENT, 3, null);
        WebUtils.viewUrl$default(requireContext(), getString(((Args) INSTANCE.getArgs((Fragment) this)).getMarginDisclosureUrlRes()), 0, 4, (Object) null);
    }

    private final void onContinueButtonClick() {
        BaseMarginUpgradeStepComposeFragment.logTap$default(this, Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null);
        getCallbacks().onEducationContinue();
    }

    /* compiled from: MarginUpgradeEducationFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\bJ\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeEducationFragment$Args;", "Landroid/os/Parcelable;", "isGold", "", "gainsContent", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "lossesContent", "marginDisclosureUrlRes", "", "isInSlipRegionGate", "<init>", "(ZLcom/robinhood/staticcontent/model/OtherMarkdown;Lcom/robinhood/staticcontent/model/OtherMarkdown;IZ)V", "()Z", "getGainsContent", "()Lcom/robinhood/staticcontent/model/OtherMarkdown;", "getLossesContent", "getMarginDisclosureUrlRes", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final OtherMarkdown gainsContent;
        private final boolean isGold;
        private final boolean isInSlipRegionGate;
        private final OtherMarkdown lossesContent;
        private final int marginDisclosureUrlRes;

        /* compiled from: MarginUpgradeEducationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                OtherMarkdown otherMarkdown = (OtherMarkdown) parcel.readParcelable(Args.class.getClassLoader());
                OtherMarkdown otherMarkdown2 = (OtherMarkdown) parcel.readParcelable(Args.class.getClassLoader());
                boolean z3 = true;
                int i = parcel.readInt();
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new Args(z2, otherMarkdown, otherMarkdown2, i, z3);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, OtherMarkdown otherMarkdown, OtherMarkdown otherMarkdown2, int i, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = args.isGold;
            }
            if ((i2 & 2) != 0) {
                otherMarkdown = args.gainsContent;
            }
            if ((i2 & 4) != 0) {
                otherMarkdown2 = args.lossesContent;
            }
            if ((i2 & 8) != 0) {
                i = args.marginDisclosureUrlRes;
            }
            if ((i2 & 16) != 0) {
                z2 = args.isInSlipRegionGate;
            }
            boolean z3 = z2;
            OtherMarkdown otherMarkdown3 = otherMarkdown2;
            return args.copy(z, otherMarkdown, otherMarkdown3, i, z3);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsGold() {
            return this.isGold;
        }

        /* renamed from: component2, reason: from getter */
        public final OtherMarkdown getGainsContent() {
            return this.gainsContent;
        }

        /* renamed from: component3, reason: from getter */
        public final OtherMarkdown getLossesContent() {
            return this.lossesContent;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMarginDisclosureUrlRes() {
            return this.marginDisclosureUrlRes;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsInSlipRegionGate() {
            return this.isInSlipRegionGate;
        }

        public final Args copy(boolean isGold, OtherMarkdown gainsContent, OtherMarkdown lossesContent, int marginDisclosureUrlRes, boolean isInSlipRegionGate) {
            Intrinsics.checkNotNullParameter(gainsContent, "gainsContent");
            Intrinsics.checkNotNullParameter(lossesContent, "lossesContent");
            return new Args(isGold, gainsContent, lossesContent, marginDisclosureUrlRes, isInSlipRegionGate);
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
            return this.isGold == args.isGold && Intrinsics.areEqual(this.gainsContent, args.gainsContent) && Intrinsics.areEqual(this.lossesContent, args.lossesContent) && this.marginDisclosureUrlRes == args.marginDisclosureUrlRes && this.isInSlipRegionGate == args.isInSlipRegionGate;
        }

        public int hashCode() {
            return (((((((Boolean.hashCode(this.isGold) * 31) + this.gainsContent.hashCode()) * 31) + this.lossesContent.hashCode()) * 31) + Integer.hashCode(this.marginDisclosureUrlRes)) * 31) + Boolean.hashCode(this.isInSlipRegionGate);
        }

        public String toString() {
            return "Args(isGold=" + this.isGold + ", gainsContent=" + this.gainsContent + ", lossesContent=" + this.lossesContent + ", marginDisclosureUrlRes=" + this.marginDisclosureUrlRes + ", isInSlipRegionGate=" + this.isInSlipRegionGate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isGold ? 1 : 0);
            dest.writeParcelable(this.gainsContent, flags);
            dest.writeParcelable(this.lossesContent, flags);
            dest.writeInt(this.marginDisclosureUrlRes);
            dest.writeInt(this.isInSlipRegionGate ? 1 : 0);
        }

        public Args(boolean z, OtherMarkdown gainsContent, OtherMarkdown lossesContent, int i, boolean z2) {
            Intrinsics.checkNotNullParameter(gainsContent, "gainsContent");
            Intrinsics.checkNotNullParameter(lossesContent, "lossesContent");
            this.isGold = z;
            this.gainsContent = gainsContent;
            this.lossesContent = lossesContent;
            this.marginDisclosureUrlRes = i;
            this.isInSlipRegionGate = z2;
        }

        public final boolean isGold() {
            return this.isGold;
        }

        public final OtherMarkdown getGainsContent() {
            return this.gainsContent;
        }

        public final OtherMarkdown getLossesContent() {
            return this.lossesContent;
        }

        public final int getMarginDisclosureUrlRes() {
            return this.marginDisclosureUrlRes;
        }

        public final boolean isInSlipRegionGate() {
            return this.isInSlipRegionGate;
        }
    }

    /* compiled from: MarginUpgradeEducationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeEducationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeEducationFragment;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeEducationFragment$Args;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MarginUpgradeEducationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MarginUpgradeEducationFragment marginUpgradeEducationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, marginUpgradeEducationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarginUpgradeEducationFragment newInstance(Args args) {
            return (MarginUpgradeEducationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarginUpgradeEducationFragment marginUpgradeEducationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, marginUpgradeEducationFragment, args);
        }
    }
}
