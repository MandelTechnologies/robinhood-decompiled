package com.robinhood.android.slip.onboarding.agreements;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SlipRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.slip.C28532R;
import com.robinhood.android.slip.databinding.FragmentSlipOnboardingAgreementsBinding;
import com.robinhood.android.slip.onboarding.agreements.SlipAgreementRow;
import com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.SLIPContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.agreementview.AgreementAdditionalCheckboxes;
import com.robinhood.shared.common.contracts.WebDeeplinkIntentKey;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.text.Spans;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.Markwon;
import io.noties.markwon.core.MarkwonTheme;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SlipOnboardingAgreementsFragment.kt */
@Metadata(m3635d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003WXYB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u000205H\u0016J\u001a\u0010;\u001a\u0002052\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0010\u0010@\u001a\u0002052\u0006\u0010A\u001a\u00020BH\u0002JD\u0010C\u001a\u0002052\f\u0010D\u001a\b\u0012\u0004\u0012\u0002010E2\b\u0010F\u001a\u0004\u0018\u00010G2\u0012\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I0E2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010EH\u0002J$\u0010L\u001a\u0002052\u0006\u0010M\u001a\u0002092\b\u0010N\u001a\u0004\u0018\u00010G2\b\u0010O\u001a\u0004\u0018\u00010PH\u0002J\t\u0010Q\u001a\u000209H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b'\u0010(R\u0016\u0010*\u001a\u0004\u0018\u00010+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00102\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002010/X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010R\u001a\b\u0012\u0004\u0012\u00020T0SX\u0096\u0005¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "markwonBuilder", "Lio/noties/markwon/Markwon$Builder;", "getMarkwonBuilder", "()Lio/noties/markwon/Markwon$Builder;", "setMarkwonBuilder", "(Lio/noties/markwon/Markwon$Builder;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "markwon$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "duxo", "Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsDuxo;", "getDuxo", "()Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsDuxo;", "duxo$delegate", "binding", "Lcom/robinhood/android/slip/databinding/FragmentSlipOnboardingAgreementsBinding;", "getBinding", "()Lcom/robinhood/android/slip/databinding/FragmentSlipOnboardingAgreementsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsFragment$Callbacks;", "callbacks$delegate", "toolbarPage", "Landroid/widget/TextView;", "getToolbarPage", "()Landroid/widget/TextView;", "agreementsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/slip/onboarding/agreements/SlipAgreementRow;", "Lcom/robinhood/android/slip/onboarding/agreements/ExpandableAgreement;", "agreementLinksAdapter", "Lcom/robinhood/android/slip/onboarding/agreements/SlipAgreementLinkRow;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "", "onStart", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setState", "state", "Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsViewState;", "updateAgreementsList", "agreements", "", "summaryTitle", "", "summaryItems", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "additionalCheckboxes", "updateCrsLink", "isAcknowledgeContentLightTextColor", "acknowledgeContent", "ctaText", "Lcom/robinhood/models/ui/UiSlipAgreements$TextLink;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SlipOnboardingAgreementsFragment extends BaseFragment implements RegionGated, AutoLoggableFragment {
    private static final int SCROLL_DIRECTION_DOWN = 1;
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final GenericListAdapter<SlipAgreementLinkRow, ExpandableAgreement> agreementLinksAdapter;
    private final GenericListAdapter<SlipAgreementRow, ExpandableAgreement> agreementsAdapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: markwon$delegate, reason: from kotlin metadata */
    private final Lazy markwon;
    public Markwon.Builder markwonBuilder;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SlipOnboardingAgreementsFragment.class, "binding", "getBinding()Lcom/robinhood/android/slip/databinding/FragmentSlipOnboardingAgreementsBinding;", 0)), Reflection.property1(new PropertyReference1Impl(SlipOnboardingAgreementsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SlipOnboardingAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsFragment$Callbacks;", "", "onAgreementsAccepted", "", "onAgreementsError", "throwable", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAgreementsAccepted();

        void onAgreementsError(Throwable throwable);
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

    public SlipOnboardingAgreementsFragment() {
        super(C28532R.layout.fragment_slip_onboarding_agreements);
        this.$$delegate_0 = new RegionGated2(SlipRegionGate.INSTANCE);
        this.markwon = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SlipOnboardingAgreementsFragment.markwon_delegate$lambda$0(this.f$0);
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, SlipOnboardingAgreementsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, SlipOnboardingAgreementsFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof SlipOnboardingAgreementsFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        SlipAgreementRow.Companion companion2 = SlipAgreementRow.INSTANCE;
        DiffCallbacks.Equality equality = DiffCallbacks.Equality.INSTANCE;
        this.agreementsAdapter = companion.m2987of(companion2, equality, new Function2() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SlipOnboardingAgreementsFragment.agreementsAdapter$lambda$1((SlipAgreementRow) obj, (ExpandableAgreement) obj2);
            }
        });
        this.agreementLinksAdapter = companion.m2987of(SlipAgreementLinkRow.INSTANCE, equality, new Function2() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SlipOnboardingAgreementsFragment.agreementLinksAdapter$lambda$2((SlipAgreementLinkRow) obj, (ExpandableAgreement) obj2);
            }
        });
    }

    public final Markwon.Builder getMarkwonBuilder() {
        Markwon.Builder builder = this.markwonBuilder;
        if (builder != null) {
            return builder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwonBuilder");
        return null;
    }

    public final void setMarkwonBuilder(Markwon.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<set-?>");
        this.markwonBuilder = builder;
    }

    private final Markwon getMarkwon() {
        return (Markwon) this.markwon.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Markwon markwon_delegate$lambda$0(final SlipOnboardingAgreementsFragment slipOnboardingAgreementsFragment) {
        Markwon markwonBuild = slipOnboardingAgreementsFragment.getMarkwonBuilder().usePlugin(new AbstractMarkwonPlugin() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment$markwon$2$1
            @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
            public void configureTheme(MarkwonTheme.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                builder.bulletWidth(this.this$0.getResources().getDimensionPixelSize(C28532R.dimen.bullet_diameter));
            }
        }).build();
        Intrinsics.checkNotNullExpressionValue(markwonBuild, "build(...)");
        return markwonBuild;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.SLIP_ONBOARDING_AGREEMENTS_ABBREVIATED, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return new UserInteractionEventData(null, getEventScreen(), null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((Args) INSTANCE.getArgs((Fragment) this)).getLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -8193, -1, -1, -1, 16383, null), null, null, 109, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SlipOnboardingAgreementsDuxo getDuxo() {
        return (SlipOnboardingAgreementsDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentSlipOnboardingAgreementsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSlipOnboardingAgreementsBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final TextView getToolbarPage() {
        return (TextView) requireToolbar().findViewById(C28532R.id.page);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit agreementsAdapter$lambda$1(SlipAgreementRow of, ExpandableAgreement agreement) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        of.bind(agreement);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit agreementLinksAdapter$lambda$2(SlipAgreementLinkRow of, ExpandableAgreement agreement) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        of.bind(agreement);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (getToolbarPage() == null) {
            RhToolbar.addCustomView$default(toolbar, C28532R.layout.include_slip_agreements_toolbar_layout, true, 0, 4, null);
        }
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getShowRecommendedFlow() || ((Args) companion.getArgs((Fragment) this)).isQuickEnrollment()) {
            requireToolbar().getToolbar().setNavigationIcon(C20690R.drawable.ic_rds_close_24dp);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getShowRecommendedFlow() || ((Args) companion.getArgs((Fragment) this)).isQuickEnrollment()) {
            requireActivity().finish();
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable<SlipOnboardingAgreementsViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C285751(this));
    }

    /* compiled from: SlipOnboardingAgreementsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment$onStart$1 */
    /* synthetic */ class C285751 extends FunctionReferenceImpl implements Function1<SlipOnboardingAgreementsViewState, Unit> {
        C285751(Object obj) {
            super(1, obj, SlipOnboardingAgreementsFragment.class, "setState", "setState(Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SlipOnboardingAgreementsViewState slipOnboardingAgreementsViewState) {
            invoke2(slipOnboardingAgreementsViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SlipOnboardingAgreementsViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((SlipOnboardingAgreementsFragment) this.receiver).setState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentSlipOnboardingAgreementsBinding binding = getBinding();
        LinearLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BaseFragments2.setContentBelowToolbar(this, root);
        RecyclerView agreementLinksList = binding.agreementLinksList;
        Intrinsics.checkNotNullExpressionValue(agreementLinksList, "agreementLinksList");
        bindAdapter(agreementLinksList, this.agreementLinksAdapter);
        binding.scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment$onViewCreated$1$1
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i, int i2, int i3, int i4) {
                if (view2.canScrollVertically(1)) {
                    return;
                }
                this.this$0.getDuxo().onAgreementsReviewed();
            }
        });
        RdsButton cta = binding.cta;
        Intrinsics.checkNotNullExpressionValue(cta, "cta");
        OnClickListeners.onClick(cta, new Function0() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SlipOnboardingAgreementsFragment.onViewCreated$lambda$4$lambda$3(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$3(SlipOnboardingAgreementsFragment slipOnboardingAgreementsFragment) {
        slipOnboardingAgreementsFragment.getDuxo().onCtaClicked(slipOnboardingAgreementsFragment.getEventScreen());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(SlipOnboardingAgreementsViewState state) {
        Throwable thConsume;
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setLoadingViewVisible(state.isLoading());
        }
        UiEvent<Throwable> errorEvent = state.getErrorEvent();
        if (errorEvent != null && (thConsume = errorEvent.consume()) != null) {
            getCallbacks().onAgreementsError(thConsume);
        }
        UiEvent<Unit> agreementsAcceptedEvent = state.getAgreementsAcceptedEvent();
        if ((agreementsAcceptedEvent != null ? agreementsAcceptedEvent.consume() : null) != null) {
            IdlingResourceCounters2.setBusy(IdlingResourceType.SLIP_ONBOARDING_ACCEPT_AGREEMENTS, true);
            getCallbacks().onAgreementsAccepted();
        }
        UiEvent<Unit> scrollToBottomEvent = state.getScrollToBottomEvent();
        if ((scrollToBottomEvent != null ? scrollToBottomEvent.consume() : null) != null) {
            getBinding().scrollView.post(new Runnable() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment.setState.2
                @Override // java.lang.Runnable
                public final void run() {
                    SlipOnboardingAgreementsFragment.this.getBinding().scrollView.smoothScrollTo(0, SlipOnboardingAgreementsFragment.this.getBinding().scrollView.getBottom());
                }
            });
        }
        if (state.getAgreementsV2() != null) {
            FragmentSlipOnboardingAgreementsBinding binding = getBinding();
            binding.markdownContainer.setVisibility(0);
            binding.legacyContainer.setVisibility(8);
            RhTextView rhTextView = binding.markdown;
            Markwon markwon = getMarkwon();
            Iterator<UiSlipAgreements.AgreementV2> it = state.getAgreementsV2().iterator();
            String str = "";
            while (it.hasNext()) {
                str = str + "\n\n" + it.next().getMarkdown();
            }
            rhTextView.setText(markwon.toMarkdown(str));
            binding.cta.setText(getString(state.getCtaTextStringRes()));
            binding.cta.setEnabled(state.isCtaEnabled());
            updateCrsLink(state.isAcknowledgeContentLightTextColor(), state.getAcknowledgeContent(), state.getCrsLink());
            return;
        }
        FragmentSlipOnboardingAgreementsBinding binding2 = getBinding();
        binding2.legacyContainer.setVisibility(0);
        binding2.markdownContainer.setVisibility(8);
        binding2.title.setText(state.getTitle());
        RhTextView rhTextView2 = binding2.subtitle;
        String subtitleMarkdown = state.getSubtitleMarkdown();
        rhTextView2.setText(subtitleMarkdown != null ? getMarkwon().toMarkdown(subtitleMarkdown) : null);
        binding2.cta.setText(getString(state.getCtaTextStringRes()));
        binding2.cta.setEnabled(state.isCtaEnabled());
        updateAgreementsList(state.getExpandableAgreements(), state.getSummaryTitle(), state.getSummaryItems(), state.getAdditionalCheckboxes());
        updateCrsLink(state.isAcknowledgeContentLightTextColor(), state.getAcknowledgeContent(), state.getCrsLink());
        if (state.getExpandableAgreements().isEmpty()) {
            return;
        }
        IdlingResourceCounters2.setBusy(IdlingResourceType.SLIP_ONBOARDING_AGREEMENTS_LOADING, false);
    }

    private final void updateAgreementsList(List<ExpandableAgreement> agreements, String summaryTitle, final List<? extends UIComponent<? extends GenericAction>> summaryItems, final List<String> additionalCheckboxes) {
        this.agreementLinksAdapter.submitList(agreements);
        this.agreementsAdapter.submitList(agreements);
        getBinding().summaryLinksTitle.setText(summaryTitle);
        getBinding().summaryLinksList.setContent(ComposableLambda3.composableLambdaInstance(-1798742261, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment.updateAgreementsList.1
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
                    ComposerKt.traceEventStart(-1798742261, i, -1, "com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment.updateAgreementsList.<anonymous> (SlipOnboardingAgreementsFragment.kt:229)");
                }
                Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(SlipOnboardingAgreementsFragment.this.getScarletManager());
                final List<UIComponent<GenericAction>> list = summaryItems;
                BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(-20469607, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment.updateAgreementsList.1.1
                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-20469607, i2, -1, "com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment.updateAgreementsList.<anonymous>.<anonymous> (SlipOnboardingAgreementsFragment.kt:230)");
                        }
                        ImmutableList3 persistentList = extensions2.toPersistentList(list);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        HorizontalPadding horizontalPadding = HorizontalPadding.None;
                        composer2.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierFillMaxWidth$default, null, null, horizontalPadding, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 100860288, 0);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        ComposeView additionalCheckboxesComposeView = getBinding().additionalCheckboxesComposeView;
        Intrinsics.checkNotNullExpressionValue(additionalCheckboxesComposeView, "additionalCheckboxesComposeView");
        List<String> list = additionalCheckboxes;
        additionalCheckboxesComposeView.setVisibility(list == null || list.isEmpty() ? 8 : 0);
        if (list == null || list.isEmpty()) {
            return;
        }
        getBinding().additionalCheckboxesComposeView.setContent(ComposableLambda3.composableLambdaInstance(1936273872, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment.updateAgreementsList.2
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
                    ComposerKt.traceEventStart(1936273872, i, -1, "com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment.updateAgreementsList.<anonymous> (SlipOnboardingAgreementsFragment.kt:242)");
                }
                Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(SlipOnboardingAgreementsFragment.this.getScarletManager());
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment$updateAgreementsList$2$1$1
                        @Override // io.reactivex.functions.Function
                        public final ThemesFromScarlet apply(ThemesFromScarlet it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return ThemesFromScarlet.copy$default(it, false, false, false, true, false, null, 55, null);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Observable<R> map = observableThemeChangesForCompose.map((Function) objRememberedValue);
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                BentoTheme2.BentoTheme(map, null, ComposableLambda3.rememberComposableLambda(-977575458, true, new AnonymousClass2(additionalCheckboxes, SlipOnboardingAgreementsFragment.this), composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* compiled from: SlipOnboardingAgreementsFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment$updateAgreementsList$2$2, reason: invalid class name */
            static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ List<String> $additionalCheckboxes;
                final /* synthetic */ SlipOnboardingAgreementsFragment this$0;

                AnonymousClass2(List<String> list, SlipOnboardingAgreementsFragment slipOnboardingAgreementsFragment) {
                    this.$additionalCheckboxes = list;
                    this.this$0 = slipOnboardingAgreementsFragment;
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
                        ComposerKt.traceEventStart(-977575458, i, -1, "com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment.updateAgreementsList.<anonymous>.<anonymous> (SlipOnboardingAgreementsFragment.kt:245)");
                    }
                    TextStyle textS = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS();
                    ImmutableList immutableList = extensions2.toImmutableList(this.$additionalCheckboxes);
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(this.this$0);
                    final SlipOnboardingAgreementsFragment slipOnboardingAgreementsFragment = this.this$0;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment$updateAgreementsList$2$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SlipOnboardingAgreementsFragment.C285782.AnonymousClass2.invoke$lambda$1$lambda$0(slipOnboardingAgreementsFragment, ((Boolean) obj).booleanValue());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    AgreementAdditionalCheckboxes.AgreementAdditionalCheckboxes(immutableList, null, textS, (Function1) objRememberedValue, false, composer, 0, 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(SlipOnboardingAgreementsFragment slipOnboardingAgreementsFragment, boolean z) {
                    slipOnboardingAgreementsFragment.getDuxo().onAllCheckboxesCheckedChanged(z);
                    return Unit.INSTANCE;
                }
            }
        }));
    }

    private final void updateCrsLink(boolean isAcknowledgeContentLightTextColor, String acknowledgeContent, final UiSlipAgreements.TextLink ctaText) {
        ForegroundColorSpan foregroundColorSpan;
        if (ctaText == null && acknowledgeContent == null) {
            return;
        }
        if (isAcknowledgeContentLightTextColor) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            foregroundColorSpan = new ForegroundColorSpan(ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorForeground2));
        } else {
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            foregroundColorSpan = new ForegroundColorSpan(ThemeColors.getThemeColor(contextRequireContext2, C20690R.attr.colorForeground1));
        }
        RhTextView rhTextView = getBinding().crsLink;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        if (acknowledgeContent != null) {
            spannableStringBuilder.append((CharSequence) getMarkwon().toMarkdown(acknowledgeContent));
        }
        if (ctaText != null) {
            if (ctaText.getText().length() <= 0) {
                ctaText = null;
            }
            if (ctaText != null) {
                spannableStringBuilder.append((CharSequence) "\n");
                String text = ctaText.getText();
                spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
                Spans spans = Spans.INSTANCE;
                final boolean z = true;
                ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.robinhood.android.slip.onboarding.agreements.SlipOnboardingAgreementsFragment$updateCrsLink$lambda$16$lambda$15$lambda$14$$inlined$appendClickableSpan$default$1
                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public void updateDrawState(TextPaint textPaint) {
                        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
                        textPaint.setColor(textPaint.linkColor);
                        textPaint.setUnderlineText(z);
                        if (z) {
                            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                        }
                    }

                    @Override // android.text.style.ClickableSpan
                    public void onClick(View widget) {
                        Intrinsics.checkNotNullParameter(widget, "widget");
                        Navigator navigator = this.getNavigator();
                        android.content.Context contextRequireContext3 = this.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext3, new WebDeeplinkIntentKey(ctaText.getUrl()), null, false, null, null, 60, null);
                    }
                };
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) text);
                spannableStringBuilder.setSpan(clickableSpan, length2, spannableStringBuilder.length(), 17);
            }
        }
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        rhTextView.setText(new SpannedString(spannableStringBuilder));
    }

    /* compiled from: SlipOnboardingAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsFragment$Args;", "Landroid/os/Parcelable;", "showRecommendedFlow", "", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/SLIPContext;", "accountNumber", "", "isQuickEnrollment", "<init>", "(ZLcom/robinhood/rosetta/eventlogging/SLIPContext;Ljava/lang/String;Z)V", "getShowRecommendedFlow", "()Z", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/SLIPContext;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean isQuickEnrollment;
        private final SLIPContext loggingContext;
        private final boolean showRecommendedFlow;

        /* compiled from: SlipOnboardingAgreementsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0, (SLIPContext) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, SLIPContext sLIPContext, String str, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.showRecommendedFlow;
            }
            if ((i & 2) != 0) {
                sLIPContext = args.loggingContext;
            }
            if ((i & 4) != 0) {
                str = args.accountNumber;
            }
            if ((i & 8) != 0) {
                z2 = args.isQuickEnrollment;
            }
            return args.copy(z, sLIPContext, str, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowRecommendedFlow() {
            return this.showRecommendedFlow;
        }

        /* renamed from: component2, reason: from getter */
        public final SLIPContext getLoggingContext() {
            return this.loggingContext;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsQuickEnrollment() {
            return this.isQuickEnrollment;
        }

        public final Args copy(boolean showRecommendedFlow, SLIPContext loggingContext, String accountNumber, boolean isQuickEnrollment) {
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            return new Args(showRecommendedFlow, loggingContext, accountNumber, isQuickEnrollment);
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
            return this.showRecommendedFlow == args.showRecommendedFlow && Intrinsics.areEqual(this.loggingContext, args.loggingContext) && Intrinsics.areEqual(this.accountNumber, args.accountNumber) && this.isQuickEnrollment == args.isQuickEnrollment;
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.showRecommendedFlow) * 31) + this.loggingContext.hashCode()) * 31;
            String str = this.accountNumber;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isQuickEnrollment);
        }

        public String toString() {
            return "Args(showRecommendedFlow=" + this.showRecommendedFlow + ", loggingContext=" + this.loggingContext + ", accountNumber=" + this.accountNumber + ", isQuickEnrollment=" + this.isQuickEnrollment + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showRecommendedFlow ? 1 : 0);
            dest.writeSerializable(this.loggingContext);
            dest.writeString(this.accountNumber);
            dest.writeInt(this.isQuickEnrollment ? 1 : 0);
        }

        public Args(boolean z, SLIPContext loggingContext, String str, boolean z2) {
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            this.showRecommendedFlow = z;
            this.loggingContext = loggingContext;
            this.accountNumber = str;
            this.isQuickEnrollment = z2;
        }

        public /* synthetic */ Args(boolean z, SLIPContext sLIPContext, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, sLIPContext, str, (i & 8) != 0 ? false : z2);
        }

        public final boolean getShowRecommendedFlow() {
            return this.showRecommendedFlow;
        }

        public final SLIPContext getLoggingContext() {
            return this.loggingContext;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final boolean isQuickEnrollment() {
            return this.isQuickEnrollment;
        }
    }

    /* compiled from: SlipOnboardingAgreementsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsFragment;", "Lcom/robinhood/android/slip/onboarding/agreements/SlipOnboardingAgreementsFragment$Args;", "<init>", "()V", "SCROLL_DIRECTION_DOWN", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SlipOnboardingAgreementsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SlipOnboardingAgreementsFragment slipOnboardingAgreementsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, slipOnboardingAgreementsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SlipOnboardingAgreementsFragment newInstance(Args args) {
            return (SlipOnboardingAgreementsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SlipOnboardingAgreementsFragment slipOnboardingAgreementsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, slipOnboardingAgreementsFragment, args);
        }
    }
}
