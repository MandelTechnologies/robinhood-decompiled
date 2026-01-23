package com.robinhood.android.rhymigration.p245ui.funding;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.android.rhymigration.p245ui.PageDataCallbacks;
import com.robinhood.android.rhymigration.p245ui.RhyOnboardingLoggingUtils;
import com.robinhood.android.rhymigration.p245ui.funding.RhyAccountFundedFinishFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.ShowRhyFundingBottomSheetPref;
import com.robinhood.rosetta.eventlogging.AgreementContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
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
import kotlin.reflect.KProperty;

/* compiled from: RhyAccountFundedFinishFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003$%&B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0016\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010\u001d\u001a\u00020\u001eH\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'²\u0006\f\u0010(\u001a\u0004\u0018\u00010)X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/funding/RhyAccountFundedFinishFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "showRhyFundingBottomSheetPref", "Lcom/robinhood/prefs/BooleanPreference;", "getShowRhyFundingBottomSheetPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setShowRhyFundingBottomSheetPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "callbacks", "Lcom/robinhood/android/rhymigration/ui/funding/RhyAccountFundedFinishFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhymigration/ui/funding/RhyAccountFundedFinishFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "CmSunsetCloseComposable", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-rhy-migration_externalDebug", "accountFundingFinishedLottie", "Lcom/airbnb/lottie/LottieComposition;", "accountFundingFinishedLottieAspectRatio", ""}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyAccountFundedFinishFragment extends GenericComposeFragment implements RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhymigration.ui.funding.RhyAccountFundedFinishFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof RhyAccountFundedFinishFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final Screen eventScreen = new Screen(Screen.Name.RHY_MIGRATION_SETUP_CHECKLIST, null, null, null, 14, null);

    @ShowRhyFundingBottomSheetPref
    public BooleanPreference showRhyFundingBottomSheetPref;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyAccountFundedFinishFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhymigration/ui/funding/RhyAccountFundedFinishFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RhyAccountFundedFinishFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/funding/RhyAccountFundedFinishFragment$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/PageDataCallbacks;", "onFundingFinishedContinueClicked", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends PageDataCallbacks {
        void onFundingFinishedContinueClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CmSunsetCloseComposable$lambda$8(RhyAccountFundedFinishFragment rhyAccountFundedFinishFragment, Modifier modifier, int i, int i2, Composer composer, int i3) {
        rhyAccountFundedFinishFragment.CmSunsetCloseComposable(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(RhyAccountFundedFinishFragment rhyAccountFundedFinishFragment, int i, Composer composer, int i2) {
        rhyAccountFundedFinishFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public final BooleanPreference getShowRhyFundingBottomSheetPref() {
        BooleanPreference booleanPreference = this.showRhyFundingBottomSheetPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showRhyFundingBottomSheetPref");
        return null;
    }

    public final void setShowRhyFundingBottomSheetPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.showRhyFundingBottomSheetPref = booleanPreference;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1582179737);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1582179737, i2, -1, "com.robinhood.android.rhymigration.ui.funding.RhyAccountFundedFinishFragment.ComposeContent (RhyAccountFundedFinishFragment.kt:63)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, RhyOnboardingLoggingUtils.getEventContext$default(this, (AgreementContext) null, (String) null, 3, (Object) null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-385639524, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhymigration.ui.funding.RhyAccountFundedFinishFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-385639524, i3, -1, "com.robinhood.android.rhymigration.ui.funding.RhyAccountFundedFinishFragment.ComposeContent.<anonymous> (RhyAccountFundedFinishFragment.kt:70)");
                    }
                    RhyAccountFundedFinishFragment.this.CmSunsetCloseComposable(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, false, false, null, 125, null), composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhymigration.ui.funding.RhyAccountFundedFinishFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyAccountFundedFinishFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void CmSunsetCloseComposable(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        final RhyAccountFundedFinishFragment rhyAccountFundedFinishFragment;
        int i4;
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(687568466);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            rhyAccountFundedFinishFragment = this;
        } else {
            Modifier modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(687568466, i3, -1, "com.robinhood.android.rhymigration.ui.funding.RhyAccountFundedFinishFragment.CmSunsetCloseComposable (RhyAccountFundedFinishFragment.kt:77)");
            }
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
            final LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(LottieUrl.RHY_CM_SUNSET_TICK.getUrl().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(lottieCompositionResultRememberLottieComposition);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.rhymigration.ui.funding.RhyAccountFundedFinishFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(RhyAccountFundedFinishFragment.CmSunsetCloseComposable$lambda$7$lambda$3$lambda$2(lottieCompositionResultRememberLottieComposition));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState4 snapshotState4DerivedStateOf = SnapshotStateKt.derivedStateOf((Function0) objRememberedValue);
            LottieComposition lottieCompositionCmSunsetCloseComposable$lambda$7$lambda$1 = CmSunsetCloseComposable$lambda$7$lambda$1(lottieCompositionResultRememberLottieComposition);
            ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), CmSunsetCloseComposable$lambda$7$lambda$4(snapshotState4DerivedStateOf), false, 2, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            Modifier modifier4 = modifier3;
            LottieAnimation2.LottieAnimation(lottieCompositionCmSunsetCloseComposable$lambda$7$lambda$1, PaddingKt.m5146paddingqDBjuR0$default(modifierAspectRatio$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, fillWidth, false, false, null, false, null, composerStartRestartGroup, 0, 196608, 0, 2064380);
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(column6.align(companion3, companion.getCenterHorizontally()), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            String string2 = getString(C27577R.string.rhy_funding_finished_header);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            rhyAccountFundedFinishFragment = this;
            BentoText2.m20747BentoText38GnDrw(string2, modifierM5144paddingVpY3zN4$default, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8124);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String string3 = rhyAccountFundedFinishFragment.getString(C27577R.string.rhy_funding_finished_list_1);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            BentoValuePropRow2 icon = BentoValuePropRow2.Checkmark.INSTANCE;
            BentoValuePropRow bentoValuePropRow = BentoValuePropRow.Center;
            BentoValuePropRow3.BentoValuePropRow((String) null, string3, icon, bentoValuePropRow, modifierM5146paddingqDBjuR0$default, composerStartRestartGroup, (BentoValuePropRow2.Checkmark.$stable << 6) | 3078, 0);
            if (((Args) INSTANCE.getArgs((Fragment) rhyAccountFundedFinishFragment)).getWasFundingCancelled()) {
                i4 = 2;
                obj = null;
                icon = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.BUBBLE_REMOVE_24, null, 2, null);
            } else {
                i4 = 2;
                obj = null;
            }
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String string4 = rhyAccountFundedFinishFragment.getString(C27577R.string.rhy_funding_finished_list_2);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            BentoValuePropRow3.BentoValuePropRow((String) null, string4, icon, bentoValuePropRow, modifierM5146paddingqDBjuR0$default2, composerStartRestartGroup, 3078, 0);
            Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String string5 = rhyAccountFundedFinishFragment.getString(C27577R.string.rhy_funding_finished_list_3);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            BentoValuePropRow2.Number number = new BentoValuePropRow2.Number(3);
            int i7 = BentoValuePropRow2.Number.$stable;
            BentoValuePropRow3.BentoValuePropRow((String) null, string5, number, bentoValuePropRow, modifierM5146paddingqDBjuR0$default3, composerStartRestartGroup, (i7 << 6) | 3078, 0);
            Modifier modifierM5146paddingqDBjuR0$default4 = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String string6 = rhyAccountFundedFinishFragment.getString(C27577R.string.rhy_funding_finished_list_4);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            BentoValuePropRow3.BentoValuePropRow((String) null, string6, new BentoValuePropRow2.Number(4), bentoValuePropRow, modifierM5146paddingqDBjuR0$default4, composerStartRestartGroup, (i7 << 6) | 3078, 0);
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(column6.align(SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, i4, obj), 0.0f, 1, obj), companion.getCenterHorizontally()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, null, null, 59, null), false, false, false, true, false, null, 110, null);
            String string7 = rhyAccountFundedFinishFragment.getString(C27577R.string.rhy_continue);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(rhyAccountFundedFinishFragment);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.rhymigration.ui.funding.RhyAccountFundedFinishFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RhyAccountFundedFinishFragment.CmSunsetCloseComposable$lambda$7$lambda$6$lambda$5(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, string7, modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8184);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhymigration.ui.funding.RhyAccountFundedFinishFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return RhyAccountFundedFinishFragment.CmSunsetCloseComposable$lambda$8(this.f$0, modifier2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final LottieComposition CmSunsetCloseComposable$lambda$7$lambda$1(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CmSunsetCloseComposable$lambda$7$lambda$3$lambda$2(LottieCompositionResult lottieCompositionResult) {
        LottieComposition lottieCompositionCmSunsetCloseComposable$lambda$7$lambda$1 = CmSunsetCloseComposable$lambda$7$lambda$1(lottieCompositionResult);
        if ((lottieCompositionCmSunsetCloseComposable$lambda$7$lambda$1 != null ? lottieCompositionCmSunsetCloseComposable$lambda$7$lambda$1.getBounds() : null) == null) {
            return 1.0f;
        }
        return r1.width() / r1.height();
    }

    private static final float CmSunsetCloseComposable$lambda$7$lambda$4(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CmSunsetCloseComposable$lambda$7$lambda$6$lambda$5(RhyAccountFundedFinishFragment rhyAccountFundedFinishFragment) {
        rhyAccountFundedFinishFragment.getShowRhyFundingBottomSheetPref().set(false);
        rhyAccountFundedFinishFragment.getCallbacks().onFundingFinishedContinueClicked();
        return Unit.INSTANCE;
    }

    /* compiled from: RhyAccountFundedFinishFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/funding/RhyAccountFundedFinishFragment$Args;", "Landroid/os/Parcelable;", "wasFundingCancelled", "", "<init>", "(Z)V", "getWasFundingCancelled", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean wasFundingCancelled;

        /* compiled from: RhyAccountFundedFinishFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.wasFundingCancelled;
            }
            return args.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getWasFundingCancelled() {
            return this.wasFundingCancelled;
        }

        public final Args copy(boolean wasFundingCancelled) {
            return new Args(wasFundingCancelled);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.wasFundingCancelled == ((Args) other).wasFundingCancelled;
        }

        public int hashCode() {
            return Boolean.hashCode(this.wasFundingCancelled);
        }

        public String toString() {
            return "Args(wasFundingCancelled=" + this.wasFundingCancelled + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.wasFundingCancelled ? 1 : 0);
        }

        public Args(boolean z) {
            this.wasFundingCancelled = z;
        }

        public final boolean getWasFundingCancelled() {
            return this.wasFundingCancelled;
        }
    }

    /* compiled from: RhyAccountFundedFinishFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/funding/RhyAccountFundedFinishFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rhymigration/ui/funding/RhyAccountFundedFinishFragment;", "Lcom/robinhood/android/rhymigration/ui/funding/RhyAccountFundedFinishFragment$Args;", "<init>", "()V", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RhyAccountFundedFinishFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RhyAccountFundedFinishFragment rhyAccountFundedFinishFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhyAccountFundedFinishFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhyAccountFundedFinishFragment newInstance(Args args) {
            return (RhyAccountFundedFinishFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhyAccountFundedFinishFragment rhyAccountFundedFinishFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhyAccountFundedFinishFragment, args);
        }
    }
}
