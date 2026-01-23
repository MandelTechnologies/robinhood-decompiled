package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.CreditApplicationGoldBasicExperiment;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo8;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.FinalTermsDuxo6;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.FinalTermsFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.FinalTermsViewState;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.GoldBasicDownsellBottomSheet;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.GoldValuePropsBottomSheet;
import com.robinhood.android.creditcard.p091ui.creditapplication.incentive.bonus.points.BonusPointsTextVariant;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.lib.store.creditcard.prefs.CreditApplicationIdPref;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: FinalTermsFragment.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u0003:\u0003234B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u001c\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0016\u0010$\u001a\u00020\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0)H\u0096@¢\u0006\u0004\b*\u0010+J\t\u0010,\u001a\u00020\u0019H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/GoldBasicDownsellBottomSheet$Callbacks;", "<init>", "()V", "creditApplicationId", "Lcom/robinhood/prefs/StringPreference;", "getCreditApplicationId", "()Lcom/robinhood/prefs/StringPreference;", "setCreditApplicationId", "(Lcom/robinhood/prefs/StringPreference;)V", "callbacks", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsDuxo;", "getDuxo", "()Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsEvent;", "onAcceptDownsell", "Lkotlin/Result;", "onAcceptDownsell-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FinalTermsFragment extends GenericComposeFragment implements RegionGated, GoldBasicDownsellBottomSheet.Callbacks {

    @CreditApplicationIdPref
    public StringPreference creditApplicationId;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(FinalTermsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof FinalTermsFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, FinalTermsDuxo.class);

    /* compiled from: FinalTermsFragment.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\bH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H¦@¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0003H&¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsFragment$Callbacks;", "", "onContinue", "", "fxn", "Lcom/robinhood/android/creditcard/ui/creditapplication/Fxn;", "onUrl", "url", "", "withAuthHeader", "", "onGoldAgreement", "goldAgreementMarkdown", "onGoldLearnMore", "onDownsellCtaClicked", "onAcceptDownsell", "Lkotlin/Result;", "onAcceptDownsell-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onExitFlow", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        /* renamed from: onAcceptDownsell-IoAF18A */
        Object mo12620onAcceptDownsellIoAF18A(Continuation<? super Result<Unit>> continuation);

        void onContinue(CreditApplicationDuxo8 fxn);

        void onDownsellCtaClicked();

        void onExitFlow();

        void onGoldAgreement(String goldAgreementMarkdown);

        void onGoldLearnMore();

        void onUrl(String url, boolean withAuthHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$16(FinalTermsFragment finalTermsFragment, int i, Composer composer, int i2) {
        finalTermsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<FinalTermsDuxo6> event) {
        EventConsumer<FinalTermsDuxo6> eventConsumerInvoke;
        if (!(event.getData() instanceof FinalTermsDuxo6.Continue) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m12699invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m12699invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.getCallbacks().onContinue(CreditApplicationDuxo8.NextPage.INSTANCE);
            }
        });
    }

    public final StringPreference getCreditApplicationId() {
        StringPreference stringPreference = this.creditApplicationId;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("creditApplicationId");
        return null;
    }

    public final void setCreditApplicationId(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.creditApplicationId = stringPreference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FinalTermsDuxo getDuxo() {
        return (FinalTermsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0221  */
    @Override // com.robinhood.compose.app.GenericComposeFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        BonusPointsTextVariant bonusPointsTextVariant;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        boolean zChangedInstance3;
        Function0 function0;
        boolean zChangedInstance4;
        Object objRememberedValue3;
        boolean zChangedInstance5;
        Object objRememberedValue4;
        boolean zChangedInstance6;
        Object objRememberedValue5;
        Composer composerStartRestartGroup = composer.startRestartGroup(1322584958);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1322584958, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment.ComposeContent (FinalTermsFragment.kt:54)");
            }
            final FinalTermsViewState finalTermsViewState = (FinalTermsViewState) FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue();
            String str = getCreditApplicationId().get();
            if (str == null) {
                str = "";
            }
            final String string2 = requireContext().getString(C12201R.string.credit_app_final_terms_cardholder_agreement_link, str);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            final String string3 = requireContext().getString(C12201R.string.credit_app_final_terms_credit_score_notice_link, str);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            boolean zIsGold = finalTermsViewState.isGold();
            long annualFeeMicro = ((Args) INSTANCE.getArgs((Fragment) this)).getAnnualFeeMicro();
            boolean showErrorDialog = finalTermsViewState.getShowErrorDialog();
            FinalTermsViewState.Screen screen = finalTermsViewState.getScreen();
            BonusPointsTextVariant bonusPointsTextVariant2 = finalTermsViewState.getBonusPointsTextVariant();
            boolean zIsGoldBasicEligible = finalTermsViewState.isGoldBasicEligible();
            CreditApplicationGoldBasicExperiment.Variant goldBasicVariant = finalTermsViewState.getGoldBasicVariant();
            boolean showPlanSelectorFromDeeplink = finalTermsViewState.getShowPlanSelectorFromDeeplink();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changed(string2) | composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance7) {
                bonusPointsTextVariant = bonusPointsTextVariant2;
            } else {
                bonusPointsTextVariant = bonusPointsTextVariant2;
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                }
                Function0 function02 = (Function0) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changed(string3) | composerStartRestartGroup.changedInstance(this);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FinalTermsFragment.ComposeContent$lambda$3$lambda$2(current, string3, this);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function03 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(finalTermsViewState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FinalTermsFragment.ComposeContent$lambda$5$lambda$4(current, this, finalTermsViewState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function04 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(finalTermsViewState) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3) {
                    function0 = function04;
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    }
                    Function0 function05 = (Function0) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance4 = composerStartRestartGroup.changedInstance(this);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FinalTermsFragment.ComposeContent$lambda$9$lambda$8(this.f$0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function06 = (Function0) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance5 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(this);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FinalTermsFragment.ComposeContent$lambda$11$lambda$10(current, this);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function0 function07 = (Function0) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance6 = composerStartRestartGroup.changedInstance(this);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance6 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FinalTermsFragment.ComposeContent$lambda$15$lambda$14(this.f$0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    FinalTermsComposable.FinalTerms(zIsGold, annualFeeMicro, showErrorDialog, screen, bonusPointsTextVariant, zIsGoldBasicEligible, goldBasicVariant, showPlanSelectorFromDeeplink, function02, function03, function0, function05, function06, function07, (Function0) objRememberedValue5, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    function0 = function04;
                }
                objRememberedValue7 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FinalTermsFragment.ComposeContent$lambda$7$lambda$6(finalTermsViewState, current, this);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                Function0 function052 = (Function0) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(this);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FinalTermsFragment.ComposeContent$lambda$9$lambda$8(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    Function0 function062 = (Function0) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance5 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(this);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance5) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FinalTermsFragment.ComposeContent$lambda$11$lambda$10(current, this);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        Function0 function072 = (Function0) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance6 = composerStartRestartGroup.changedInstance(this);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance6) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FinalTermsFragment.ComposeContent$lambda$15$lambda$14(this.f$0);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            composerStartRestartGroup.endReplaceGroup();
                            FinalTermsComposable.FinalTerms(zIsGold, annualFeeMicro, showErrorDialog, screen, bonusPointsTextVariant, zIsGoldBasicEligible, goldBasicVariant, showPlanSelectorFromDeeplink, function02, function03, function0, function052, function062, function072, (Function0) objRememberedValue5, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
            }
            objRememberedValue6 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FinalTermsFragment.ComposeContent$lambda$1$lambda$0(current, string2, this);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            Function0 function022 = (Function0) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changed(string3) | composerStartRestartGroup.changedInstance(this);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FinalTermsFragment.ComposeContent$lambda$3$lambda$2(current, string3, this);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                Function0 function032 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(finalTermsViewState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FinalTermsFragment.ComposeContent$lambda$5$lambda$4(current, this, finalTermsViewState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    Function0 function042 = (Function0) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(finalTermsViewState) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(this);
                    Object objRememberedValue72 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3) {
                    }
                    objRememberedValue72 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FinalTermsFragment.ComposeContent$lambda$7$lambda$6(finalTermsViewState, current, this);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue72);
                    Function0 function0522 = (Function0) objRememberedValue72;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance4 = composerStartRestartGroup.changedInstance(this);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4) {
                    }
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FinalTermsFragment.ComposeContent$lambda$16(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(EventLogger eventLogger, String str, FinalTermsFragment finalTermsFragment) {
        loggingUtils.logLinkClick$default(eventLogger, str, null, 2, null);
        finalTermsFragment.getCallbacks().onUrl(str, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(EventLogger eventLogger, String str, FinalTermsFragment finalTermsFragment) {
        loggingUtils.logLinkClick$default(eventLogger, str, null, 2, null);
        finalTermsFragment.getCallbacks().onUrl(str, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(EventLogger eventLogger, FinalTermsFragment finalTermsFragment, FinalTermsViewState finalTermsViewState) {
        loggingUtils.logLinkClick$default(eventLogger, FinalTermsDuxo.GOLD_AGREEMENT_NAME, null, 2, null);
        Callbacks callbacks = finalTermsFragment.getCallbacks();
        UiAgreementWithContent goldAgreementContent = finalTermsViewState.getGoldAgreementContent();
        callbacks.onGoldAgreement(goldAgreementContent != null ? goldAgreementContent.getContent() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7$lambda$6(FinalTermsViewState finalTermsViewState, EventLogger eventLogger, FinalTermsFragment finalTermsFragment) {
        if (finalTermsViewState.getGoldValueProps() != null) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.LEARN_MORE, new Screen(Screen.Name.CC_APPLICATION_ACCOUNT_TERMS, null, null, null, 14, null), new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null), null, null, false, 56, null);
            GoldValuePropsBottomSheet goldValuePropsBottomSheet = (GoldValuePropsBottomSheet) GoldValuePropsBottomSheet.INSTANCE.newInstance((Parcelable) new GoldValuePropsBottomSheet.Args(finalTermsViewState.getGoldValueProps()));
            FragmentManager childFragmentManager = finalTermsFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            goldValuePropsBottomSheet.show(childFragmentManager, "gold-value-props");
        } else {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.LEARN_MORE, new Screen(Screen.Name.CC_APPLICATION_ACCOUNT_TERMS, null, null, null, 14, null), new Component(Component.ComponentType.LINK_BUTTON, null, null, 6, null), null, null, false, 56, null);
            finalTermsFragment.getCallbacks().onGoldLearnMore();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$9$lambda$8(FinalTermsFragment finalTermsFragment) {
        finalTermsFragment.getDuxo().onContinue$feature_credit_card_externalDebug();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$11$lambda$10(EventLogger eventLogger, FinalTermsFragment finalTermsFragment) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SECONDARY_CTA, new Screen(Screen.Name.CC_APPLICATION_ACCOUNT_TERMS, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        finalTermsFragment.getCallbacks().onDownsellCtaClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$15$lambda$14(final FinalTermsFragment finalTermsFragment) {
        GoldBasicDownsellBottomSheet goldBasicDownsellBottomSheetNewInstance = GoldBasicDownsellBottomSheet.INSTANCE.newInstance();
        goldBasicDownsellBottomSheetNewInstance.setOnDismiss(new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FinalTermsFragment.ComposeContent$lambda$15$lambda$14$lambda$13$lambda$12(this.f$0);
            }
        });
        FragmentManager childFragmentManager = finalTermsFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        goldBasicDownsellBottomSheetNewInstance.show(childFragmentManager, "gold-basic-downsell");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$15$lambda$14$lambda$13$lambda$12(FinalTermsFragment finalTermsFragment) {
        finalTermsFragment.getCallbacks().onExitFlow();
        return Unit.INSTANCE;
    }

    /* compiled from: FinalTermsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$onViewCreated$1", m3645f = "FinalTermsFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$onViewCreated$1 */
    static final class C123441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C123441(Continuation<? super C123441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinalTermsFragment.this.new C123441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C123441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FinalTermsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ FinalTermsFragment $tmp0;

            AnonymousClass1(FinalTermsFragment finalTermsFragment) {
                this.$tmp0 = finalTermsFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, FinalTermsFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<FinalTermsDuxo6> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C123441.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<FinalTermsDuxo6>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(FinalTermsFragment finalTermsFragment, Event event, Continuation continuation) {
            finalTermsFragment.handleEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(FinalTermsFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(FinalTermsFragment.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C123441(null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldBasicDownsellBottomSheet.Callbacks
    /* renamed from: onAcceptDownsell-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo12620onAcceptDownsellIoAF18A(Continuation<? super Result<Unit>> continuation) {
        FinalTermsFragment2 finalTermsFragment2;
        Object objM1877x54ae50ef;
        if (continuation instanceof FinalTermsFragment2) {
            finalTermsFragment2 = (FinalTermsFragment2) continuation;
            int i = finalTermsFragment2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                finalTermsFragment2.label = i - Integer.MIN_VALUE;
            } else {
                finalTermsFragment2 = new FinalTermsFragment2(this, continuation);
            }
        }
        Object obj = finalTermsFragment2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = finalTermsFragment2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            FinalTermsDuxo duxo = getDuxo();
            finalTermsFragment2.label = 1;
            objM1877x54ae50ef = duxo.m1877x54ae50ef(finalTermsFragment2);
            if (objM1877x54ae50ef == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM1877x54ae50ef = ((Result) obj).getValue();
        }
        if (Result.m28556isSuccessimpl(objM1877x54ae50ef)) {
            getDuxo().onContinue$feature_credit_card_externalDebug();
        }
        return objM1877x54ae50ef;
    }

    /* compiled from: FinalTermsFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsFragment$Args;", "Landroid/os/Parcelable;", "annualFeeMicro", "", "<init>", "(J)V", "getAnnualFeeMicro", "()J", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final long annualFeeMicro;

        /* compiled from: FinalTermsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = args.annualFeeMicro;
            }
            return args.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAnnualFeeMicro() {
            return this.annualFeeMicro;
        }

        public final Args copy(long annualFeeMicro) {
            return new Args(annualFeeMicro);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && this.annualFeeMicro == ((Args) other).annualFeeMicro;
        }

        public int hashCode() {
            return Long.hashCode(this.annualFeeMicro);
        }

        public String toString() {
            return "Args(annualFeeMicro=" + this.annualFeeMicro + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.annualFeeMicro);
        }

        public Args(long j) {
            this.annualFeeMicro = j;
        }

        public final long getAnnualFeeMicro() {
            return this.annualFeeMicro;
        }
    }

    /* compiled from: FinalTermsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsFragment;", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsFragment$Args;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<FinalTermsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(FinalTermsFragment finalTermsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, finalTermsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public FinalTermsFragment newInstance(Args args) {
            return (FinalTermsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(FinalTermsFragment finalTermsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, finalTermsFragment, args);
        }
    }
}
