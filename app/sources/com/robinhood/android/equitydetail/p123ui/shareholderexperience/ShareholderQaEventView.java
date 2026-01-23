package com.robinhood.android.equitydetail.p123ui.shareholderexperience;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.shareholder.view.LiveInfoTag;
import com.robinhood.android.common.shareholder.view.ShareholderProfileIconView;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.MergeQaEventViewBinding;
import com.robinhood.android.equitydetail.p123ui.ShareholderQaEventViewData;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggableViewContext;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggingExtensions;
import com.robinhood.android.equitydetail.p123ui.analytics.SdpEvent;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.InfoTag;
import com.robinhood.models.serverdriven.experimental.api.InfoTagType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ShareholderQAContext;
import com.robinhood.shareholderx.models.p401db.ShareholderEntryPointResponse;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ShareholderQaEventView.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u0006:\u0001-B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0005H\u0016J\u0018\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00060\u0014j\u0002`\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/shareholderexperience/ShareholderQaEventView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView;", "Lcom/robinhood/android/common/util/UiCallbacks$Clearable;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/equitydetail/ui/ShareholderQaEventViewData;", "Landroid/graphics/drawable/Drawable$Callback;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "getComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "analyticsCallbacks", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "getAnalyticsCallbacks", "()Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "setAnalyticsCallbacks", "(Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;)V", "binding", "Lcom/robinhood/android/equitydetail/databinding/MergeQaEventViewBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/MergeQaEventViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "clear", "", "bind", "state", "handleCta", "instrumentId", "Ljava/util/UUID;", "entryPointInfo", "Lcom/robinhood/shareholderx/models/db/ShareholderEntryPointResponse$ShareholderEntryPointInfo;", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ShareholderQaEventView extends Hammer_ShareholderQaEventView implements LoggableSdpView, UiCallbacks.Clearable, Bindable<ShareholderQaEventViewData>, Drawable.Callback {
    private static final String EXTRA_ENTRYPOINT_ENUM = "entrypoint_enum";
    private static final String EXTRA_INSTRUMENT_ID = "instrument_id";
    private LoggableSdpView.Callbacks analyticsCallbacks;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Navigator navigator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ShareholderQaEventView.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/MergeQaEventViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.util.UiCallbacks.Clearable
    public void clear() {
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView, android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        LoggableSdpView.DefaultImpls.onViewAttachedToWindow(this, view);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView, android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        LoggableSdpView.DefaultImpls.onViewDetachedFromWindow(this, view);
    }

    public /* synthetic */ ShareholderQaEventView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareholderQaEventView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C15314R.layout.merge_qa_event_view, true);
        this.binding = ViewBinding5.viewBinding(this, ShareholderQaEventView2.INSTANCE);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public Component.ComponentType getComponentType() {
        return Component.ComponentType.SHAREHOLDER_QA_SECTION;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public LoggableSdpView.Callbacks getAnalyticsCallbacks() {
        return this.analyticsCallbacks;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public void setAnalyticsCallbacks(LoggableSdpView.Callbacks callbacks) {
        this.analyticsCallbacks = callbacks;
    }

    private final MergeQaEventViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeQaEventViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(ShareholderQaEventViewData state) {
        Intrinsics.checkNotNullParameter(state, "state");
        MergeQaEventViewBinding binding = getBinding();
        final UUID instrumentId = state.getEntryPointResponse().getInstrumentId();
        final ShareholderEntryPointResponse.ShareholderEntryPointInfo result = state.getEntryPointResponse().getResult();
        if (result != null) {
            LoggingExtensions.changeLoggableContext(this, new LoggableViewContext.ShareholderExperience(result.getEventSlug(), result.isShareholder(), result.getLink().getText()));
            binding.shareholderEventHeader.setText(result.getTitle());
            binding.shareholderEventSubheader.setText(result.getSubtitle());
            ShareholderProfileIconView.bind$default(binding.shareholderEventIconCarousel, result.getLogo(), result.getPortraits(), null, 4, null);
            RhTextView shareholderEventNumberParticipatedLabel = binding.shareholderEventNumberParticipatedLabel;
            Intrinsics.checkNotNullExpressionValue(shareholderEventNumberParticipatedLabel, "shareholderEventNumberParticipatedLabel");
            ShareholderEntryPointResponse.ShareholderEntryPointInfo.DisplayPair participants = result.getParticipants();
            TextViewsKt.setVisibilityText(shareholderEventNumberParticipatedLabel, participants != null ? participants.getLabel() : null);
            RhTextView shareholderEventNumberParticipated = binding.shareholderEventNumberParticipated;
            Intrinsics.checkNotNullExpressionValue(shareholderEventNumberParticipated, "shareholderEventNumberParticipated");
            ShareholderEntryPointResponse.ShareholderEntryPointInfo.DisplayPair participants2 = result.getParticipants();
            TextViewsKt.setVisibilityText(shareholderEventNumberParticipated, participants2 != null ? participants2.getValue() : null);
            RhTextView shareholderEventNumberQuestionsLabel = binding.shareholderEventNumberQuestionsLabel;
            Intrinsics.checkNotNullExpressionValue(shareholderEventNumberQuestionsLabel, "shareholderEventNumberQuestionsLabel");
            ShareholderEntryPointResponse.ShareholderEntryPointInfo.DisplayPair questions = result.getQuestions();
            TextViewsKt.setVisibilityText(shareholderEventNumberQuestionsLabel, questions != null ? questions.getLabel() : null);
            RhTextView shareholderEventNumberQuestions = binding.shareholderEventNumberQuestions;
            Intrinsics.checkNotNullExpressionValue(shareholderEventNumberQuestions, "shareholderEventNumberQuestions");
            ShareholderEntryPointResponse.ShareholderEntryPointInfo.DisplayPair questions2 = result.getQuestions();
            TextViewsKt.setVisibilityText(shareholderEventNumberQuestions, questions2 != null ? questions2.getValue() : null);
            LiveInfoTag shareholderEventInfoTag = binding.shareholderEventInfoTag;
            Intrinsics.checkNotNullExpressionValue(shareholderEventInfoTag, "shareholderEventInfoTag");
            shareholderEventInfoTag.setVisibility(result.getInfoTag() != null ? 0 : 8);
            InfoTag<GenericAction> infoTag = result.getInfoTag();
            if (infoTag != null) {
                LiveInfoTag liveInfoTag = binding.shareholderEventInfoTag;
                InfoTagType type2 = infoTag.getType();
                Icon icon = infoTag.getIcon();
                LiveInfoTag.setInfoTagData$default(liveInfoTag, type2, icon != null ? Integer.valueOf(IconExtensions.getResourceId(icon)) : null, infoTag.getLabel(), this, result.getLiveCall(), false, 32, null);
                LiveInfoTag shareholderEventInfoTag2 = binding.shareholderEventInfoTag;
                Intrinsics.checkNotNullExpressionValue(shareholderEventInfoTag2, "shareholderEventInfoTag");
                OnClickListeners.onClick(shareholderEventInfoTag2, new Function0() { // from class: com.robinhood.android.equitydetail.ui.shareholderexperience.ShareholderQaEventView$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShareholderQaEventView.bind$lambda$5$lambda$2$lambda$1(this.f$0, instrumentId, result);
                    }
                });
            }
            binding.shareholderEventCta.setText(result.getLink().getText());
            RdsTextButton shareholderEventCta = binding.shareholderEventCta;
            Intrinsics.checkNotNullExpressionValue(shareholderEventCta, "shareholderEventCta");
            OnClickListeners.onClick(shareholderEventCta, new Function0() { // from class: com.robinhood.android.equitydetail.ui.shareholderexperience.ShareholderQaEventView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareholderQaEventView.bind$lambda$5$lambda$3(this.f$0, instrumentId, result);
                }
            });
            OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.android.equitydetail.ui.shareholderexperience.ShareholderQaEventView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareholderQaEventView.bind$lambda$5$lambda$4(this.f$0, instrumentId, result);
                }
            });
            return;
        }
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5$lambda$2$lambda$1(ShareholderQaEventView shareholderQaEventView, UUID uuid, ShareholderEntryPointResponse.ShareholderEntryPointInfo shareholderEntryPointInfo) {
        shareholderQaEventView.handleCta(uuid, shareholderEntryPointInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5$lambda$3(ShareholderQaEventView shareholderQaEventView, UUID uuid, ShareholderEntryPointResponse.ShareholderEntryPointInfo shareholderEntryPointInfo) {
        shareholderQaEventView.handleCta(uuid, shareholderEntryPointInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5$lambda$4(ShareholderQaEventView shareholderQaEventView, UUID uuid, ShareholderEntryPointResponse.ShareholderEntryPointInfo shareholderEntryPointInfo) {
        shareholderQaEventView.handleCta(uuid, shareholderEntryPointInfo);
        return Unit.INSTANCE;
    }

    private final void handleCta(UUID instrumentId, ShareholderEntryPointResponse.ShareholderEntryPointInfo entryPointInfo) {
        LoggableSdpView.Callbacks analyticsCallbacks = getAnalyticsCallbacks();
        if (analyticsCallbacks != null) {
            analyticsCallbacks.logEvent(new SdpEvent.ShareholderEntrypointTapped(entryPointInfo.getEventSlug(), ShareholderQAContext.EntryPoint.STOCK_DETAIL_CARD, entryPointInfo.getLink().getText(), Boolean.valueOf(entryPointInfo.isShareholder())));
        }
        GenericAction action = entryPointInfo.getLink().getAction();
        if (action instanceof GenericAction.Deeplink) {
            Uri uriBuild = Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()).buildUpon().appendQueryParameter(EXTRA_INSTRUMENT_ID, instrumentId.toString()).appendQueryParameter(EXTRA_ENTRYPOINT_ENUM, ShareholderQAContext.EntryPoint.STOCK_DETAIL_CARD.toString()).build();
            Navigator navigator = getNavigator();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uriBuild, null, null, false, null, 60, null);
        }
    }

    /* compiled from: ShareholderQaEventView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/shareholderexperience/ShareholderQaEventView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/equitydetail/ui/shareholderexperience/ShareholderQaEventView;", "<init>", "()V", "EXTRA_INSTRUMENT_ID", "", "EXTRA_ENTRYPOINT_ENUM", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ShareholderQaEventView> {
        private final /* synthetic */ Inflater<ShareholderQaEventView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ShareholderQaEventView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ShareholderQaEventView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C15314R.layout.include_qa_event_view);
        }
    }
}
