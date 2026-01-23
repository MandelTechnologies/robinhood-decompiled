package com.robinhood.android.referral.rewardoffers.offersList;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.referral.rewardoffers.ExtensionsKt;
import com.robinhood.android.referral.rewardoffers.offersList.RewardOfferViewType;
import com.robinhood.android.referral.rewardoffers.offersList.RewardOffersFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferAction;
import com.robinhood.models.api.rewardoffer.ApiRewardOfferButtonAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
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
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RewardOffersFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0003\u001f !B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\r\u0010\u0019\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "callbacks", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "logCardAppearEvents", "items", "", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType$Standard;", "Callbacks", "Args", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RewardOffersFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public AnalyticsLogger analytics;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RewardOffersFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final Screen eventScreen = new Screen(Screen.Name.REWARD_OFFERS_LIST, null, null, null, 14, null);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof RewardOffersFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: RewardOffersFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersFragment$Callbacks;", "", "onRewardOfferTapActionTriggered", "", "rewardOfferAction", "Lcom/robinhood/models/api/rewardoffer/ApiRewardOfferAction;", "initialSource", "", "onRewardOfferButtonActionTriggered", "onRewardOfferUpdateAppButtonTriggered", "onPastReferralsClicked", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPastReferralsClicked();

        void onRewardOfferButtonActionTriggered(ApiRewardOfferAction rewardOfferAction, String initialSource);

        void onRewardOfferTapActionTriggered(ApiRewardOfferAction rewardOfferAction, String initialSource);

        void onRewardOfferUpdateAppButtonTriggered();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$10(RewardOffersFragment rewardOffersFragment, int i, Composer composer, int i2) {
        rewardOffersFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(109336111);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i : i;
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(109336111, i2, -1, "com.robinhood.android.referral.rewardoffers.offersList.RewardOffersFragment.ComposeContent (RewardOffersFragment.kt:42)");
            }
            List<RewardOfferViewType> rewardOffers = ((Args) INSTANCE.getArgs((Fragment) this)).getRewardOffers();
            ArrayList arrayList = new ArrayList();
            for (Object obj : rewardOffers) {
                if (obj instanceof RewardOfferViewType.Standard) {
                    arrayList.add(obj);
                }
            }
            logCardAppearEvents(arrayList);
            ImmutableList immutableList = extensions2.toImmutableList(arrayList);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RewardOffersFragment.ComposeContent$lambda$1$lambda$0(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RewardOffersFragment.ComposeContent$lambda$3$lambda$2(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RewardOffersFragment.ComposeContent$lambda$6$lambda$5(this.f$0, (RewardOfferViewType.Standard) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function1 function1 = (Function1) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return RewardOffersFragment.ComposeContent$lambda$9$lambda$8(this.f$0, (RewardOfferViewType.Standard) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            RewardOffersListComposable3.RewardOffersListComposable(immutableList, function0, function02, function1, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.offersList.RewardOffersFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return RewardOffersFragment.ComposeContent$lambda$10(this.f$0, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1$lambda$0(RewardOffersFragment rewardOffersFragment) {
        FragmentActivity activity = rewardOffersFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(RewardOffersFragment rewardOffersFragment) {
        rewardOffersFragment.getCallbacks().onPastReferralsClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6$lambda$5(RewardOffersFragment rewardOffersFragment, RewardOfferViewType.Standard viewType) {
        ApiRewardOfferAction action;
        ApiRewardOfferAction.Type type2;
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        ApiRewardOfferButtonAction primary_button = viewType.getData().getPrimary_button();
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(rewardOffersFragment.getAnalytics(), rewardOffersFragment.getScreenName() + "-" + ((primary_button == null || (action = primary_button.getAction()) == null || (type2 = action.getType()) == null) ? null : type2.getServerValue()), "offer_id:" + viewType.getId(), primary_button != null ? primary_button.getDisplay_text() : null, null, null, ExtensionsKt.getEntityType(viewType), null, null, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, null);
        if (primary_button != null) {
            rewardOffersFragment.getCallbacks().onRewardOfferButtonActionTriggered(primary_button.getAction(), ((Args) INSTANCE.getArgs((Fragment) rewardOffersFragment)).getInitialSource());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$9$lambda$8(RewardOffersFragment rewardOffersFragment, RewardOfferViewType.Standard viewType) {
        ApiRewardOfferAction.Type type2;
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        ApiRewardOfferAction tap_action = viewType.getData().getTap_action();
        AnalyticsLogger analytics = rewardOffersFragment.getAnalytics();
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analytics, rewardOffersFragment.getScreenName() + "-" + ((tap_action == null || (type2 = tap_action.getType()) == null) ? null : type2.getServerValue()), "offer_id:" + viewType.getId(), null, null, null, ExtensionsKt.getEntityType(viewType), null, null, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, null);
        if (tap_action != null) {
            rewardOffersFragment.getCallbacks().onRewardOfferTapActionTriggered(tap_action, ((Args) INSTANCE.getArgs((Fragment) rewardOffersFragment)).getInitialSource());
        }
        return Unit.INSTANCE;
    }

    private final void logCardAppearEvents(List<RewardOfferViewType.Standard> items) {
        for (RewardOfferViewType.Standard standard : items) {
            ApiRewardOfferButtonAction primary_button = standard.getData().getPrimary_button();
            if (primary_button != null) {
                AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(getAnalytics(), getScreenName() + "-" + primary_button.getAction().getType().getServerValue(), "offer_id:" + standard.getId(), primary_button.getDisplay_text(), null, null, ExtensionsKt.getEntityType(standard), null, null, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, null);
            }
        }
    }

    /* compiled from: RewardOffersFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersFragment$Args;", "Landroid/os/Parcelable;", "rewardOffers", "", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOfferViewType;", "initialSource", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getRewardOffers", "()Ljava/util/List;", "getInitialSource", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String initialSource;
        private final List<RewardOfferViewType> rewardOffers;

        /* compiled from: RewardOffersFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = args.rewardOffers;
            }
            if ((i & 2) != 0) {
                str = args.initialSource;
            }
            return args.copy(list, str);
        }

        public final List<RewardOfferViewType> component1() {
            return this.rewardOffers;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInitialSource() {
            return this.initialSource;
        }

        public final Args copy(List<? extends RewardOfferViewType> rewardOffers, String initialSource) {
            Intrinsics.checkNotNullParameter(rewardOffers, "rewardOffers");
            return new Args(rewardOffers, initialSource);
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
            return Intrinsics.areEqual(this.rewardOffers, args.rewardOffers) && Intrinsics.areEqual(this.initialSource, args.initialSource);
        }

        public int hashCode() {
            int iHashCode = this.rewardOffers.hashCode() * 31;
            String str = this.initialSource;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Args(rewardOffers=" + this.rewardOffers + ", initialSource=" + this.initialSource + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<RewardOfferViewType> list = this.rewardOffers;
            dest.writeInt(list.size());
            Iterator<RewardOfferViewType> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.initialSource);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(List<? extends RewardOfferViewType> rewardOffers, String str) {
            Intrinsics.checkNotNullParameter(rewardOffers, "rewardOffers");
            this.rewardOffers = rewardOffers;
            this.initialSource = str;
        }

        public final List<RewardOfferViewType> getRewardOffers() {
            return this.rewardOffers;
        }

        public final String getInitialSource() {
            return this.initialSource;
        }
    }

    /* compiled from: RewardOffersFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersFragment;", "Lcom/robinhood/android/referral/rewardoffers/offersList/RewardOffersFragment$Args;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RewardOffersFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RewardOffersFragment rewardOffersFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rewardOffersFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RewardOffersFragment newInstance(Args args) {
            return (RewardOffersFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RewardOffersFragment rewardOffersFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rewardOffersFragment, args);
        }
    }
}
