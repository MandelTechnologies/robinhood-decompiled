package com.robinhood.android.creditcard.p091ui.waitlist;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.waitlist.CreditApplicationReferralBottomSheet;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoPogContent;
import com.robinhood.compose.bento.component.BentoPogDefaults;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoPogState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreditApplicationReferralBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0003#$%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\r\u0010\u0011\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\u001dH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditApplicationReferralBottomSheet;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditApplicationReferralBottomSheet$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/creditcard/ui/waitlist/CreditApplicationReferralBottomSheet$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "genTitle", "", "args", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditApplicationReferralBottomSheet$Args;", "(Lcom/robinhood/android/creditcard/ui/waitlist/CreditApplicationReferralBottomSheet$Args;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "genSubtitle", "genPog", "Lcom/robinhood/compose/bento/component/BentoPogContent;", "(Lcom/robinhood/android/creditcard/ui/waitlist/CreditApplicationReferralBottomSheet$Args;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/BentoPogContent;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CreditApplicationReferralBottomSheet extends GenericComposeBottomSheetDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditApplicationReferralBottomSheet$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof CreditApplicationReferralBottomSheet.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CreditApplicationReferralBottomSheet.class, "callbacks", "getCallbacks()Lcom/robinhood/android/creditcard/ui/waitlist/CreditApplicationReferralBottomSheet$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CreditApplicationReferralBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditApplicationReferralBottomSheet$Callbacks;", "", "onPromptUpdateDismiss", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPromptUpdateDismiss();
    }

    /* compiled from: CreditApplicationReferralBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Args.Type.values().length];
            try {
                iArr[Args.Type.LIMITED_REACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Args.Type.INELIGIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(CreditApplicationReferralBottomSheet creditApplicationReferralBottomSheet, int i, Composer composer, int i2) {
        creditApplicationReferralBottomSheet.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setCancelable(false);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1879354643);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1879354643, i2, -1, "com.robinhood.android.creditcard.ui.waitlist.CreditApplicationReferralBottomSheet.ComposeContent (CreditApplicationReferralBottomSheet.kt:58)");
            }
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            Component component = new Component(Component.ComponentType.BOTTOM_SHEET, "CreditApplicationReferralBottomSheet", null, 4, null);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(component);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new CreditApplicationReferralBottomSheet2(current, component, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1630703650, true, new C126532(current, component), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditApplicationReferralBottomSheet$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreditApplicationReferralBottomSheet.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CreditApplicationReferralBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditApplicationReferralBottomSheet$ComposeContent$2 */
    static final class C126532 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Component $eventComponent;
        final /* synthetic */ EventLogger $eventLogger;

        C126532(EventLogger eventLogger, Component component) {
            this.$eventLogger = eventLogger;
            this.$eventComponent = component;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
            CreditApplicationReferralBottomSheet creditApplicationReferralBottomSheet;
            int i2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1630703650, i, -1, "com.robinhood.android.creditcard.ui.waitlist.CreditApplicationReferralBottomSheet.ComposeContent.<anonymous> (CreditApplicationReferralBottomSheet.kt:70)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, composer, 6, 1);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierM21623defaultHorizontalPaddingrAjV9yQ, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            CreditApplicationReferralBottomSheet creditApplicationReferralBottomSheet2 = CreditApplicationReferralBottomSheet.this;
            final EventLogger eventLogger = this.$eventLogger;
            final Component component = this.$eventComponent;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
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
            Companion companion3 = CreditApplicationReferralBottomSheet.INSTANCE;
            BentoPogKt.BentoPog(new BentoPogState(creditApplicationReferralBottomSheet2.genPog((Args) companion3.getArgs((Fragment) creditApplicationReferralBottomSheet2), composer, 0), BentoPogDefaults.INSTANCE.getDefaultColors(composer, BentoPogDefaults.$stable), BentoPogSize.Hero, false, false, null, null, 120, null), null, composer, BentoPogState.$stable, 2);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM()), composer, 0);
            String strGenTitle = creditApplicationReferralBottomSheet2.genTitle((Args) companion3.getArgs((Fragment) creditApplicationReferralBottomSheet2), composer, 0);
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strGenTitle, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 0, 0, 8126);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), composer, 0);
            BentoText2.m20747BentoText38GnDrw(creditApplicationReferralBottomSheet2.genSubtitle((Args) companion3.getArgs((Fragment) creditApplicationReferralBottomSheet2), composer, 0), null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8126);
            composer.startReplaceGroup(1764556269);
            if (((Args) companion3.getArgs((Fragment) creditApplicationReferralBottomSheet2)).getType() == Args.Type.LIMITED_REACHED) {
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), composer, 0);
                creditApplicationReferralBottomSheet = creditApplicationReferralBottomSheet2;
                i2 = 0;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12201R.string.credit_app_referral_code_invite_limit_disclaimer, composer, 0), null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8126);
            } else {
                creditApplicationReferralBottomSheet = creditApplicationReferralBottomSheet2;
                i2 = 0;
            }
            composer.endReplaceGroup();
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, i2);
            composer.startReplaceGroup(-1746271574);
            final CreditApplicationReferralBottomSheet creditApplicationReferralBottomSheet3 = creditApplicationReferralBottomSheet;
            boolean zChangedInstance = composer.changedInstance(eventLogger) | composer.changedInstance(component) | composer.changedInstance(creditApplicationReferralBottomSheet3);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditApplicationReferralBottomSheet$ComposeContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreditApplicationReferralBottomSheet.C126532.invoke$lambda$2$lambda$1$lambda$0(eventLogger, component, creditApplicationReferralBottomSheet3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, (Function0) objRememberedValue, strStringResource, false, null, false, null, null, false, null, false, composer, 0, 0, 65343);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(EventLogger eventLogger, Component component, CreditApplicationReferralBottomSheet creditApplicationReferralBottomSheet) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.DISMISS, null, component, null, null, false, 58, null);
            creditApplicationReferralBottomSheet.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String genTitle(Args args, Composer composer, int i) throws Resources.NotFoundException {
        String strStringResource;
        composer.startReplaceGroup(-1344731646);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344731646, i, -1, "com.robinhood.android.creditcard.ui.waitlist.CreditApplicationReferralBottomSheet.genTitle (CreditApplicationReferralBottomSheet.kt:119)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[args.getType().ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(498049466);
            if (args.getReferrerFirstName() != null) {
                composer.startReplaceGroup(-1740305077);
                strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_referral_code_invite_limit_with_name_title, new Object[]{args.getReferrerFirstName()}, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1740090681);
                strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_referral_code_invite_limit_without_name_title, composer, 0);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceGroup(498047242);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(498062887);
            strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_referral_account_ineligible_title, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String genSubtitle(Args args, Composer composer, int i) throws Resources.NotFoundException {
        String strStringResource;
        composer.startReplaceGroup(754190782);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(754190782, i, -1, "com.robinhood.android.creditcard.ui.waitlist.CreditApplicationReferralBottomSheet.genSubtitle (CreditApplicationReferralBottomSheet.kt:136)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[args.getType().ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-1072126244);
            if (args.getReferrerFirstName() != null) {
                composer.startReplaceGroup(1123855372);
                strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_referral_code_invite_limit_with_name_subtitle, new Object[]{args.getReferrerFirstName()}, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1124072744);
                strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_referral_code_invite_limit_without_name_subtitle, composer, 0);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else {
            if (i2 != 2) {
                composer.startReplaceGroup(-1072128465);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1072112634);
            strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_referral_account_ineligible_subtitle, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BentoPogContent genPog(Args args, Composer composer, int i) {
        BentoPogContent.Pictogram pictogram;
        composer.startReplaceGroup(-1164330752);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1164330752, i, -1, "com.robinhood.android.creditcard.ui.waitlist.CreditApplicationReferralBottomSheet.genPog (CreditApplicationReferralBottomSheet.kt:153)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[args.getType().ordinal()];
        if (i2 == 1) {
            pictogram = new BentoPogContent.Pictogram(C20690R.drawable.pict_mono_rds_person, null, null, 4, null);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pictogram = new BentoPogContent.Pictogram(C20690R.drawable.pict_mono_rds_warning, null, null, 4, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return pictogram;
    }

    /* compiled from: CreditApplicationReferralBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditApplicationReferralBottomSheet$Args;", "Landroid/os/Parcelable;", "type", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditApplicationReferralBottomSheet$Args$Type;", "referrerFirstName", "", "<init>", "(Lcom/robinhood/android/creditcard/ui/waitlist/CreditApplicationReferralBottomSheet$Args$Type;Ljava/lang/String;)V", "getType", "()Lcom/robinhood/android/creditcard/ui/waitlist/CreditApplicationReferralBottomSheet$Args$Type;", "getReferrerFirstName", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Type", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String referrerFirstName;
        private final Type type;

        /* compiled from: CreditApplicationReferralBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(Type.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Type type2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = args.type;
            }
            if ((i & 2) != 0) {
                str = args.referrerFirstName;
            }
            return args.copy(type2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getReferrerFirstName() {
            return this.referrerFirstName;
        }

        public final Args copy(Type type2, String referrerFirstName) {
            Intrinsics.checkNotNullParameter(type2, "type");
            return new Args(type2, referrerFirstName);
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
            return this.type == args.type && Intrinsics.areEqual(this.referrerFirstName, args.referrerFirstName);
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.referrerFirstName;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(type=" + this.type + ", referrerFirstName=" + this.referrerFirstName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.type.name());
            dest.writeString(this.referrerFirstName);
        }

        public Args(Type type2, String str) {
            Intrinsics.checkNotNullParameter(type2, "type");
            this.type = type2;
            this.referrerFirstName = str;
        }

        public /* synthetic */ Args(Type type2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(type2, (i & 2) != 0 ? null : str);
        }

        public final Type getType() {
            return this.type;
        }

        public final String getReferrerFirstName() {
            return this.referrerFirstName;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CreditApplicationReferralBottomSheet.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditApplicationReferralBottomSheet$Args$Type;", "", "<init>", "(Ljava/lang/String;I)V", "LIMITED_REACHED", "INELIGIBLE", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Type {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type LIMITED_REACHED = new Type("LIMITED_REACHED", 0);
            public static final Type INELIGIBLE = new Type("INELIGIBLE", 1);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{LIMITED_REACHED, INELIGIBLE};
            }

            public static EnumEntries<Type> getEntries() {
                return $ENTRIES;
            }

            private Type(String str, int i) {
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: CreditApplicationReferralBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditApplicationReferralBottomSheet$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditApplicationReferralBottomSheet;", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditApplicationReferralBottomSheet$Args;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CreditApplicationReferralBottomSheet, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CreditApplicationReferralBottomSheet creditApplicationReferralBottomSheet) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, creditApplicationReferralBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CreditApplicationReferralBottomSheet newInstance(Args args) {
            return (CreditApplicationReferralBottomSheet) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CreditApplicationReferralBottomSheet creditApplicationReferralBottomSheet, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, creditApplicationReferralBottomSheet, args);
        }
    }
}
