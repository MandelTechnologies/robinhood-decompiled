package com.robinhood.android.history.p153ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.funding.logging.AchTransfers2;
import com.robinhood.android.history.C18359R;
import com.robinhood.android.history.databinding.FragmentAchTransferDetailBinding;
import com.robinhood.android.history.p153ui.RhyAchTransferDetailFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Money;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.extensions.Format2;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.transfers.api.ApiManagedAccountTransferDetails;
import com.robinhood.transfers.gold.GoldDepositBoostTransferDetail;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.noties.markwon.Markwon;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import me.saket.bettermovementmethod.BetterLinkMovementMethod;

/* compiled from: AchTransferDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 72\u00020\u0001:\u000267B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020'H\u0016J\u0016\u0010-\u001a\u00020'*\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u001b\u00101\u001a\u00020'2\f\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0003¢\u0006\u0002\u00105R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00068"}, m3636d2 = {"Lcom/robinhood/android/history/ui/AchTransferDetailFragment;", "Lcom/robinhood/android/history/ui/BaseDetailFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/history/databinding/FragmentAchTransferDetailBinding;", "getBinding", "()Lcom/robinhood/android/history/databinding/FragmentAchTransferDetailBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/history/ui/AchTransferDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/history/ui/AchTransferDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "achTransfer", "Lcom/robinhood/transfers/models/db/AchTransfer;", "hasBottomBar", "", "getHasBottomBar", "()Z", "revealTransitionName", "", "getRevealTransitionName", "()Ljava/lang/String;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setup", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "money", "Lcom/robinhood/models/serverdriven/experimental/api/Money;", "GracePeriodContent", "sduiComponent", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AchTransferDetailFragment extends BaseDetailFragment {
    private AchTransfer achTransfer;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final boolean hasBottomBar;
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AchTransferDetailFragment.class, "binding", "getBinding()Lcom/robinhood/android/history/databinding/FragmentAchTransferDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GracePeriodContent$lambda$16(AchTransferDetailFragment achTransferDetailFragment, UIComponent uIComponent, int i, Composer composer, int i2) {
        achTransferDetailFragment.GracePeriodContent(uIComponent, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public AchTransferDetailFragment() {
        super(C18359R.layout.fragment_ach_transfer_detail);
        this.binding = ViewBinding5.viewBinding(this, AchTransferDetailFragment3.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, AchTransferDetailDuxo.class);
        this.hasBottomBar = true;
    }

    private final FragmentAchTransferDetailBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAchTransferDetailBinding) value;
    }

    private final AchTransferDetailDuxo getDuxo() {
        return (AchTransferDetailDuxo) this.duxo.getValue();
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment
    public String getRevealTransitionName() {
        String string2 = ((Args) INSTANCE.getArgs((Fragment) this)).getTransferId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentAchTransferDetailBinding binding = getBinding();
        getExpandedToolbarSubtitleTxt().setVisibility(0);
        RhTextView rhTextView = binding.additionalInfoText;
        BetterLinkMovementMethod betterLinkMovementMethodNewInstance = BetterLinkMovementMethod.newInstance();
        betterLinkMovementMethodNewInstance.setOnLinkClickListener(new BetterLinkMovementMethod.OnLinkClickListener() { // from class: com.robinhood.android.history.ui.AchTransferDetailFragment$onViewCreated$1$1$1
            @Override // me.saket.bettermovementmethod.BetterLinkMovementMethod.OnLinkClickListener
            public final boolean onClick(TextView textView, String str) {
                AchTransfer achTransfer = this.this$0.achTransfer;
                if (achTransfer != null) {
                    EventLogger.DefaultImpls.logTap$default(this.this$0.getEventLogger(), UserInteractionEventData.Action.VIEW_PROCESSING_TIMES, new Screen(Screen.Name.TRANSFER_DETAILS, null, null, null, 14, null), new Component(Component.ComponentType.LINK_BUTTON, null, null, 6, null), null, AchTransfers2.toFundingEventContext(achTransfer), false, 40, null);
                }
                Navigator navigator = this.this$0.getNavigator();
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Intrinsics.checkNotNull(str);
                Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, str);
                return true;
            }
        });
        rhTextView.setMovementMethod(betterLinkMovementMethodNewInstance);
        RdsButton cancelButton = binding.cancelButton;
        Intrinsics.checkNotNullExpressionValue(cancelButton, "cancelButton");
        OnClickListeners.onClick(cancelButton, new Function0() { // from class: com.robinhood.android.history.ui.AchTransferDetailFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AchTransferDetailFragment.onViewCreated$lambda$3$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(final AchTransferDetailFragment achTransferDetailFragment) {
        achTransferDetailFragment.getDuxo().cancelTransfer(new Function1() { // from class: com.robinhood.android.history.ui.AchTransferDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferDetailFragment.onViewCreated$lambda$3$lambda$2$lambda$1(this.f$0, (AchTransfer) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2$lambda$1(AchTransferDetailFragment achTransferDetailFragment, AchTransfer achTransfer) {
        Intrinsics.checkNotNullParameter(achTransfer, "achTransfer");
        EventLogger.DefaultImpls.logTap$default(achTransferDetailFragment.getEventLogger(), UserInteractionEventData.Action.CANCEL_TRANSFER, new Screen(Screen.Name.TRANSFER_DETAILS, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, AchTransfers2.toFundingEventContext(achTransfer), false, 40, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.history.p153ui.BaseDetailFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.history.ui.AchTransferDetailFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchTransferDetailFragment.onResume$lambda$15(this.f$0, (AchTransferDetailViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15(final AchTransferDetailFragment achTransferDetailFragment, final AchTransferDetailViewState state) throws Resources.NotFoundException {
        CharSequence text;
        CharSequence text2;
        CharSequence text3;
        Drawable drawable;
        Drawable drawable2;
        Either<Unit, Throwable> eitherConsume;
        String detailText;
        UUID uuidConsume;
        Intrinsics.checkNotNullParameter(state, "state");
        UiEvent<UUID> managedByPaymentHubEvent = state.getManagedByPaymentHubEvent();
        if (managedByPaymentHubEvent != null && (uuidConsume = managedByPaymentHubEvent.consume()) != null) {
            achTransferDetailFragment.setFragment(C18359R.id.fragment_container, RhyAchTransferDetailFragment.INSTANCE.newInstance((Parcelable) new RhyAchTransferDetailFragment.Args(uuidConsume)));
        }
        achTransferDetailFragment.achTransfer = state.getAchTransfer();
        FragmentAchTransferDetailBinding binding = achTransferDetailFragment.getBinding();
        if (state.getShowLoadingView()) {
            binding.loadingView.show();
        } else {
            binding.loadingView.hide();
        }
        achTransferDetailFragment.getExpandedToolbarSubtitleTxt().setAccessibilityTraversalBefore(binding.statusSection.getId());
        achTransferDetailFragment.getExpandedToolbarTitleTxt().setAccessibilityTraversalBefore(achTransferDetailFragment.getExpandedToolbarSubtitleTxt().getId());
        achTransferDetailFragment.getExpandedToolbarTitleTxt().setText(state.getExpandedToolbarTitleText());
        TextView expandedToolbarSubtitleTxt = achTransferDetailFragment.getExpandedToolbarSubtitleTxt();
        StringResource expandedToolbarSubtitleText = state.getExpandedToolbarSubtitleText();
        if (expandedToolbarSubtitleText != null) {
            Resources resources = achTransferDetailFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = expandedToolbarSubtitleText.getText(resources);
        } else {
            text = null;
        }
        expandedToolbarSubtitleTxt.setText(text);
        RdsDataRowView rdsDataRowView = binding.sourceAccountRow;
        StringResource sourceAccountText = state.getSourceAccountText();
        if (sourceAccountText != null) {
            Resources resources2 = achTransferDetailFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text2 = sourceAccountText.getText(resources2);
        } else {
            text2 = null;
        }
        rdsDataRowView.setValueText(text2);
        RdsDataRowView rdsDataRowView2 = binding.destAccountRow;
        StringResource destAccountText = state.getDestAccountText();
        if (destAccountText != null) {
            Resources resources3 = achTransferDetailFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            text3 = destAccountText.getText(resources3);
        } else {
            text3 = null;
        }
        rdsDataRowView2.setValueText(text3);
        RdsDataRowView rdsDataRowView3 = binding.statusSection;
        Integer statusRes = state.getStatusRes();
        rdsDataRowView3.setValueText(statusRes != null ? achTransferDetailFragment.getResources().getString(statusRes.intValue()) : null);
        RdsDataRowView rdsDataRowView4 = binding.availableNowSection;
        StringResource availableNowSectionLabelText = state.getAvailableNowSectionLabelText();
        Resources resources4 = achTransferDetailFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        rdsDataRowView4.setLabelText(availableNowSectionLabelText.getText(resources4));
        binding.availableNowSection.setVisibilityValueText(state.getAvailableNowSectionVisibilityValueText());
        binding.initiatedSection.setValueText(state.getInitiatedSectionValueText());
        binding.lastUpdatedSection.setValueText(state.getLastUpdatedSectionValueText());
        binding.bonusRemovedSection.setVisibilityValueText(state.getBonusRemovalValueText());
        RhTextView bonusRemovedExplanation = binding.bonusRemovedExplanation;
        Intrinsics.checkNotNullExpressionValue(bonusRemovedExplanation, "bonusRemovedExplanation");
        String bonusRemovalExplanationText = state.getBonusRemovalExplanationText();
        TextViewsKt.setVisibilityText(bonusRemovedExplanation, bonusRemovalExplanationText != null ? achTransferDetailFragment.getMarkwon().toMarkdown(bonusRemovalExplanationText) : null);
        binding.estAvailabilitySection.setVisibilityValueText(state.getEstAvailabilitySectionVisibilityValueText());
        RhTextView errorSection = binding.errorSection;
        Intrinsics.checkNotNullExpressionValue(errorSection, "errorSection");
        Integer errorSectionVisibilityTextRes = state.getErrorSectionVisibilityTextRes();
        TextViewsKt.setVisibilityText(errorSection, errorSectionVisibilityTextRes != null ? achTransferDetailFragment.getString(errorSectionVisibilityTextRes.intValue()) : null);
        RhTextView additionalInfoText = binding.additionalInfoText;
        Intrinsics.checkNotNullExpressionValue(additionalInfoText, "additionalInfoText");
        Resources resources5 = achTransferDetailFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
        TextViewsKt.setVisibilityText(additionalInfoText, state.getTransferAdditionalInfoString(resources5));
        RdsButton cancelButton = binding.cancelButton;
        Intrinsics.checkNotNullExpressionValue(cancelButton, "cancelButton");
        cancelButton.setVisibility(state.getIsCancelButtonVisible() ? 0 : 8);
        LinearLayout stickyFooterContent = binding.stickyFooterContent;
        Intrinsics.checkNotNullExpressionValue(stickyFooterContent, "stickyFooterContent");
        stickyFooterContent.setVisibility(state.getIsAnyFooterContentVisible() ? 0 : 8);
        RdsInfoBannerView statusInfoBanner = binding.statusInfoBanner;
        Intrinsics.checkNotNullExpressionValue(statusInfoBanner, "statusInfoBanner");
        statusInfoBanner.setVisibility(state.getShowStatusInfoBanner() ? 0 : 8);
        RdsInfoBannerView rdsInfoBannerView = binding.statusInfoBanner;
        Integer infoBannerTextRes = state.getInfoBannerTextRes();
        rdsInfoBannerView.setText(infoBannerTextRes != null ? achTransferDetailFragment.getResources().getString(infoBannerTextRes.intValue()) : null);
        RdsInfoBannerView rdsInfoBannerView2 = binding.statusInfoBanner;
        Integer infoBannerIconRes = state.getInfoBannerIconRes();
        if (infoBannerIconRes != null) {
            RdsInfoBannerView statusInfoBanner2 = binding.statusInfoBanner;
            Intrinsics.checkNotNullExpressionValue(statusInfoBanner2, "statusInfoBanner");
            drawable = ViewsKt.getDrawable(statusInfoBanner2, infoBannerIconRes.intValue());
        } else {
            drawable = null;
        }
        rdsInfoBannerView2.setIcon(drawable);
        RdsDataRowView rdsDataRowView5 = binding.goldDepositBoostSection;
        Integer goldDepositBoostIconRes = state.getGoldDepositBoostIconRes();
        if (goldDepositBoostIconRes != null) {
            Intrinsics.checkNotNull(rdsDataRowView5);
            drawable2 = ViewsKt.getDrawable(rdsDataRowView5, goldDepositBoostIconRes.intValue());
        } else {
            drawable2 = null;
        }
        rdsDataRowView5.setValueIconRightDrawable(drawable2);
        GoldDepositBoostTransferDetail goldDepositBoost = state.getGoldDepositBoost();
        rdsDataRowView5.setLabelText(goldDepositBoost != null ? goldDepositBoost.getAmountTitle() : null);
        GoldDepositBoostTransferDetail goldDepositBoost2 = state.getGoldDepositBoost();
        rdsDataRowView5.setValueText(goldDepositBoost2 != null ? goldDepositBoost2.getAmountText() : null);
        GoldDepositBoostTransferDetail goldDepositBoost3 = state.getGoldDepositBoost();
        if (goldDepositBoost3 != null && (detailText = goldDepositBoost3.getDetailText()) != null) {
            rdsDataRowView5.setDescriptionText(achTransferDetailFragment.getMarkwon().toMarkdown(detailText));
        }
        Intrinsics.checkNotNull(rdsDataRowView5);
        rdsDataRowView5.setVisibility(state.getIsGoldDepositBoostSectionVisible() ? 0 : 8);
        if (state.getTransferRequiresConfirmation()) {
            RdsInfoBannerView statusInfoBanner3 = binding.statusInfoBanner;
            Intrinsics.checkNotNullExpressionValue(statusInfoBanner3, "statusInfoBanner");
            OnClickListeners.onClick(statusInfoBanner3, new Function0() { // from class: com.robinhood.android.history.ui.AchTransferDetailFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AchTransferDetailFragment.onResume$lambda$15$lambda$14$lambda$12(this.f$0);
                }
            });
        } else {
            RdsInfoBannerView statusInfoBanner4 = binding.statusInfoBanner;
            Intrinsics.checkNotNullExpressionValue(statusInfoBanner4, "statusInfoBanner");
            OnClickListeners.onClick(statusInfoBanner4, null);
        }
        UiEvent<Either<Unit, Throwable>> cancelTransferResponse = state.getCancelTransferResponse();
        if (cancelTransferResponse != null && (eitherConsume = cancelTransferResponse.consume()) != null) {
            if (eitherConsume instanceof Either.Left) {
                RdsButton cancelButton2 = binding.cancelButton;
                Intrinsics.checkNotNullExpressionValue(cancelButton2, "cancelButton");
                Snackbars.make(cancelButton2, C18359R.string.ach_transfer_detail_canceled_confirmation, 0).show();
            } else {
                if (!(eitherConsume instanceof Either.Right)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbsErrorHandler.handleError$default(achTransferDetailFragment.getActivityErrorHandler(), (Throwable) ((Either.Right) eitherConsume).getValue(), false, 2, null);
            }
        }
        RdsDataRowView requestedAmountRow = achTransferDetailFragment.getBinding().requestedAmountRow;
        Intrinsics.checkNotNullExpressionValue(requestedAmountRow, "requestedAmountRow");
        ApiManagedAccountTransferDetails managedAccountTransferDetails = state.getManagedAccountTransferDetails();
        achTransferDetailFragment.setup(requestedAmountRow, managedAccountTransferDetails != null ? managedAccountTransferDetails.getRequested_amount() : null);
        RdsDataRowView proceedsFromSale = achTransferDetailFragment.getBinding().proceedsFromSale;
        Intrinsics.checkNotNullExpressionValue(proceedsFromSale, "proceedsFromSale");
        ApiManagedAccountTransferDetails managedAccountTransferDetails2 = state.getManagedAccountTransferDetails();
        achTransferDetailFragment.setup(proceedsFromSale, managedAccountTransferDetails2 != null ? managedAccountTransferDetails2.getProceeds_from_asset_sale() : null);
        RdsDataRowView finalManagementFee = achTransferDetailFragment.getBinding().finalManagementFee;
        Intrinsics.checkNotNullExpressionValue(finalManagementFee, "finalManagementFee");
        ApiManagedAccountTransferDetails managedAccountTransferDetails3 = state.getManagedAccountTransferDetails();
        achTransferDetailFragment.setup(finalManagementFee, managedAccountTransferDetails3 != null ? managedAccountTransferDetails3.getFinal_management_fee() : null);
        achTransferDetailFragment.getBinding().gracePeriodDetails.setVisibility(8);
        achTransferDetailFragment.getBinding().gracePeriodCta.setVisibility(8);
        achTransferDetailFragment.getBinding().gracePeriodBanner.setVisibility(8);
        if (state.getGracePeriodContent() != null) {
            achTransferDetailFragment.getBinding().gracePeriodDetails.setVisibility(0);
            achTransferDetailFragment.getBinding().gracePeriodDetails.setContent(ComposableLambda3.composableLambdaInstance(-402989546, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.AchTransferDetailFragment$onResume$1$3
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
                        ComposerKt.traceEventStart(-402989546, i, -1, "com.robinhood.android.history.ui.AchTransferDetailFragment.onResume.<anonymous>.<anonymous> (AchTransferDetailFragment.kt:198)");
                    }
                    this.this$0.GracePeriodContent(state.getGracePeriodContent().getDetails_sdui(), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            achTransferDetailFragment.getBinding().gracePeriodBanner.setVisibility(0);
            achTransferDetailFragment.getBinding().gracePeriodBanner.setContent(ComposableLambda3.composableLambdaInstance(712447359, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.AchTransferDetailFragment$onResume$1$4
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
                        ComposerKt.traceEventStart(712447359, i, -1, "com.robinhood.android.history.ui.AchTransferDetailFragment.onResume.<anonymous>.<anonymous> (AchTransferDetailFragment.kt:203)");
                    }
                    this.this$0.GracePeriodContent(state.getGracePeriodContent().getBanner_sdui(), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            final UIComponent<GenericAction> cta = state.getGracePeriodContent().getCta();
            if (!state.getIsCancelButtonVisible() && cta != null) {
                achTransferDetailFragment.getBinding().gracePeriodCta.setVisibility(0);
                achTransferDetailFragment.getBinding().gracePeriodCta.setContent(ComposableLambda3.composableLambdaInstance(326010587, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.AchTransferDetailFragment$onResume$1$5
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
                            ComposerKt.traceEventStart(326010587, i, -1, "com.robinhood.android.history.ui.AchTransferDetailFragment.onResume.<anonymous>.<anonymous> (AchTransferDetailFragment.kt:210)");
                        }
                        this.this$0.GracePeriodContent(cta, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$15$lambda$14$lambda$12(AchTransferDetailFragment achTransferDetailFragment) {
        Navigator navigator = achTransferDetailFragment.getNavigator();
        Context contextRequireContext = achTransferDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.ConfirmTransfer(((Args) INSTANCE.getArgs((Fragment) achTransferDetailFragment)).getTransferId()), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    private final void setup(RdsDataRowView rdsDataRowView, Money money) {
        rdsDataRowView.setVisibility(8);
        if (money != null) {
            rdsDataRowView.setVisibility(0);
            rdsDataRowView.setValueText(Format2.format(money));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void GracePeriodContent(final UIComponent<? extends GenericAction> uIComponent, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(929345549);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(uIComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(929345549, i2, -1, "com.robinhood.android.history.ui.AchTransferDetailFragment.GracePeriodContent (AchTransferDetailFragment.kt:228)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1128654677, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.AchTransferDetailFragment.GracePeriodContent.1
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
                        ComposerKt.traceEventStart(1128654677, i3, -1, "com.robinhood.android.history.ui.AchTransferDetailFragment.GracePeriodContent.<anonymous> (AchTransferDetailFragment.kt:230)");
                    }
                    final AchTransferDetailFragment achTransferDetailFragment = AchTransferDetailFragment.this;
                    final UIComponent<GenericAction> uIComponent2 = uIComponent;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-305115414, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.AchTransferDetailFragment.GracePeriodContent.1.1
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
                                ComposerKt.traceEventStart(-305115414, i4, -1, "com.robinhood.android.history.ui.AchTransferDetailFragment.GracePeriodContent.<anonymous>.<anonymous> (AchTransferDetailFragment.kt:231)");
                            }
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer3.changedInstance(achTransferDetailFragment);
                            final AchTransferDetailFragment achTransferDetailFragment2 = achTransferDetailFragment;
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.history.ui.AchTransferDetailFragment$GracePeriodContent$1$1$1$1
                                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                    public final boolean mo15941handle(GenericAction action) {
                                        Intrinsics.checkNotNullParameter(action, "action");
                                        if (action instanceof GenericAction.Dismiss) {
                                            achTransferDetailFragment2.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                                            return true;
                                        }
                                        if (action instanceof GenericAction.Deeplink) {
                                            return ActionHandlingFragment2.handleDeeplink$default(achTransferDetailFragment2, ((GenericAction.Deeplink) action).getValue2(), null, 2, null);
                                        }
                                        if (action instanceof GenericAction.InfoAlert) {
                                            return true;
                                        }
                                        throw new NoWhenBranchMatchedException();
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            final UIComponent<GenericAction> uIComponent3 = uIComponent2;
                            SduiActionHandler3.ProvideActionHandler((SduiActionHandler) objRememberedValue, ComposableLambda3.rememberComposableLambda(1126837225, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.history.ui.AchTransferDetailFragment.GracePeriodContent.1.1.2
                                public final void invoke(Composer composer4, int i5) {
                                    if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1126837225, i5, -1, "com.robinhood.android.history.ui.AchTransferDetailFragment.GracePeriodContent.<anonymous>.<anonymous>.<anonymous> (AchTransferDetailFragment.kt:244)");
                                    }
                                    ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(uIComponent3);
                                    composer4.startReplaceGroup(-1772220517);
                                    SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, Modifier.INSTANCE, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer4, 0, 0);
                                    composer4.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.history.ui.AchTransferDetailFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AchTransferDetailFragment.GracePeriodContent$lambda$16(this.f$0, uIComponent, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AchTransferDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/history/ui/AchTransferDetailFragment$Args;", "Landroid/os/Parcelable;", "transferId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getTransferId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID transferId;

        /* compiled from: AchTransferDetailFragment.kt */
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

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.transferId);
        }

        public Args(UUID transferId) {
            Intrinsics.checkNotNullParameter(transferId, "transferId");
            this.transferId = transferId;
        }

        public final UUID getTransferId() {
            return this.transferId;
        }
    }

    /* compiled from: AchTransferDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/AchTransferDetailFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/history/ui/AchTransferDetailFragment;", "Lcom/robinhood/android/history/ui/AchTransferDetailFragment$Args;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AchTransferDetailFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(AchTransferDetailFragment achTransferDetailFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, achTransferDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AchTransferDetailFragment newInstance(Args args) {
            return (AchTransferDetailFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AchTransferDetailFragment achTransferDetailFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, achTransferDetailFragment, args);
        }
    }
}
