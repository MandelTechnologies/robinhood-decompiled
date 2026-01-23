package com.robinhood.feature.sweep.onboarding.fragments;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.lib.sweep.SweepOnboardingEventLogger;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingAgreementsFragment;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import com.robinhood.models.api.bonfire.ApiSweepFlow;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SweepOnboardingAgreementsFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001b\u001c\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\r\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0017H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u000bX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingAgreementsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "sweepOnboardingEventLogger", "Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "getSweepOnboardingEventLogger", "()Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "setSweepOnboardingEventLogger", "(Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;)V", "excludeFromAnalyticsLogging", "", "getExcludeFromAnalyticsLogging", "()Z", "analyticsScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "callbacks", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingAgreementsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingAgreementsFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onStart", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onStop", "Callbacks", "Args", "Companion", "feature-sweep-onboarding_externalDebug", "isButtonLoading", "hasSeenBottom", "allCheckboxesChecked"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class SweepOnboardingAgreementsFragment extends GenericComposeFragment {
    public SweepOnboardingEventLogger sweepOnboardingEventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SweepOnboardingAgreementsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingAgreementsFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean excludeFromAnalyticsLogging = true;
    private final Screen analyticsScreen = new Screen(Screen.Name.SWEEP_ONBOARDING_AGREEMENTS_LIST, null, null, null, 14, null);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingAgreementsFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof SweepOnboardingAgreementsFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: SweepOnboardingAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingAgreementsFragment$Callbacks;", "", "onAgreementsAccepted", "", "onDisplayAgreement", "agreement", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAgreementsAccepted();

        void onDisplayAgreement(ApiGoldSweepAgreement agreement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$24(SweepOnboardingAgreementsFragment sweepOnboardingAgreementsFragment, int i, Composer composer, int i2) {
        sweepOnboardingAgreementsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final SweepOnboardingEventLogger getSweepOnboardingEventLogger() {
        SweepOnboardingEventLogger sweepOnboardingEventLogger = this.sweepOnboardingEventLogger;
        if (sweepOnboardingEventLogger != null) {
            return sweepOnboardingEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sweepOnboardingEventLogger");
        return null;
    }

    public final void setSweepOnboardingEventLogger(SweepOnboardingEventLogger sweepOnboardingEventLogger) {
        Intrinsics.checkNotNullParameter(sweepOnboardingEventLogger, "<set-?>");
        this.sweepOnboardingEventLogger = sweepOnboardingEventLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getSweepOnboardingEventLogger().logScreenAppear(this.analyticsScreen);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        int i3;
        final SnapshotState snapshotState;
        Composer composer2;
        int i4;
        String strStringResource;
        final SweepOnboardingAgreementsFragment sweepOnboardingAgreementsFragment = this;
        Composer composerStartRestartGroup = composer.startRestartGroup(615351762);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(sweepOnboardingAgreementsFragment) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(615351762, i2, -1, "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingAgreementsFragment.ComposeContent (SweepOnboardingAgreementsFragment.kt:64)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState snapshotState3 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            SnapshotState snapshotState4 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf = Boolean.valueOf(scrollStateRememberScrollState.getCanScrollForward());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new SweepOnboardingAgreementsFragment2(scrollStateRememberScrollState, snapshotState3, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierSystemBarsPadding);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, companion2, 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            Companion companion5 = INSTANCE;
            String title = ((Args) companion5.getArgs((Fragment) sweepOnboardingAgreementsFragment)).getGoldCombinedAgreements().getTitle();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8184);
            BentoText2.m20747BentoText38GnDrw(((Args) companion5.getArgs((Fragment) sweepOnboardingAgreementsFragment)).getGoldCombinedAgreements().getDescription(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 0, 0, 8184);
            BentoBaseRowState bentoBaseRowState = new BentoBaseRowState(null, new BentoBaseRowState.Text.Plain(((Args) companion5.getArgs((Fragment) sweepOnboardingAgreementsFragment)).getGoldCombinedAgreements().getAgreements().get(0).getTitle()), null, null, null, false, false, 125, null);
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(sweepOnboardingAgreementsFragment);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function0() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingAgreementsFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SweepOnboardingAgreementsFragment.ComposeContent$lambda$23$lambda$18$lambda$11$lambda$10(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i6 = BentoBaseRowState.$stable;
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierM5146paddingqDBjuR0$default, bentoBaseRowState, false, false, false, 0L, (Function0) objRememberedValue5, composerStartRestartGroup, i6 << 3, 60);
            BentoBaseRowState bentoBaseRowState2 = new BentoBaseRowState(null, new BentoBaseRowState.Text.Plain(((Args) companion5.getArgs((Fragment) sweepOnboardingAgreementsFragment)).getGoldCombinedAgreements().getAgreements().get(1).getTitle()), null, null, null, false, false, 125, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(sweepOnboardingAgreementsFragment);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingAgreementsFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SweepOnboardingAgreementsFragment.ComposeContent$lambda$23$lambda$18$lambda$13$lambda$12(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState2, false, false, false, 0L, (Function0) objRememberedValue6, composerStartRestartGroup, i6 << 3, 61);
            Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String goldFreeDays = ((Args) companion5.getArgs((Fragment) sweepOnboardingAgreementsFragment)).getGoldCombinedAgreements().getGoldFreeDays();
            BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
            TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
            long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
            int i7 = BentoMarkdownText.$stable;
            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(textS, 0, jM21425getFg0d7_KjU, jM21425getFg0d7_KjU2, false, composerStartRestartGroup, i7 << 15, 18);
            int i8 = MarkdownStyle.$stable;
            BentoMarkdownText2.BentoMarkdownText(goldFreeDays, (Modifier) null, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, i8 << 6, 26);
            composerStartRestartGroup.endNode();
            List<String> additionalCheckboxes = ((Args) companion5.getArgs((Fragment) sweepOnboardingAgreementsFragment)).getGoldCombinedAgreements().getAdditionalCheckboxes();
            composerStartRestartGroup.startReplaceGroup(907595877);
            if (additionalCheckboxes == null) {
                composer2 = composerStartRestartGroup;
                i3 = i5;
                i4 = 1;
                snapshotState = snapshotState4;
            } else {
                i3 = i5;
                Modifier modifierM5146paddingqDBjuR0$default3 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                ImmutableList immutableList = extensions2.toImmutableList(additionalCheckboxes);
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    snapshotState = snapshotState4;
                    objRememberedValue7 = new Function1() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingAgreementsFragment$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SweepOnboardingAgreementsFragment.ComposeContent$lambda$23$lambda$18$lambda$17$lambda$16$lambda$15(snapshotState, ((Boolean) obj).booleanValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                } else {
                    snapshotState = snapshotState4;
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                i4 = 1;
                AgreementAdditionalCheckboxes.AgreementAdditionalCheckboxes(immutableList, modifierM5146paddingqDBjuR0$default3, null, (Function1) objRememberedValue7, false, composer2, 3072, 20);
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer2, 0);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, companion2);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion4.getSetModifier());
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer2, 6, i4);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor5);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion4.getSetModifier());
            int i9 = i3;
            Composer composer3 = composer2;
            SnapshotState snapshotState5 = snapshotState;
            BentoMarkdownText2.BentoMarkdownText(((Args) companion5.getArgs((Fragment) sweepOnboardingAgreementsFragment)).getGoldCombinedAgreements().getFooter(), (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i3).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composer2, i3).m21426getFg20d7_KjU(), bentoTheme.getColors(composer2, i3).m21426getFg20d7_KjU(), false, composer3, i7 << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, i8 << 6, 26);
            composer3.endNode();
            if (ComposeContent$lambda$4(snapshotState3)) {
                composer3.startReplaceGroup(-1031624054);
                strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_agree, composer3, 0);
                composer3.endReplaceGroup();
            } else {
                composer3.startReplaceGroup(-1031729175);
                strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_review, composer3, 0);
                composer3.endReplaceGroup();
            }
            String str = strStringResource;
            boolean zComposeContent$lambda$1 = ComposeContent$lambda$1(snapshotState2);
            boolean zComposeContent$lambda$7 = ComposeContent$lambda$7(snapshotState5);
            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, composer3, 6, 1), 0.0f, bentoTheme.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM(), 1, null);
            composer3.startReplaceGroup(-1633490746);
            sweepOnboardingAgreementsFragment = this;
            boolean zChangedInstance3 = composer3.changedInstance(sweepOnboardingAgreementsFragment);
            Object objRememberedValue8 = composer3.rememberedValue();
            if (zChangedInstance3 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function0() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingAgreementsFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SweepOnboardingAgreementsFragment.ComposeContent$lambda$23$lambda$22$lambda$21$lambda$20(this.f$0, snapshotState2);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue8);
            }
            composer3.endReplaceGroup();
            BentoSparkleButton2.BentoSparkleButton((Function0) objRememberedValue8, str, modifierM5144paddingVpY3zN4$default, null, zComposeContent$lambda$7, zComposeContent$lambda$1, false, composer3, 0, 72);
            composerStartRestartGroup = composer3;
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingAgreementsFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SweepOnboardingAgreementsFragment.ComposeContent$lambda$24(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ComposeContent$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void ComposeContent$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ComposeContent$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean ComposeContent$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean ComposeContent$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$23$lambda$18$lambda$11$lambda$10(SweepOnboardingAgreementsFragment sweepOnboardingAgreementsFragment) {
        sweepOnboardingAgreementsFragment.getCallbacks().onDisplayAgreement(((Args) INSTANCE.getArgs((Fragment) sweepOnboardingAgreementsFragment)).getGoldCombinedAgreements().getAgreements().get(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$23$lambda$18$lambda$13$lambda$12(SweepOnboardingAgreementsFragment sweepOnboardingAgreementsFragment) {
        sweepOnboardingAgreementsFragment.getCallbacks().onDisplayAgreement(((Args) INSTANCE.getArgs((Fragment) sweepOnboardingAgreementsFragment)).getGoldCombinedAgreements().getAgreements().get(1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$23$lambda$18$lambda$17$lambda$16$lambda$15(SnapshotState snapshotState, boolean z) {
        ComposeContent$lambda$8(snapshotState, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$23$lambda$22$lambda$21$lambda$20(SweepOnboardingAgreementsFragment sweepOnboardingAgreementsFragment, SnapshotState snapshotState) {
        ComposeContent$lambda$2(snapshotState, true);
        sweepOnboardingAgreementsFragment.getCallbacks().onAgreementsAccepted();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        getSweepOnboardingEventLogger().logScreenDisappear(this.analyticsScreen);
        super.onStop();
    }

    /* compiled from: SweepOnboardingAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingAgreementsFragment$Args;", "Landroid/os/Parcelable;", "goldCombinedAgreements", "Lcom/robinhood/models/api/bonfire/ApiSweepFlow$GoldCombinedAgreements;", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiSweepFlow$GoldCombinedAgreements;)V", "getGoldCombinedAgreements", "()Lcom/robinhood/models/api/bonfire/ApiSweepFlow$GoldCombinedAgreements;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiSweepFlow.GoldCombinedAgreements goldCombinedAgreements;

        /* compiled from: SweepOnboardingAgreementsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiSweepFlow.GoldCombinedAgreements) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiSweepFlow.GoldCombinedAgreements goldCombinedAgreements, int i, Object obj) {
            if ((i & 1) != 0) {
                goldCombinedAgreements = args.goldCombinedAgreements;
            }
            return args.copy(goldCombinedAgreements);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiSweepFlow.GoldCombinedAgreements getGoldCombinedAgreements() {
            return this.goldCombinedAgreements;
        }

        public final Args copy(ApiSweepFlow.GoldCombinedAgreements goldCombinedAgreements) {
            Intrinsics.checkNotNullParameter(goldCombinedAgreements, "goldCombinedAgreements");
            return new Args(goldCombinedAgreements);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.goldCombinedAgreements, ((Args) other).goldCombinedAgreements);
        }

        public int hashCode() {
            return this.goldCombinedAgreements.hashCode();
        }

        public String toString() {
            return "Args(goldCombinedAgreements=" + this.goldCombinedAgreements + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.goldCombinedAgreements, flags);
        }

        public Args(ApiSweepFlow.GoldCombinedAgreements goldCombinedAgreements) {
            Intrinsics.checkNotNullParameter(goldCombinedAgreements, "goldCombinedAgreements");
            this.goldCombinedAgreements = goldCombinedAgreements;
        }

        public final ApiSweepFlow.GoldCombinedAgreements getGoldCombinedAgreements() {
            return this.goldCombinedAgreements;
        }
    }

    /* compiled from: SweepOnboardingAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingAgreementsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingAgreementsFragment;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingAgreementsFragment$Args;", "<init>", "()V", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SweepOnboardingAgreementsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SweepOnboardingAgreementsFragment sweepOnboardingAgreementsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sweepOnboardingAgreementsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SweepOnboardingAgreementsFragment newInstance(Args args) {
            return (SweepOnboardingAgreementsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SweepOnboardingAgreementsFragment sweepOnboardingAgreementsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sweepOnboardingAgreementsFragment, args);
        }
    }
}
