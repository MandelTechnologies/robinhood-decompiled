package com.robinhood.android.optionsupgrade;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.options.optionsstring.datetime.DateStrings2;
import com.robinhood.android.optionsupgrade.OptionOnboardingScreens;
import com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment;
import com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationViewState2;
import com.robinhood.android.optionsupgrade.ScreenArgs;
import com.robinhood.android.optionsupgrade.ScreenRequest;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.compose.LocalityProvider;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import options_product.service.UpsellTradeOnExpirationRequestMetadataDto;

/* compiled from: OptionOnboardingUpsellTradeOnExpirationFragment.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 C2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001CB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u001dH\u0016J\b\u0010'\u001a\u00020\u001dH\u0016J\r\u0010(\u001a\u00020\u001dH\u0017¢\u0006\u0002\u0010)J-\u0010*\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0011H\u0003¢\u0006\u0002\u00101J%\u00102\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0003¢\u0006\u0002\u00103J%\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u00020.2\u0006\u00106\u001a\u00020.2\u0006\u00107\u001a\u000208H\u0003¢\u0006\u0002\u00109J-\u0010:\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0011H\u0003¢\u0006\u0002\u00101J\b\u0010;\u001a\u00020\u001dH\u0002J\b\u0010<\u001a\u00020\u001dH\u0002J\t\u0010=\u001a\u00020\u0011H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D²\u0006\n\u0010+\u001a\u00020,X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreen;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "getCallbacks", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "screenArgs", "Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "getScreenArgs", "()Lcom/robinhood/android/optionsupgrade/ScreenArgs;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "duxo", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationDuxo;", "getDuxo", "()Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "setLoading", "", "isLoading", "currentScreenRequest", "Lcom/robinhood/android/optionsupgrade/ScreenRequest;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "OnboardingExperience", "state", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationViewState;", "expirationTime", "", "closeTime", "isRhsg", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationViewState;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V", "NewOnboardingUpsellTradeOnExpiration", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationViewState;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "AnimatedValueProp", "title", CarResultComposable2.BODY, "translation", "", "(Ljava/lang/String;Ljava/lang/String;FLandroidx/compose/runtime/Composer;I)V", "OldOnboardingUpsellTradeOnExpiration", "onPositiveButtonClicked", "onNegativeButtonClicked", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionOnboardingUpsellTradeOnExpirationFragment extends GenericComposeFragment implements RegionGated, OptionOnboardingScreens {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOnboardingUpsellTradeOnExpirationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/optionsupgrade/OptionOnboardingScreenCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OptionOnboardingScreens2.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof OptionOnboardingScreens2) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, OptionOnboardingUpsellTradeOnExpirationDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedValueProp$lambda$15(OptionOnboardingUpsellTradeOnExpirationFragment optionOnboardingUpsellTradeOnExpirationFragment, String str, String str2, float f, int i, Composer composer, int i2) {
        optionOnboardingUpsellTradeOnExpirationFragment.AnimatedValueProp(str, str2, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(OptionOnboardingUpsellTradeOnExpirationFragment optionOnboardingUpsellTradeOnExpirationFragment, int i, Composer composer, int i2) {
        optionOnboardingUpsellTradeOnExpirationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewOnboardingUpsellTradeOnExpiration$lambda$12(OptionOnboardingUpsellTradeOnExpirationFragment optionOnboardingUpsellTradeOnExpirationFragment, OptionOnboardingUpsellTradeOnExpirationViewState optionOnboardingUpsellTradeOnExpirationViewState, String str, String str2, int i, Composer composer, int i2) throws Resources.NotFoundException {
        optionOnboardingUpsellTradeOnExpirationFragment.NewOnboardingUpsellTradeOnExpiration(optionOnboardingUpsellTradeOnExpirationViewState, str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OldOnboardingUpsellTradeOnExpiration$lambda$20(OptionOnboardingUpsellTradeOnExpirationFragment optionOnboardingUpsellTradeOnExpirationFragment, OptionOnboardingUpsellTradeOnExpirationViewState optionOnboardingUpsellTradeOnExpirationViewState, String str, String str2, boolean z, int i, Composer composer, int i2) throws Resources.NotFoundException {
        optionOnboardingUpsellTradeOnExpirationFragment.OldOnboardingUpsellTradeOnExpiration(optionOnboardingUpsellTradeOnExpirationViewState, str, str2, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingExperience$lambda$2(OptionOnboardingUpsellTradeOnExpirationFragment optionOnboardingUpsellTradeOnExpirationFragment, OptionOnboardingUpsellTradeOnExpirationViewState optionOnboardingUpsellTradeOnExpirationViewState, String str, String str2, boolean z, int i, Composer composer, int i2) throws Resources.NotFoundException {
        optionOnboardingUpsellTradeOnExpirationFragment.OnboardingExperience(optionOnboardingUpsellTradeOnExpirationViewState, str, str2, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens, com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return OptionOnboardingScreens.DefaultImpls.getEventScreen(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return OptionOnboardingScreens.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens, com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return OptionOnboardingScreens.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public OptionOnboardingScreens2 getCallbacks() {
        return (OptionOnboardingScreens2) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public ScreenArgs getScreenArgs() {
        return (ScreenArgs) INSTANCE.getArgs((Fragment) this);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionOnboardingUpsellTradeOnExpirationDuxo getDuxo() {
        return (OptionOnboardingUpsellTradeOnExpirationDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.optionsupgrade.OptionOnboardingScreens
    public void setLoading(boolean isLoading, ScreenRequest currentScreenRequest) {
        Intrinsics.checkNotNullParameter(currentScreenRequest, "currentScreenRequest");
        getDuxo().setLoadingNextScreens(isLoading, ((ScreenRequest.UpsellTradeOnExpiration) currentScreenRequest).getAction());
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C250971(null), 1, null);
    }

    /* compiled from: OptionOnboardingUpsellTradeOnExpirationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$onViewCreated$1", m3645f = "OptionOnboardingUpsellTradeOnExpirationFragment.kt", m3646l = {69}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$onViewCreated$1 */
    static final class C250971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C250971(Continuation<? super C250971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOnboardingUpsellTradeOnExpirationFragment.this.new C250971(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C250971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(OptionOnboardingUpsellTradeOnExpirationFragment.this.getDuxo().getEventFlow());
                final OptionOnboardingUpsellTradeOnExpirationFragment optionOnboardingUpsellTradeOnExpirationFragment = OptionOnboardingUpsellTradeOnExpirationFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<OptionOnboardingUpsellTradeOnExpirationViewState2>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<OptionOnboardingUpsellTradeOnExpirationViewState2> event, Continuation<? super Unit> continuation) {
                        EventConsumer<OptionOnboardingUpsellTradeOnExpirationViewState2> eventConsumerInvoke;
                        EventConsumer<OptionOnboardingUpsellTradeOnExpirationViewState2> eventConsumerInvoke2;
                        final OptionOnboardingUpsellTradeOnExpirationFragment optionOnboardingUpsellTradeOnExpirationFragment2 = optionOnboardingUpsellTradeOnExpirationFragment;
                        if ((event.getData() instanceof OptionOnboardingUpsellTradeOnExpirationViewState2.Success) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m17454invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m17454invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    OptionOnboardingScreens2 callbacks = optionOnboardingUpsellTradeOnExpirationFragment2.getCallbacks();
                                    UpsellTradeOnExpirationRequestMetadataDto.ActionDto actionDto = UpsellTradeOnExpirationRequestMetadataDto.ActionDto.ENABLE;
                                    OptionOnboardingUpsellTradeOnExpirationFragment.Companion companion = OptionOnboardingUpsellTradeOnExpirationFragment.INSTANCE;
                                    callbacks.goToNextScreen(new ScreenRequest.UpsellTradeOnExpiration(actionDto, ((ScreenArgs.UpsellTradeOnExpiration) companion.getArgs((Fragment) optionOnboardingUpsellTradeOnExpirationFragment2)).getScreenId()), (ScreenArgs) companion.getArgs((Fragment) optionOnboardingUpsellTradeOnExpirationFragment2));
                                }
                            });
                        }
                        final OptionOnboardingUpsellTradeOnExpirationFragment optionOnboardingUpsellTradeOnExpirationFragment3 = optionOnboardingUpsellTradeOnExpirationFragment;
                        if ((event.getData() instanceof OptionOnboardingUpsellTradeOnExpirationViewState2.Failure) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m17455invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m17455invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Throwable throwable = ((OptionOnboardingUpsellTradeOnExpirationViewState2.Failure) event.getData()).getThrowable();
                                    if (!Throwables.isConnectivityException(throwable)) {
                                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, throwable, false, null, 4, null);
                                    }
                                    AbsErrorHandler.handleError$default(optionOnboardingUpsellTradeOnExpirationFragment3.requireBaseActivity().getActivityErrorHandler(), throwable, false, 2, null);
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionOnboardingUpsellTradeOnExpirationViewState ComposeContent$lambda$0(SnapshotState4<OptionOnboardingUpsellTradeOnExpirationViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        OptionOnboardingStyles2.setupStatusBarStyle(this, ((ScreenArgs.UpsellTradeOnExpiration) INSTANCE.getArgs((Fragment) this)).getStyle());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        OptionOnboardingStyles2.removeStatusBarStyle(this);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-962786085);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-962786085, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment.ComposeContent (OptionOnboardingUpsellTradeOnExpirationFragment.kt:100)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            LocalityProvider.LocalityProvider(null, ComposableLambda3.rememberComposableLambda(237055517, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) throws Resources.NotFoundException {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(237055517, i3, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment.ComposeContent.<anonymous> (OptionOnboardingUpsellTradeOnExpirationFragment.kt:103)");
                    }
                    CountryCode countryCode = (CountryCode) composer2.consume(LocalityProvider.getLocalLocality());
                    OptionOnboardingUpsellTradeOnExpirationFragment.this.OnboardingExperience(OptionOnboardingUpsellTradeOnExpirationFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle), DateStrings2.formatTo24HourTime$default(15, 30, null, 4, null), DateStrings2.formatTo24HourTime$default(16, 0, null, 4, null), countryCode != null && countryCode.isRhsg(), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingUpsellTradeOnExpirationFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OnboardingExperience(final OptionOnboardingUpsellTradeOnExpirationViewState optionOnboardingUpsellTradeOnExpirationViewState, final String str, final String str2, final boolean z, Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-301919856);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(optionOnboardingUpsellTradeOnExpirationViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-301919856, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment.OnboardingExperience (OptionOnboardingUpsellTradeOnExpirationFragment.kt:117)");
            }
            boolean zIsPostEnablementMember = ((ScreenArgs.UpsellTradeOnExpiration) INSTANCE.getArgs((Fragment) this)).isPostEnablementMember();
            if (zIsPostEnablementMember) {
                composerStartRestartGroup.startReplaceGroup(1912803286);
                NewOnboardingUpsellTradeOnExpiration(optionOnboardingUpsellTradeOnExpirationViewState, str, str2, composerStartRestartGroup, (i2 & 1022) | ((i2 >> 3) & 7168));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (zIsPostEnablementMember) {
                    composerStartRestartGroup.startReplaceGroup(1912801629);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1912806238);
                OldOnboardingUpsellTradeOnExpiration(optionOnboardingUpsellTradeOnExpirationViewState, str, str2, z, composerStartRestartGroup, i2 & 65534);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingUpsellTradeOnExpirationFragment.OnboardingExperience$lambda$2(this.f$0, optionOnboardingUpsellTradeOnExpirationViewState, str, str2, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void NewOnboardingUpsellTradeOnExpiration(final OptionOnboardingUpsellTradeOnExpirationViewState optionOnboardingUpsellTradeOnExpirationViewState, final String str, final String str2, Composer composer, final int i) throws Resources.NotFoundException {
        OptionOnboardingUpsellTradeOnExpirationViewState optionOnboardingUpsellTradeOnExpirationViewState2;
        int i2;
        Object obj;
        Object obj2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(861279695);
        if ((i & 6) == 0) {
            optionOnboardingUpsellTradeOnExpirationViewState2 = optionOnboardingUpsellTradeOnExpirationViewState;
            i2 = (composerStartRestartGroup.changedInstance(optionOnboardingUpsellTradeOnExpirationViewState2) ? 4 : 2) | i;
        } else {
            optionOnboardingUpsellTradeOnExpirationViewState2 = optionOnboardingUpsellTradeOnExpirationViewState;
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj = str;
            i2 |= composerStartRestartGroup.changed(obj) ? 32 : 16;
        } else {
            obj = str;
        }
        if ((i & 384) == 0) {
            obj2 = str2;
            i2 |= composerStartRestartGroup.changed(obj2) ? 256 : 128;
        } else {
            obj2 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(861279695, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment.NewOnboardingUpsellTradeOnExpiration (OptionOnboardingUpsellTradeOnExpirationFragment.kt:129)");
            }
            composerStartRestartGroup.startReplaceGroup(-1238893147);
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.add(Tuples4.m3642to(StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_bullet_1, new Object[]{obj2}, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_body_1, new Object[]{obj}, composerStartRestartGroup, 0)));
            composerStartRestartGroup.startReplaceGroup(-1238885876);
            if (!optionOnboardingUpsellTradeOnExpirationViewState2.isMemberPdtRevampV1()) {
                listCreateListBuilder.add(Tuples4.m3642to(StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_bullet_2, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_body_2, composerStartRestartGroup, 0)));
            }
            composerStartRestartGroup.endReplaceGroup();
            listCreateListBuilder.add(Tuples4.m3642to(StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_bullet_3, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_body_3, composerStartRestartGroup, 0)));
            final List listBuild = CollectionsKt.build(listCreateListBuilder);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1238870591);
            float fMo5016toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp));
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                int size = listBuild.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.add(Animatable2.Animatable$default(fMo5016toPx0680j_4, 0.0f, 2, null));
                }
                composerStartRestartGroup.updateRememberedValue(arrayList);
                objRememberedValue = arrayList;
            }
            final List list = (List) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            boolean zIsPostEnablementMember = ((ScreenArgs.UpsellTradeOnExpiration) INSTANCE.getArgs((Fragment) this)).isPostEnablementMember();
            long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String optionOnboardingUpsellTradeOnExpirationTitle = OptionOnboardingUpsellTradeOnExpirationFragment3.getOptionOnboardingUpsellTradeOnExpirationTitle(resources, optionOnboardingUpsellTradeOnExpirationViewState2.getAccount());
            String strStringResource = StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_subtitle, new Object[]{obj}, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_button_positive, composerStartRestartGroup, 0);
            boolean isPositiveButtonLoading = optionOnboardingUpsellTradeOnExpirationViewState2.getIsPositiveButtonLoading();
            String strStringResource3 = StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_button_negative_new, composerStartRestartGroup, 0);
            boolean isNegativeButtonLoading = optionOnboardingUpsellTradeOnExpirationViewState2.getIsNegativeButtonLoading();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingUpsellTradeOnExpirationFragment.NewOnboardingUpsellTradeOnExpiration$lambda$8$lambda$7(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-276388641, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment.NewOnboardingUpsellTradeOnExpiration.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-276388641, i4, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment.NewOnboardingUpsellTradeOnExpiration.<anonymous> (OptionOnboardingUpsellTradeOnExpirationFragment.kt:160)");
                    }
                    List<Tuples2<String, String>> list2 = listBuild;
                    OptionOnboardingUpsellTradeOnExpirationFragment optionOnboardingUpsellTradeOnExpirationFragment = this;
                    List<Animatable<Float, AnimationVectors2>> list3 = list;
                    int i5 = 0;
                    for (Object obj3 : list2) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        Tuples2 tuples2 = (Tuples2) obj3;
                        optionOnboardingUpsellTradeOnExpirationFragment.AnimatedValueProp((String) tuples2.getFirst(), (String) tuples2.getSecond(), list3.get(i5).getValue().floatValue(), composer3, 0);
                        i5 = i6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingUpsellTradeOnExpirationFragment.NewOnboardingUpsellTradeOnExpiration$lambda$10$lambda$9(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            OptionOnboardingUpsellComposableKt.m17447OptionOnboardingUpsellComposableDY_cekU(jM21371getBg0d7_KjU, strStringResource, null, function0, true, strStringResource2, isPositiveButtonLoading, optionOnboardingUpsellTradeOnExpirationTitle, null, zIsPostEnablementMember, null, null, composableLambdaRememberComposableLambda, null, strStringResource3, isNegativeButtonLoading, (Function0) objRememberedValue3, composerStartRestartGroup, 24576, 384, 11524);
            composer2 = composerStartRestartGroup;
            Unit unit = Unit.INSTANCE;
            composer2.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer2.changedInstance(list);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new OptionOnboardingUpsellTradeOnExpirationFragment2(list, null);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return OptionOnboardingUpsellTradeOnExpirationFragment.NewOnboardingUpsellTradeOnExpiration$lambda$12(this.f$0, optionOnboardingUpsellTradeOnExpirationViewState, str, str2, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewOnboardingUpsellTradeOnExpiration$lambda$8$lambda$7(OptionOnboardingUpsellTradeOnExpirationFragment optionOnboardingUpsellTradeOnExpirationFragment) {
        optionOnboardingUpsellTradeOnExpirationFragment.onPositiveButtonClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewOnboardingUpsellTradeOnExpiration$lambda$10$lambda$9(OptionOnboardingUpsellTradeOnExpirationFragment optionOnboardingUpsellTradeOnExpirationFragment) {
        optionOnboardingUpsellTradeOnExpirationFragment.onNegativeButtonClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AnimatedValueProp(final String str, final String str2, final float f, Composer composer, final int i) {
        int i2;
        String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1191775265);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1191775265, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment.AnimatedValueProp (OptionOnboardingUpsellTradeOnExpirationFragment.kt:190)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z = (i2 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionOnboardingUpsellTradeOnExpirationFragment.AnimatedValueProp$lambda$14$lambda$13(f, (GraphicsLayerScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoValuePropRow3.BentoValuePropRow(str, str3, new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, 2, null), BentoValuePropRow.Center, ZIndexModifier2.zIndex(GraphicsLayerModifier6.graphicsLayer(companion, (Function1) objRememberedValue), 1.0f), composerStartRestartGroup, (i2 & 14) | 3072 | (i2 & 112) | (BentoValuePropRow2.Icon.$stable << 6), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingUpsellTradeOnExpirationFragment.AnimatedValueProp$lambda$15(this.f$0, str, str2, f, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedValueProp$lambda$14$lambda$13(float f, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setTranslationY(f);
        return Unit.INSTANCE;
    }

    private final void OldOnboardingUpsellTradeOnExpiration(final OptionOnboardingUpsellTradeOnExpirationViewState optionOnboardingUpsellTradeOnExpirationViewState, final String str, final String str2, final boolean z, Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-155762638);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(optionOnboardingUpsellTradeOnExpirationViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-155762638, i2, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment.OldOnboardingUpsellTradeOnExpiration (OptionOnboardingUpsellTradeOnExpirationFragment.kt:213)");
            }
            Companion companion = INSTANCE;
            boolean zIsPostEnablementMember = ((ScreenArgs.UpsellTradeOnExpiration) companion.getArgs((Fragment) this)).isPostEnablementMember();
            long jM17424getComposeColorWaAFU9c = ((ScreenArgs.UpsellTradeOnExpiration) companion.getArgs((Fragment) this)).getStyle().m17424getComposeColorWaAFU9c(composerStartRestartGroup, 0);
            int optionOnboardingUpsellTradeOnExpirationImageResId = OptionOnboardingUpsellTradeOnExpirationFragment3.getOptionOnboardingUpsellTradeOnExpirationImageResId(((ScreenArgs.UpsellTradeOnExpiration) companion.getArgs((Fragment) this)).getStyle());
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String optionOnboardingUpsellTradeOnExpirationTitle = OptionOnboardingUpsellTradeOnExpirationFragment3.getOptionOnboardingUpsellTradeOnExpirationTitle(resources, optionOnboardingUpsellTradeOnExpirationViewState.getAccount());
            String strStringResource = StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_subtitle, new Object[]{str}, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_button_positive, composerStartRestartGroup, 0);
            boolean isPositiveButtonLoading = optionOnboardingUpsellTradeOnExpirationViewState.getIsPositiveButtonLoading();
            String strStringResource3 = StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_button_negative, composerStartRestartGroup, 0);
            boolean isNegativeButtonLoading = optionOnboardingUpsellTradeOnExpirationViewState.getIsNegativeButtonLoading();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingUpsellTradeOnExpirationFragment.OldOnboardingUpsellTradeOnExpiration$lambda$17$lambda$16(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Integer numValueOf = Integer.valueOf(optionOnboardingUpsellTradeOnExpirationImageResId);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(19906370, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment.OldOnboardingUpsellTradeOnExpiration.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) throws Resources.NotFoundException {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) throws Resources.NotFoundException {
                    BentoValuePropRow2 icon;
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(19906370, i3, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment.OldOnboardingUpsellTradeOnExpiration.<anonymous> (OptionOnboardingUpsellTradeOnExpirationFragment.kt:224)");
                    }
                    String strStringResource4 = StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_bullet_1, new Object[]{str2}, composer3, 0);
                    String strStringResource5 = StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_body_1, new Object[]{str}, composer3, 0);
                    BentoValuePropRow2 number = z ? new BentoValuePropRow2.Number(1) : new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.DOT_24, null, 2, null);
                    BentoValuePropRow bentoValuePropRow = BentoValuePropRow.Center;
                    BentoValuePropRow3.BentoValuePropRow(strStringResource4, strStringResource5, number, bentoValuePropRow, (Modifier) null, composer3, 3072, 16);
                    composer3.startReplaceGroup(1950175854);
                    if (!optionOnboardingUpsellTradeOnExpirationViewState.isMemberPdtRevampV1()) {
                        BentoValuePropRow3.BentoValuePropRow(StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_bullet_2, composer3, 0), StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_body_2, composer3, 0), z ? new BentoValuePropRow2.Number(2) : new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.DOT_24, null, 2, null), bentoValuePropRow, (Modifier) null, composer3, 3072, 16);
                    }
                    composer3.endReplaceGroup();
                    String strStringResource6 = StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_bullet_3, composer3, 0);
                    String strStringResource7 = StringResources_androidKt.stringResource(C11303R.string.trade_on_expiration_upsell_body_3, composer3, 0);
                    if (z) {
                        icon = new BentoValuePropRow2.Number(optionOnboardingUpsellTradeOnExpirationViewState.isMemberPdtRevampV1() ? 2 : 3);
                    } else {
                        icon = new BentoValuePropRow2.Icon(ServerToBentoAssetMapper2.DOT_24, null, 2, null);
                    }
                    BentoValuePropRow3.BentoValuePropRow(strStringResource6, strStringResource7, icon, bentoValuePropRow, (Modifier) null, composer3, 3072, 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOnboardingUpsellTradeOnExpirationFragment.OldOnboardingUpsellTradeOnExpiration$lambda$19$lambda$18(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            OptionOnboardingUpsellComposableKt.m17447OptionOnboardingUpsellComposableDY_cekU(jM17424getComposeColorWaAFU9c, strStringResource, null, function0, false, strStringResource2, isPositiveButtonLoading, optionOnboardingUpsellTradeOnExpirationTitle, null, zIsPostEnablementMember, numValueOf, null, composableLambdaRememberComposableLambda, null, strStringResource3, isNegativeButtonLoading, (Function0) objRememberedValue2, composer2, 0, 384, 10516);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingUpsellTradeOnExpirationFragment$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingUpsellTradeOnExpirationFragment.OldOnboardingUpsellTradeOnExpiration$lambda$20(this.f$0, optionOnboardingUpsellTradeOnExpirationViewState, str, str2, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OldOnboardingUpsellTradeOnExpiration$lambda$17$lambda$16(OptionOnboardingUpsellTradeOnExpirationFragment optionOnboardingUpsellTradeOnExpirationFragment) {
        optionOnboardingUpsellTradeOnExpirationFragment.onPositiveButtonClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OldOnboardingUpsellTradeOnExpiration$lambda$19$lambda$18(OptionOnboardingUpsellTradeOnExpirationFragment optionOnboardingUpsellTradeOnExpirationFragment) {
        optionOnboardingUpsellTradeOnExpirationFragment.onNegativeButtonClicked();
        return Unit.INSTANCE;
    }

    private final void onPositiveButtonClicked() {
        getDuxo().turnOnTradeOnExpiration();
    }

    private final void onNegativeButtonClicked() {
        OptionOnboardingScreens2 callbacks = getCallbacks();
        UpsellTradeOnExpirationRequestMetadataDto.ActionDto actionDto = UpsellTradeOnExpirationRequestMetadataDto.ActionDto.NOT_NOW;
        Companion companion = INSTANCE;
        callbacks.goToNextScreen(new ScreenRequest.UpsellTradeOnExpiration(actionDto, ((ScreenArgs.UpsellTradeOnExpiration) companion.getArgs((Fragment) this)).getScreenId()), (ScreenArgs) companion.getArgs((Fragment) this));
    }

    /* compiled from: OptionOnboardingUpsellTradeOnExpirationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingUpsellTradeOnExpirationFragment;", "Lcom/robinhood/android/optionsupgrade/ScreenArgs$UpsellTradeOnExpiration;", "<init>", "()V", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionOnboardingUpsellTradeOnExpirationFragment, ScreenArgs.UpsellTradeOnExpiration> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ScreenArgs.UpsellTradeOnExpiration getArgs(OptionOnboardingUpsellTradeOnExpirationFragment optionOnboardingUpsellTradeOnExpirationFragment) {
            return (ScreenArgs.UpsellTradeOnExpiration) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionOnboardingUpsellTradeOnExpirationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOnboardingUpsellTradeOnExpirationFragment newInstance(ScreenArgs.UpsellTradeOnExpiration upsellTradeOnExpiration) {
            return (OptionOnboardingUpsellTradeOnExpirationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, upsellTradeOnExpiration);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOnboardingUpsellTradeOnExpirationFragment optionOnboardingUpsellTradeOnExpirationFragment, ScreenArgs.UpsellTradeOnExpiration upsellTradeOnExpiration) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionOnboardingUpsellTradeOnExpirationFragment, upsellTradeOnExpiration);
        }
    }
}
