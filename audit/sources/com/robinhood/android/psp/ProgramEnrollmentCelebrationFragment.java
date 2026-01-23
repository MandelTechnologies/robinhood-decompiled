package com.robinhood.android.psp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.Divider2;
import androidx.compose.material.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ShareCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import coil.request.ImageRequest;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.psp.ProgramEnrollmentCelebrationViewState;
import com.robinhood.android.psp.PspSharableImageManager;
import com.robinhood.android.psp.databinding.FragmentProgramEnrollmentCelebrationBinding;
import com.robinhood.android.regiongate.PspRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.compose.bento.component.cards.BentoCelebrationCard;
import com.robinhood.compose.bento.component.cards.SecondaryRow;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.ApiPspEnrollmentResponse;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.reactivex.Observable;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;

/* compiled from: ProgramEnrollmentCelebrationFragment.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 S2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002RSB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u001a\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0012\u00101\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u00102\u001a\u00020)2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0016J\u0018\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0002J\u0010\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u00020)2\u0006\u0010A\u001a\u00020;H\u0002J1\u0010B\u001a\u00020)2\b\b\u0002\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020HH\u0003¢\u0006\u0004\bJ\u0010KJ\t\u0010L\u001a\u000206H\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001b\u0010#\u001a\u00020$8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b%\u0010&R\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020O0NX\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "pspSharableImageManager", "Lcom/robinhood/android/psp/PspSharableImageManager;", "getPspSharableImageManager", "()Lcom/robinhood/android/psp/PspSharableImageManager;", "setPspSharableImageManager", "(Lcom/robinhood/android/psp/PspSharableImageManager;)V", "binding", "Lcom/robinhood/android/psp/databinding/FragmentProgramEnrollmentCelebrationBinding;", "getBinding", "()Lcom/robinhood/android/psp/databinding/FragmentProgramEnrollmentCelebrationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "buttonsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "Lcom/robinhood/android/psp/ButtonWithColor;", "duxo", "Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationDuxo;", "getDuxo", "()Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onActionClicked", "", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "sharePsp", "imageName", "", "shareSubject", "bind", "state", "Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationViewState;", "logTap", "loggingIdentifier", "PspCelebrationHeader", "modifier", "Landroidx/compose/ui/Modifier;", "colorOnPrimary", "Landroidx/compose/ui/graphics/Color;", "startImageUrl", "Lokhttp3/HttpUrl;", "endImageUrl", "PspCelebrationHeader-sW7UJKQ", "(Landroidx/compose/ui/Modifier;JLokhttp3/HttpUrl;Lokhttp3/HttpUrl;Landroidx/compose/runtime/Composer;II)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ProgramEnrollmentCelebrationFragment extends BaseFragment implements RegionGated, ClientComponentButtonView.Callbacks, AutoLoggableFragment {
    public static final long ALPHA_DURATION = 1000;
    public static final long ALPHA_DURATION_DELAY = 1000;
    public static final long TRANSLATION_Y_DURATION = 1500;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final GenericListAdapter<ClientComponentButtonView, ButtonWithColor> buttonsAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen;
    public PspSharableImageManager pspSharableImageManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ProgramEnrollmentCelebrationFragment.class, "binding", "getBinding()Lcom/robinhood/android/psp/databinding/FragmentProgramEnrollmentCelebrationBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PspCelebrationHeader_sW7UJKQ$lambda$5(ProgramEnrollmentCelebrationFragment programEnrollmentCelebrationFragment, Modifier modifier, long j, HttpUrl httpUrl, HttpUrl httpUrl2, int i, int i2, Composer composer, int i3) {
        programEnrollmentCelebrationFragment.m17787PspCelebrationHeadersW7UJKQ(modifier, j, httpUrl, httpUrl2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public ProgramEnrollmentCelebrationFragment() {
        super(C25966R.layout.fragment_program_enrollment_celebration);
        this.$$delegate_0 = new RegionGated2(PspRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, ProgramEnrollmentCelebrationFragment2.INSTANCE);
        this.buttonsAdapter = GenericListAdapter.INSTANCE.m2987of(ClientComponentButtonView.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.psp.ProgramEnrollmentCelebrationFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ProgramEnrollmentCelebrationFragment.buttonsAdapter$lambda$0(this.f$0, (ClientComponentButtonView) obj, (ButtonWithColor) obj2);
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, ProgramEnrollmentCelebrationDuxo.class);
        this.eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.psp.ProgramEnrollmentCelebrationFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProgramEnrollmentCelebrationFragment.eventScreen_delegate$lambda$1(this.f$0);
            }
        });
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final PspSharableImageManager getPspSharableImageManager() {
        PspSharableImageManager pspSharableImageManager = this.pspSharableImageManager;
        if (pspSharableImageManager != null) {
            return pspSharableImageManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pspSharableImageManager");
        return null;
    }

    public final void setPspSharableImageManager(PspSharableImageManager pspSharableImageManager) {
        Intrinsics.checkNotNullParameter(pspSharableImageManager, "<set-?>");
        this.pspSharableImageManager = pspSharableImageManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentProgramEnrollmentCelebrationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentProgramEnrollmentCelebrationBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buttonsAdapter$lambda$0(ProgramEnrollmentCelebrationFragment programEnrollmentCelebrationFragment, ClientComponentButtonView of, ButtonWithColor buttonWithColor) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(buttonWithColor, "<destruct>");
        GenericButton button = buttonWithColor.getButton();
        int backgroundColor = buttonWithColor.getBackgroundColor();
        of.setCallbacks(programEnrollmentCelebrationFragment);
        of.bind(ServerDrivenButton.INSTANCE.from(button));
        RdsButton button2 = of.getViewBinding().button;
        Intrinsics.checkNotNullExpressionValue(button2, "button");
        RdsButtons.styleCustomPspColor(button2, button, backgroundColor);
        return Unit.INSTANCE;
    }

    private final ProgramEnrollmentCelebrationDuxo getDuxo() {
        return (ProgramEnrollmentCelebrationDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$1(ProgramEnrollmentCelebrationFragment programEnrollmentCelebrationFragment) {
        Screen.Name name = Screen.Name.PSP_CELEBRATION;
        String string2 = ((Args) INSTANCE.getArgs((Fragment) programEnrollmentCelebrationFragment)).getEnrollmentResponse().getProgram_id().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), ProgramEnrollmentCelebrationOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().buttonRecyclerView.setAdapter(this.buttonsAdapter);
        getBinding().buttonRecyclerView.setItemAnimator(null);
        Integer initialBackgroundColor = ((Args) INSTANCE.getArgs((Fragment) this)).getInitialBackgroundColor();
        if (initialBackgroundColor != null) {
            int iIntValue = initialBackgroundColor.intValue();
            ConstraintLayout root = getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ScarletManager2.overrideAttribute(root, android.R.attr.backgroundTint, new ResourceValue(ResourceType.COLOR.INSTANCE, Integer.valueOf(iIntValue)));
            requireActivity().getWindow().setStatusBarColor(iIntValue);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C259631(this));
        Observable observableTake = getDuxo().getStates().ofType(ProgramEnrollmentCelebrationViewState.Loaded.class).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.psp.ProgramEnrollmentCelebrationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProgramEnrollmentCelebrationFragment.onCreate$lambda$3(this.f$0, (ProgramEnrollmentCelebrationViewState.Loaded) obj);
            }
        });
    }

    /* compiled from: ProgramEnrollmentCelebrationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.psp.ProgramEnrollmentCelebrationFragment$onCreate$1 */
    /* synthetic */ class C259631 extends FunctionReferenceImpl implements Function1<ProgramEnrollmentCelebrationViewState, Unit> {
        C259631(Object obj) {
            super(1, obj, ProgramEnrollmentCelebrationFragment.class, "bind", "bind(Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ProgramEnrollmentCelebrationViewState programEnrollmentCelebrationViewState) {
            invoke2(programEnrollmentCelebrationViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ProgramEnrollmentCelebrationViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ProgramEnrollmentCelebrationFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(ProgramEnrollmentCelebrationFragment programEnrollmentCelebrationFragment, ProgramEnrollmentCelebrationViewState.Loaded loaded) {
        programEnrollmentCelebrationFragment.getBinding().composeView.setTranslationY(programEnrollmentCelebrationFragment.requireView().getHeight());
        programEnrollmentCelebrationFragment.getBinding().composeView.animate().translationY(0.0f).setDuration(1500L).setInterpolator(Interpolators.INSTANCE.getDecelCurveInterpolator()).start();
        programEnrollmentCelebrationFragment.getBinding().buttonRecyclerView.setAlpha(0.0f);
        programEnrollmentCelebrationFragment.getBinding().buttonRecyclerView.animate().alpha(1.0f).setDuration(1000L).setStartDelay(1000L).start();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ScarletManager2.overrideAttribute(toolbar, android.R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.attr.colorTransparent));
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        GenericAction typedAction = button.getTypedAction();
        if (Intrinsics.areEqual(typedAction, GenericAction.DismissAction.INSTANCE)) {
            logTap(button.getLoggingIdentifier());
            requireActivity().finish();
            return true;
        }
        if (typedAction instanceof GenericAction.ShareSnapshotAction) {
            logTap(button.getLoggingIdentifier());
            GenericAction.ShareSnapshotAction shareSnapshotAction = (GenericAction.ShareSnapshotAction) typedAction;
            sharePsp(shareSnapshotAction.getImageName(), shareSnapshotAction.getShareSubject());
            return true;
        }
        if (typedAction instanceof GenericAction.DeeplinkAction) {
            logTap(button.getLoggingIdentifier());
        }
        return false;
    }

    /* compiled from: ProgramEnrollmentCelebrationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.psp.ProgramEnrollmentCelebrationFragment$sharePsp$1", m3645f = "ProgramEnrollmentCelebrationFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.psp.ProgramEnrollmentCelebrationFragment$sharePsp$1 */
    static final class C259641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $imageName;
        final /* synthetic */ String $shareSubject;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C259641(String str, String str2, Continuation<? super C259641> continuation) {
            super(2, continuation);
            this.$imageName = str;
            this.$shareSubject = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProgramEnrollmentCelebrationFragment.this.new C259641(this.$imageName, this.$shareSubject, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C259641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PspSharableImageManager pspSharableImageManager = ProgramEnrollmentCelebrationFragment.this.getPspSharableImageManager();
                ComposeView composeView = ProgramEnrollmentCelebrationFragment.this.getBinding().composeView;
                Intrinsics.checkNotNullExpressionValue(composeView, "composeView");
                String str = this.$imageName;
                this.label = 1;
                obj = pspSharableImageManager.getSharableCardImage(composeView, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PspSharableImageManager.Result result = (PspSharableImageManager.Result) obj;
            if (Intrinsics.areEqual(result, PspSharableImageManager.Result.Failure.INSTANCE)) {
                RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                android.content.Context contextRequireContext = ProgramEnrollmentCelebrationFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                RhDialogFragment.Builder message = companion.create(contextRequireContext).setTitle(C11048R.string.error_title, new Object[0]).setMessage(C11048R.string.error_description_something_went_wrong, new Object[0]);
                FragmentManager childFragmentManager = ProgramEnrollmentCelebrationFragment.this.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                RhDialogFragment.Builder.show$default(message, childFragmentManager, "share-psp-error", false, 4, null);
            } else {
                if (!(result instanceof PspSharableImageManager.Result.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                PspSharableImageManager.Result.Success success = (PspSharableImageManager.Result.Success) result;
                new ShareCompat.IntentBuilder(ProgramEnrollmentCelebrationFragment.this.requireActivity()).setType(success.getMimeType()).setStream(success.getUri()).setChooserTitle(this.$shareSubject).startChooser();
            }
            return Unit.INSTANCE;
        }
    }

    private final void sharePsp(String imageName, String shareSubject) {
        getLifecycleScope().launchWhenCreated(new C259641(imageName, shareSubject, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final ProgramEnrollmentCelebrationViewState state) {
        if (Intrinsics.areEqual(state, ProgramEnrollmentCelebrationViewState.Loading.INSTANCE)) {
            return;
        }
        if (!(state instanceof ProgramEnrollmentCelebrationViewState.Loaded)) {
            throw new NoWhenBranchMatchedException();
        }
        ProgramEnrollmentCelebrationViewState.Loaded loaded = (ProgramEnrollmentCelebrationViewState.Loaded) state;
        int backgroundColor = loaded.getBackgroundColor();
        requireActivity().getWindow().setStatusBarColor(backgroundColor);
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ScarletManager2.overrideAttribute(root, android.R.attr.backgroundTint, new ResourceValue(ResourceType.COLOR.INSTANCE, Integer.valueOf(backgroundColor)));
        getBinding().composeView.setContent(ComposableLambda3.composableLambdaInstance(1406414313, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.psp.ProgramEnrollmentCelebrationFragment.bind.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1406414313, i, -1, "com.robinhood.android.psp.ProgramEnrollmentCelebrationFragment.bind.<anonymous> (ProgramEnrollmentCelebrationFragment.kt:208)");
                }
                Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ProgramEnrollmentCelebrationFragment.this.getScarletManager());
                final ProgramEnrollmentCelebrationViewState programEnrollmentCelebrationViewState = state;
                final ProgramEnrollmentCelebrationFragment programEnrollmentCelebrationFragment = ProgramEnrollmentCelebrationFragment.this;
                BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(1463777947, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.psp.ProgramEnrollmentCelebrationFragment.bind.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Composer composer2, int i2) {
                        int i3 = 2;
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1463777947, i2, -1, "com.robinhood.android.psp.ProgramEnrollmentCelebrationFragment.bind.<anonymous>.<anonymous> (ProgramEnrollmentCelebrationFragment.kt:209)");
                        }
                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1));
                        String cardEyebrow = ((ProgramEnrollmentCelebrationViewState.Loaded) programEnrollmentCelebrationViewState).getCardEyebrow();
                        AnnotatedString annotatedString = new AnnotatedString(((ProgramEnrollmentCelebrationViewState.Loaded) programEnrollmentCelebrationViewState).getCardTitle(), null, i3, 0 == true ? 1 : 0);
                        String cardPrimaryText = ((ProgramEnrollmentCelebrationViewState.Loaded) programEnrollmentCelebrationViewState).getCardPrimaryText();
                        String cardMetadataPrimaryText = ((ProgramEnrollmentCelebrationViewState.Loaded) programEnrollmentCelebrationViewState).getCardMetadataPrimaryText();
                        String description = ((ProgramEnrollmentCelebrationViewState.Loaded) programEnrollmentCelebrationViewState).getDescription();
                        SecondaryRow secondaryRow = ((ProgramEnrollmentCelebrationViewState.Loaded) programEnrollmentCelebrationViewState).getSecondaryRow();
                        long jM17790getCardBackgroundColor0d7_KjU = ((ProgramEnrollmentCelebrationViewState.Loaded) programEnrollmentCelebrationViewState).getCardBackgroundColor();
                        long jM17791getColorOnPrimary0d7_KjU = ((ProgramEnrollmentCelebrationViewState.Loaded) programEnrollmentCelebrationViewState).getColorOnPrimary();
                        final ProgramEnrollmentCelebrationFragment programEnrollmentCelebrationFragment2 = programEnrollmentCelebrationFragment;
                        final ProgramEnrollmentCelebrationViewState programEnrollmentCelebrationViewState2 = programEnrollmentCelebrationViewState;
                        BentoCelebrationCard.m20873BentoCelebrationCardjY6E1Zs(modifierNavigationBarsPadding, cardEyebrow, annotatedString, null, ComposableLambda3.rememberComposableLambda(-2041340845, true, new Function3<Color, Composer, Integer, Unit>() { // from class: com.robinhood.android.psp.ProgramEnrollmentCelebrationFragment.bind.1.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Color color, Composer composer3, Integer num) {
                                m17789invokeek8zF_U(color.getValue(), composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-ek8zF_U, reason: not valid java name */
                            public final void m17789invokeek8zF_U(long j, Composer composer3, int i4) {
                                int i5;
                                if ((i4 & 6) == 0) {
                                    i5 = (composer3.changed(j) ? 4 : 2) | i4;
                                } else {
                                    i5 = i4;
                                }
                                if ((i5 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2041340845, i5, -1, "com.robinhood.android.psp.ProgramEnrollmentCelebrationFragment.bind.<anonymous>.<anonymous>.<anonymous> (ProgramEnrollmentCelebrationFragment.kt:212)");
                                }
                                ProgramEnrollmentCelebrationFragment programEnrollmentCelebrationFragment3 = programEnrollmentCelebrationFragment2;
                                ProgramEnrollmentCelebrationViewState.Loaded loaded2 = (ProgramEnrollmentCelebrationViewState.Loaded) programEnrollmentCelebrationViewState2;
                                android.content.Context contextRequireContext = programEnrollmentCelebrationFragment3.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                HttpUrl httpUrlPartnerLogoUrl = loaded2.partnerLogoUrl(contextRequireContext);
                                ProgramEnrollmentCelebrationViewState.Loaded loaded3 = (ProgramEnrollmentCelebrationViewState.Loaded) programEnrollmentCelebrationViewState2;
                                android.content.Context contextRequireContext2 = programEnrollmentCelebrationFragment2.requireContext();
                                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                programEnrollmentCelebrationFragment3.m17787PspCelebrationHeadersW7UJKQ(null, j, httpUrlPartnerLogoUrl, loaded3.rhLogoUrl(contextRequireContext2), composer3, (i5 << 3) & 112, 1);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), cardPrimaryText, cardMetadataPrimaryText, description, secondaryRow, jM17790getCardBackgroundColor0d7_KjU, jM17791getColorOnPrimary0d7_KjU, composer2, (SecondaryRow.$stable << 24) | 24576, 0, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        this.buttonsAdapter.submitList(loaded.getFooterButtons());
    }

    private final void logTap(String loggingIdentifier) {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.BUTTON, loggingIdentifier, null, 4, null), null, null, false, 57, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* renamed from: PspCelebrationHeader-sW7UJKQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m17787PspCelebrationHeadersW7UJKQ(Modifier modifier, final long j, final HttpUrl httpUrl, final HttpUrl httpUrl2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1432432707);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(httpUrl) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(httpUrl2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1432432707, i3, -1, "com.robinhood.android.psp.ProgramEnrollmentCelebrationFragment.PspCelebrationHeader (ProgramEnrollmentCelebrationFragment.kt:248)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, C2002Dp.m7995constructorimpl(8), 1, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getEnd(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(httpUrl).allowHardware(false).build(), null, null, null, 0, null, composerStartRestartGroup, 0, 62);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                float f = 48;
                int i5 = ((i3 << 6) & 7168) | 432;
                IconKt.m5602Iconww6aTOc(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, SizeKt.m5169size3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), j, composerStartRestartGroup, i5, 0);
                float f2 = 20;
                Divider2.m5581DivideroMI9zvI(SizeKt.m5174width3ABfNKs(SizeKt.fillMaxHeight$default(SizeKt.m5156height3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion2, C2002Dp.m7995constructorimpl(f2), 0.0f, 2, null), C2002Dp.m7995constructorimpl(f2)), 0.0f, 1, null), C2002Dp.m7995constructorimpl(1)), j, 0.0f, 0.0f, composerStartRestartGroup, (i3 & 112) | 6, 12);
                AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg2 = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(httpUrl2).allowHardware(false).build(), null, null, null, 0, null, composerStartRestartGroup, 0, 62);
                composerStartRestartGroup = composerStartRestartGroup;
                IconKt.m5602Iconww6aTOc(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg2, (String) null, SizeKt.m5169size3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), j, composerStartRestartGroup, i5, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.psp.ProgramEnrollmentCelebrationFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ProgramEnrollmentCelebrationFragment.PspCelebrationHeader_sW7UJKQ$lambda$5(this.f$0, modifier3, j, httpUrl, httpUrl2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifier4, 0.0f, C2002Dp.m7995constructorimpl(8), 1, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getEnd(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg3 = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(httpUrl).allowHardware(false).build(), null, null, null, 0, null, composerStartRestartGroup, 0, 62);
                Modifier.Companion companion22 = Modifier.INSTANCE;
                float f3 = 48;
                int i52 = ((i3 << 6) & 7168) | 432;
                IconKt.m5602Iconww6aTOc(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg3, (String) null, SizeKt.m5169size3ABfNKs(companion22, C2002Dp.m7995constructorimpl(f3)), j, composerStartRestartGroup, i52, 0);
                float f22 = 20;
                Divider2.m5581DivideroMI9zvI(SizeKt.m5174width3ABfNKs(SizeKt.fillMaxHeight$default(SizeKt.m5156height3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion22, C2002Dp.m7995constructorimpl(f22), 0.0f, 2, null), C2002Dp.m7995constructorimpl(f22)), 0.0f, 1, null), C2002Dp.m7995constructorimpl(1)), j, 0.0f, 0.0f, composerStartRestartGroup, (i3 & 112) | 6, 12);
                AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg22 = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(httpUrl2).allowHardware(false).build(), null, null, null, 0, null, composerStartRestartGroup, 0, 62);
                composerStartRestartGroup = composerStartRestartGroup;
                IconKt.m5602Iconww6aTOc(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg22, (String) null, SizeKt.m5169size3ABfNKs(companion22, C2002Dp.m7995constructorimpl(f3)), j, composerStartRestartGroup, i52, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: ProgramEnrollmentCelebrationFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J$\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0003J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationFragment$Args;", "Landroid/os/Parcelable;", "initialBackgroundColor", "", "enrollmentResponse", "Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;", "<init>", "(Ljava/lang/Integer;Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;)V", "getInitialBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEnrollmentResponse", "()Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;)Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationFragment$Args;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiPspEnrollmentResponse enrollmentResponse;
        private final Integer initialBackgroundColor;

        /* compiled from: ProgramEnrollmentCelebrationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (ApiPspEnrollmentResponse) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, Integer num, ApiPspEnrollmentResponse apiPspEnrollmentResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                num = args.initialBackgroundColor;
            }
            if ((i & 2) != 0) {
                apiPspEnrollmentResponse = args.enrollmentResponse;
            }
            return args.copy(num, apiPspEnrollmentResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getInitialBackgroundColor() {
            return this.initialBackgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiPspEnrollmentResponse getEnrollmentResponse() {
            return this.enrollmentResponse;
        }

        public final Args copy(Integer initialBackgroundColor, ApiPspEnrollmentResponse enrollmentResponse) {
            Intrinsics.checkNotNullParameter(enrollmentResponse, "enrollmentResponse");
            return new Args(initialBackgroundColor, enrollmentResponse);
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
            return Intrinsics.areEqual(this.initialBackgroundColor, args.initialBackgroundColor) && Intrinsics.areEqual(this.enrollmentResponse, args.enrollmentResponse);
        }

        public int hashCode() {
            Integer num = this.initialBackgroundColor;
            return ((num == null ? 0 : num.hashCode()) * 31) + this.enrollmentResponse.hashCode();
        }

        public String toString() {
            return "Args(initialBackgroundColor=" + this.initialBackgroundColor + ", enrollmentResponse=" + this.enrollmentResponse + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.initialBackgroundColor;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
            dest.writeParcelable(this.enrollmentResponse, flags);
        }

        public Args(Integer num, ApiPspEnrollmentResponse enrollmentResponse) {
            Intrinsics.checkNotNullParameter(enrollmentResponse, "enrollmentResponse");
            this.initialBackgroundColor = num;
            this.enrollmentResponse = enrollmentResponse;
        }

        public final Integer getInitialBackgroundColor() {
            return this.initialBackgroundColor;
        }

        public final ApiPspEnrollmentResponse getEnrollmentResponse() {
            return this.enrollmentResponse;
        }
    }

    /* compiled from: ProgramEnrollmentCelebrationFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ProgramEnrollmentCelebration;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationFragment;", "Lcom/robinhood/android/psp/ProgramEnrollmentCelebrationFragment$Args;", "<init>", "()V", "TRANSLATION_Y_DURATION", "", "ALPHA_DURATION", "ALPHA_DURATION_DELAY", "createFragment", "key", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.ProgramEnrollmentCelebration>, FragmentWithArgsCompanion<ProgramEnrollmentCelebrationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ProgramEnrollmentCelebrationFragment programEnrollmentCelebrationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, programEnrollmentCelebrationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ProgramEnrollmentCelebrationFragment newInstance(Args args) {
            return (ProgramEnrollmentCelebrationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ProgramEnrollmentCelebrationFragment programEnrollmentCelebrationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, programEnrollmentCelebrationFragment, args);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public ProgramEnrollmentCelebrationFragment createFragment(LegacyFragmentKey.ProgramEnrollmentCelebration key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (ProgramEnrollmentCelebrationFragment) ProgramEnrollmentCelebrationFragment.INSTANCE.newInstance((Parcelable) new Args(Integer.valueOf(key.getInitialBackgroundColor()), key.getEnrollmentResponse()));
        }
    }
}
