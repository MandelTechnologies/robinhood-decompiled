package com.robinhood.android.cash.rewards.p074ui.notification;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.databinding.FragmentRewardsNotificationDetailsBinding;
import com.robinhood.android.cash.rewards.logging.RoundupRewardsLoggingUtil;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RewardsNotificationDetailsFragment.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u0002:\u000278B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u001a\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020#H\u0016J\b\u0010,\u001a\u00020#H\u0016J\u0010\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020/H\u0002J\t\u00100\u001a\u000201H\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bj\u0002`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u00102\u001a\b\u0012\u0004\u0012\u00020403X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "duxo", "Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsNotificationDetailsBinding;", "getBinding", "()Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsNotificationDetailsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "getHistoryNavigator", "()Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "setHistoryNavigator", "(Lcom/robinhood/shared/history/navigation/HistoryNavigator;)V", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "bindState", "state", "Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsViewState;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RewardsNotificationDetailsFragment extends BaseFragment implements RegionGated {
    private static final long CARD_CONTENT_ANIMATION_DURATION = 1000;
    private static final long CARD_CONTENT_ANIMATION_START_DELAY = 833;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    public HistoryNavigator historyNavigator;
    private final Context loggingContext;
    private final Screen loggingScreen;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RewardsNotificationDetailsFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/rewards/databinding/FragmentRewardsNotificationDetailsBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public RewardsNotificationDetailsFragment() {
        super(C10176R.layout.fragment_rewards_notification_details);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.loggingScreen = new Screen(Screen.Name.ROUNDUP_END_OF_WEEK, null, null, null, 14, null);
        this.loggingContext = RoundupRewardsLoggingUtil.INSTANCE.getRoundupGeneralContext();
        this.duxo = OldDuxos.oldDuxo(this, RewardsNotificationDetailsDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, RewardsNotificationDetailsFragment2.INSTANCE);
    }

    private final RewardsNotificationDetailsDuxo getDuxo() {
        return (RewardsNotificationDetailsDuxo) this.duxo.getValue();
    }

    private final FragmentRewardsNotificationDetailsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentRewardsNotificationDetailsBinding) value;
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

    public final HistoryNavigator getHistoryNavigator() {
        HistoryNavigator historyNavigator = this.historyNavigator;
        if (historyNavigator != null) {
            return historyNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("historyNavigator");
        return null;
    }

    public final void setHistoryNavigator(HistoryNavigator historyNavigator) {
        Intrinsics.checkNotNullParameter(historyNavigator, "<set-?>");
        this.historyNavigator = historyNavigator;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LottieUrl.ROUNDUP_REWARDS_WEEKLY_DETAIL.prefetch(context);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        requireBaseActivity().showCloseIcon();
        LottieAnimationView rewardsNotificationDetailsAnimation = getBinding().rewardsNotificationDetailsAnimation;
        Intrinsics.checkNotNullExpressionValue(rewardsNotificationDetailsAnimation, "rewardsNotificationDetailsAnimation");
        LottieAnimationViewsKt.setRemoteUrl(rewardsNotificationDetailsAnimation, LottieUrl.ROUNDUP_REWARDS_WEEKLY_DETAIL);
        RdsButton rewardsNotificationDetailsDismissButton = getBinding().rewardsNotificationDetailsDismissButton;
        Intrinsics.checkNotNullExpressionValue(rewardsNotificationDetailsDismissButton, "rewardsNotificationDetailsDismissButton");
        OnClickListeners.onClick(rewardsNotificationDetailsDismissButton, new Function0() { // from class: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationDetailsFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsNotificationDetailsFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsButton rewardsNotificationDetailsSeeOrderButton = getBinding().rewardsNotificationDetailsSeeOrderButton;
        Intrinsics.checkNotNullExpressionValue(rewardsNotificationDetailsSeeOrderButton, "rewardsNotificationDetailsSeeOrderButton");
        OnClickListeners.onClick(rewardsNotificationDetailsSeeOrderButton, new Function0() { // from class: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationDetailsFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardsNotificationDetailsFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C101853(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(RewardsNotificationDetailsFragment rewardsNotificationDetailsFragment) {
        rewardsNotificationDetailsFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(RewardsNotificationDetailsFragment rewardsNotificationDetailsFragment) {
        Navigator navigator = rewardsNotificationDetailsFragment.getNavigator();
        android.content.Context contextRequireContext = rewardsNotificationDetailsFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, HistoryNavigator.resolve$default(rewardsNotificationDetailsFragment.getHistoryNavigator(), new TransactionReference(((Args) INSTANCE.getArgs((Fragment) rewardsNotificationDetailsFragment)).getRoundupId(), HistoryTransactionType.ROUNDUP_REWARD, null, null, false, 28, null), false, false, 6, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
        return Unit.INSTANCE;
    }

    /* compiled from: RewardsNotificationDetailsFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationDetailsFragment$onViewCreated$3 */
    /* synthetic */ class C101853 extends FunctionReferenceImpl implements Function1<RewardsNotificationDetailsViewState, Unit> {
        C101853(Object obj) {
            super(1, obj, RewardsNotificationDetailsFragment.class, "bindState", "bindState(Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RewardsNotificationDetailsViewState rewardsNotificationDetailsViewState) throws Resources.NotFoundException {
            invoke2(rewardsNotificationDetailsViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(RewardsNotificationDetailsViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RewardsNotificationDetailsFragment) this.receiver).bindState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        final List listListOf = CollectionsKt.listOf((Object[]) new View[]{getBinding().rewardsNotificationDetailsIcon, getBinding().rewardsNotificationDetailsCongrats, getBinding().rewardsNotificationDetailsBonusRate, getBinding().rewardsNotificationDetailsRoundup, getBinding().rewardsNotificationDetailsRoundupAmount, getBinding().rewardsNotificationDetailsBonus, getBinding().rewardsNotificationDetailsBonusAmount, getBinding().rewardsNotificationDetailsDivider, getBinding().rewardsNotificationDetailsTotal, getBinding().rewardsNotificationDetailsTotalAmount, getBinding().rewardsNotificationDetailsDisclaimer});
        List<View> list = listListOf;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (View view : list) {
            Intrinsics.checkNotNull(view);
            view.setVisibility(8);
            arrayList.add(Unit.INSTANCE);
        }
        getBinding().rewardsNotificationDetailsAnimation.playAnimation();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setStartDelay(CARD_CONTENT_ANIMATION_START_DELAY);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationDetailsFragment$onStart$2$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                List<View> list2 = listListOf;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (View view2 : list2) {
                    Object animatedValue = animator.getAnimatedValue();
                    Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    view2.setAlpha(((Float) animatedValue).floatValue());
                    arrayList2.add(Unit.INSTANCE);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.cash.rewards.ui.notification.RewardsNotificationDetailsFragment$onStart$2$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                super.onAnimationStart(animation);
                List<View> list2 = listListOf;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (View view2 : list2) {
                    view2.setAlpha(0.0f);
                    Intrinsics.checkNotNull(view2);
                    view2.setVisibility(0);
                    arrayList2.add(Unit.INSTANCE);
                }
            }
        });
        valueAnimatorOfFloat.start();
        EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, this.loggingScreen, null, null, this.loggingContext, 13, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logScreenDisappear$default(getEventLogger(), null, this.loggingScreen, null, null, this.loggingContext, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindState(RewardsNotificationDetailsViewState state) throws Resources.NotFoundException {
        CharSequence text;
        RhTextView rhTextView = getBinding().rewardsNotificationDetailsBonusRate;
        StringResource bonusRateMessage = state.getBonusRateMessage();
        CharSequence text2 = null;
        if (bonusRateMessage != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = bonusRateMessage.getText(resources);
        } else {
            text = null;
        }
        rhTextView.setText(text);
        getBinding().rewardsNotificationDetailsRoundupAmount.setText(state.getRoundupAmount());
        getBinding().rewardsNotificationDetailsBonusAmount.setText(state.getBonusAmount());
        RhTextView rhTextView2 = getBinding().rewardsNotificationDetailsTotal;
        StringResource totalRoundupMessage = state.getTotalRoundupMessage();
        if (totalRoundupMessage != null) {
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text2 = totalRoundupMessage.getText(resources2);
        }
        rhTextView2.setText(text2);
        getBinding().rewardsNotificationDetailsTotalAmount.setText(state.getTotalRoundupAmount());
        Integer disclaimerStringRes = state.getDisclaimerStringRes();
        if (disclaimerStringRes != null) {
            getBinding().rewardsNotificationDetailsDisclaimer.setText(getString(disclaimerStringRes.intValue()));
        }
    }

    /* compiled from: RewardsNotificationDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsFragment$Args;", "Landroid/os/Parcelable;", "roundupId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getRoundupId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID roundupId;

        /* compiled from: RewardsNotificationDetailsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.roundupId;
            }
            return args.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getRoundupId() {
            return this.roundupId;
        }

        public final Args copy(UUID roundupId) {
            Intrinsics.checkNotNullParameter(roundupId, "roundupId");
            return new Args(roundupId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.roundupId, ((Args) other).roundupId);
        }

        public int hashCode() {
            return this.roundupId.hashCode();
        }

        public String toString() {
            return "Args(roundupId=" + this.roundupId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.roundupId);
        }

        public Args(UUID roundupId) {
            Intrinsics.checkNotNullParameter(roundupId, "roundupId");
            this.roundupId = roundupId;
        }

        public final UUID getRoundupId() {
            return this.roundupId;
        }
    }

    /* compiled from: RewardsNotificationDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsFragment;", "Lcom/robinhood/android/cash/rewards/ui/notification/RewardsNotificationDetailsFragment$Args;", "<init>", "()V", "CARD_CONTENT_ANIMATION_START_DELAY", "", "CARD_CONTENT_ANIMATION_DURATION", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RewardsNotificationDetailsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RewardsNotificationDetailsFragment rewardsNotificationDetailsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rewardsNotificationDetailsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RewardsNotificationDetailsFragment newInstance(Args args) {
            return (RewardsNotificationDetailsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RewardsNotificationDetailsFragment rewardsNotificationDetailsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rewardsNotificationDetailsFragment, args);
        }
    }
}
