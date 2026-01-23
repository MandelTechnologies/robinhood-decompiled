package com.robinhood.android.resumeapplication;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.bonfire.ChurnedFundingV2Content;
import com.robinhood.models.api.bonfire.ResumeApplicationResponse8;
import com.robinhood.models.api.bonfire.ResumeApplicationTakeoverLoggingInfo;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.ResumeApplicationChurnedAction;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.ThemedImageSource;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.ResumeApplicationTakeoverContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import p479j$.time.Clock;

/* compiled from: ResurrectionInactiveAndLowAumFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0003 !\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\r\u0010\u001e\u001a\u00020\u001cH\u0017¢\u0006\u0002\u0010\u001fR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResurrectionInactiveAndLowAumFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/resumeapplication/ResurrectionInactiveAndLowAumFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/resumeapplication/ResurrectionInactiveAndLowAumFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "onStart", "", "onStop", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ResurrectionInactiveAndLowAumFragment extends GenericComposeFragment implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ResurrectionInactiveAndLowAumFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/resumeapplication/ResurrectionInactiveAndLowAumFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ResurrectionInactiveAndLowAumFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResurrectionInactiveAndLowAumFragment$Callbacks;", "", "onFundAccountCancel", "", "onDetermineResurrectionUpsell", "", "action", "Lcom/robinhood/models/serverdriven/experimental/api/ResumeApplicationChurnedAction;", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        boolean onDetermineResurrectionUpsell(ResumeApplicationChurnedAction action);

        void onFundAccountCancel();
    }

    /* compiled from: ResurrectionInactiveAndLowAumFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResumeApplicationResponse8.values().length];
            try {
                iArr[ResumeApplicationResponse8.CRYPTO_TRANSFERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(ResurrectionInactiveAndLowAumFragment resurrectionInactiveAndLowAumFragment, int i, Composer composer, int i2) {
        resurrectionInactiveAndLowAumFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Context getEventContext() {
        Companion companion = INSTANCE;
        String str = null;
        return new Context(0, 0, 0, null, null, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ResumeApplicationTakeoverContext(((Args) companion.getArgs((Fragment) this)).getTakeoverLoggingInfo().getSeenResurrectionCount() == 0 ? 0L : Clock.systemDefaultZone().millis() - ((Args) companion.getArgs((Fragment) this)).getTakeoverLoggingInfo().getMsLastResurrectionSeen(), ((Args) companion.getArgs((Fragment) this)).getTakeoverLoggingInfo().getSeenResurrectionCount(), null, str, null, 28, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -268435457, -1, 16383, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        String loggingScreenIdentifier = ((Args) INSTANCE.getArgs((Fragment) this)).getChurnedFundingV2Content().getLoggingScreenIdentifier();
        if (loggingScreenIdentifier == null) {
            loggingScreenIdentifier = "resume_application_churned_fund_v2";
        }
        return new Screen(Screen.Name.RESUME_APPLICATION_V2_TAKEOVER, null, loggingScreenIdentifier, null, 10, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return new UserInteractionEventData(null, getEventScreen(), null, null, getEventContext(), null, null, 109, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), false);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), true);
        super.onStop();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        final Brush brushM6676horizontalGradient8A3gB4$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(2077249934);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2077249934, i2, -1, "com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumFragment.ComposeContent (ResurrectionInactiveAndLowAumFragment.kt:80)");
            }
            Companion companion = INSTANCE;
            final ChurnedFundingV2Content churnedFundingV2Content = ((Args) companion.getArgs((Fragment) this)).getChurnedFundingV2Content();
            final Button<ResumeApplicationChurnedAction> cta = churnedFundingV2Content.getCta();
            if (WhenMappings.$EnumSwitchMapping$0[((Args) companion.getArgs((Fragment) this)).getVariant().ordinal()] == 1) {
                brushM6676horizontalGradient8A3gB4$default = Brush.Companion.m6678linearGradientmHitzGk$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4278190080L)), Color.m6701boximpl(Color2.Color(4278190080L))}), 0L, 0L, 0, 14, (Object) null);
            } else {
                brushM6676horizontalGradient8A3gB4$default = Brush.Companion.m6676horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color2.Color(4278214450L)), Color.m6701boximpl(Color2.Color(4278206498L))}), 0.0f, 0.0f, 0, 14, (Object) null);
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, getEventContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(737938883, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumFragment.ComposeContent.1

                /* compiled from: ResurrectionInactiveAndLowAumFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ ChurnedFundingV2Content $churnedFundingV2Content;
                    final /* synthetic */ Button<ResumeApplicationChurnedAction> $ctaButton;
                    final /* synthetic */ Brush $gradientBackground;
                    final /* synthetic */ ResurrectionInactiveAndLowAumFragment this$0;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(ChurnedFundingV2Content churnedFundingV2Content, ResurrectionInactiveAndLowAumFragment resurrectionInactiveAndLowAumFragment, Button<? extends ResumeApplicationChurnedAction> button, Brush brush) {
                        this.$churnedFundingV2Content = churnedFundingV2Content;
                        this.this$0 = resurrectionInactiveAndLowAumFragment;
                        this.$ctaButton = button;
                        this.$gradientBackground = brush;
                    }

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
                            ComposerKt.traceEventStart(-1079768050, i, -1, "com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumFragment.ComposeContent.<anonymous>.<anonymous> (ResurrectionInactiveAndLowAumFragment.kt:107)");
                        }
                        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE);
                        ThemedImageSource headerImage = this.$churnedFundingV2Content.getHeaderImage();
                        Companion companion = ResurrectionInactiveAndLowAumFragment.INSTANCE;
                        String title = ((Args) companion.getArgs((Fragment) this.this$0)).getTitle();
                        String subtitle = ((Args) companion.getArgs((Fragment) this.this$0)).getSubtitle();
                        ImmutableList immutableList = extensions2.toImmutableList(this.$churnedFundingV2Content.getValueProps());
                        RichText disclosure = this.$churnedFundingV2Content.getDisclosure();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final ResurrectionInactiveAndLowAumFragment resurrectionInactiveAndLowAumFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumFragment$ComposeContent$1$1$1$1
                                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                public final boolean mo15941handle(ResumeApplicationChurnedAction action) {
                                    Intrinsics.checkNotNullParameter(action, "action");
                                    return resurrectionInactiveAndLowAumFragment.getCallbacks().onDetermineResurrectionUpsell(action);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue;
                        composer.endReplaceGroup();
                        Button<ResumeApplicationChurnedAction> button = this.$ctaButton;
                        Brush brush = this.$gradientBackground;
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final ResurrectionInactiveAndLowAumFragment resurrectionInactiveAndLowAumFragment2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ResurrectionInactiveAndLowAumFragment.C269571.AnonymousClass1.invoke$lambda$2$lambda$1(resurrectionInactiveAndLowAumFragment2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        ResurrectionInactiveAndLowAumComposable3.ResurrectionInactiveAndLowAumComposable(headerImage, title, subtitle, immutableList, disclosure, button, brush, sduiActionHandler, (Function0) objRememberedValue2, modifierNavigationBarsPadding, composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(ResurrectionInactiveAndLowAumFragment resurrectionInactiveAndLowAumFragment) {
                        resurrectionInactiveAndLowAumFragment.getCallbacks().onFundAccountCancel();
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(737938883, i3, -1, "com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumFragment.ComposeContent.<anonymous> (ResurrectionInactiveAndLowAumFragment.kt:106)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1079768050, true, new AnonymousClass1(churnedFundingV2Content, this, cta, brushM6676horizontalGradient8A3gB4$default), composer2, 54), composer2, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.resumeapplication.ResurrectionInactiveAndLowAumFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResurrectionInactiveAndLowAumFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ResurrectionInactiveAndLowAumFragment.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResurrectionInactiveAndLowAumFragment$Args;", "Landroid/os/Parcelable;", "variant", "Lcom/robinhood/models/api/bonfire/ResumeApplicationVariant;", "title", "", "subtitle", "churnedFundingV2Content", "Lcom/robinhood/models/api/bonfire/ChurnedFundingV2Content;", "takeoverLoggingInfo", "Lcom/robinhood/models/api/bonfire/ResumeApplicationTakeoverLoggingInfo;", "<init>", "(Lcom/robinhood/models/api/bonfire/ResumeApplicationVariant;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/bonfire/ChurnedFundingV2Content;Lcom/robinhood/models/api/bonfire/ResumeApplicationTakeoverLoggingInfo;)V", "getVariant", "()Lcom/robinhood/models/api/bonfire/ResumeApplicationVariant;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getChurnedFundingV2Content", "()Lcom/robinhood/models/api/bonfire/ChurnedFundingV2Content;", "getTakeoverLoggingInfo", "()Lcom/robinhood/models/api/bonfire/ResumeApplicationTakeoverLoggingInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ChurnedFundingV2Content churnedFundingV2Content;
        private final String subtitle;
        private final ResumeApplicationTakeoverLoggingInfo takeoverLoggingInfo;
        private final String title;
        private final ResumeApplicationResponse8 variant;

        /* compiled from: ResurrectionInactiveAndLowAumFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(ResumeApplicationResponse8.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (ChurnedFundingV2Content) parcel.readParcelable(Args.class.getClassLoader()), (ResumeApplicationTakeoverLoggingInfo) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ResumeApplicationResponse8 resumeApplicationResponse8, String str, String str2, ChurnedFundingV2Content churnedFundingV2Content, ResumeApplicationTakeoverLoggingInfo resumeApplicationTakeoverLoggingInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                resumeApplicationResponse8 = args.variant;
            }
            if ((i & 2) != 0) {
                str = args.title;
            }
            if ((i & 4) != 0) {
                str2 = args.subtitle;
            }
            if ((i & 8) != 0) {
                churnedFundingV2Content = args.churnedFundingV2Content;
            }
            if ((i & 16) != 0) {
                resumeApplicationTakeoverLoggingInfo = args.takeoverLoggingInfo;
            }
            ResumeApplicationTakeoverLoggingInfo resumeApplicationTakeoverLoggingInfo2 = resumeApplicationTakeoverLoggingInfo;
            String str3 = str2;
            return args.copy(resumeApplicationResponse8, str, str3, churnedFundingV2Content, resumeApplicationTakeoverLoggingInfo2);
        }

        /* renamed from: component1, reason: from getter */
        public final ResumeApplicationResponse8 getVariant() {
            return this.variant;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final ChurnedFundingV2Content getChurnedFundingV2Content() {
            return this.churnedFundingV2Content;
        }

        /* renamed from: component5, reason: from getter */
        public final ResumeApplicationTakeoverLoggingInfo getTakeoverLoggingInfo() {
            return this.takeoverLoggingInfo;
        }

        public final Args copy(ResumeApplicationResponse8 variant, String title, String subtitle, ChurnedFundingV2Content churnedFundingV2Content, ResumeApplicationTakeoverLoggingInfo takeoverLoggingInfo) {
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(churnedFundingV2Content, "churnedFundingV2Content");
            Intrinsics.checkNotNullParameter(takeoverLoggingInfo, "takeoverLoggingInfo");
            return new Args(variant, title, subtitle, churnedFundingV2Content, takeoverLoggingInfo);
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
            return this.variant == args.variant && Intrinsics.areEqual(this.title, args.title) && Intrinsics.areEqual(this.subtitle, args.subtitle) && Intrinsics.areEqual(this.churnedFundingV2Content, args.churnedFundingV2Content) && Intrinsics.areEqual(this.takeoverLoggingInfo, args.takeoverLoggingInfo);
        }

        public int hashCode() {
            return (((((((this.variant.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.churnedFundingV2Content.hashCode()) * 31) + this.takeoverLoggingInfo.hashCode();
        }

        public String toString() {
            return "Args(variant=" + this.variant + ", title=" + this.title + ", subtitle=" + this.subtitle + ", churnedFundingV2Content=" + this.churnedFundingV2Content + ", takeoverLoggingInfo=" + this.takeoverLoggingInfo + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.variant.name());
            dest.writeString(this.title);
            dest.writeString(this.subtitle);
            dest.writeParcelable(this.churnedFundingV2Content, flags);
            dest.writeParcelable(this.takeoverLoggingInfo, flags);
        }

        public Args(ResumeApplicationResponse8 variant, String title, String subtitle, ChurnedFundingV2Content churnedFundingV2Content, ResumeApplicationTakeoverLoggingInfo takeoverLoggingInfo) {
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(churnedFundingV2Content, "churnedFundingV2Content");
            Intrinsics.checkNotNullParameter(takeoverLoggingInfo, "takeoverLoggingInfo");
            this.variant = variant;
            this.title = title;
            this.subtitle = subtitle;
            this.churnedFundingV2Content = churnedFundingV2Content;
            this.takeoverLoggingInfo = takeoverLoggingInfo;
        }

        public final ResumeApplicationResponse8 getVariant() {
            return this.variant;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final ChurnedFundingV2Content getChurnedFundingV2Content() {
            return this.churnedFundingV2Content;
        }

        public final ResumeApplicationTakeoverLoggingInfo getTakeoverLoggingInfo() {
            return this.takeoverLoggingInfo;
        }
    }

    /* compiled from: ResurrectionInactiveAndLowAumFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/resumeapplication/ResurrectionInactiveAndLowAumFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/resumeapplication/ResurrectionInactiveAndLowAumFragment;", "Lcom/robinhood/android/resumeapplication/ResurrectionInactiveAndLowAumFragment$Args;", "<init>", "()V", "feature-lib-resume-application_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ResurrectionInactiveAndLowAumFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ResurrectionInactiveAndLowAumFragment resurrectionInactiveAndLowAumFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, resurrectionInactiveAndLowAumFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ResurrectionInactiveAndLowAumFragment newInstance(Args args) {
            return (ResurrectionInactiveAndLowAumFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ResurrectionInactiveAndLowAumFragment resurrectionInactiveAndLowAumFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, resurrectionInactiveAndLowAumFragment, args);
        }
    }
}
