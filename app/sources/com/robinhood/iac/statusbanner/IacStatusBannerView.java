package com.robinhood.iac.statusbanner;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.iac.extensions.EventLoggers4;
import com.robinhood.iac.statusbanner.databinding.MergeIacStatusBannerViewBinding;
import com.robinhood.models.api.IacDismissMethod;
import com.robinhood.models.p320db.IacStatusBanner;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
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

/* compiled from: IacStatusBannerView.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010 \u001a\u00020!H\u0014J\u000e\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020'H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006)"}, m3636d2 = {"Lcom/robinhood/iac/statusbanner/IacStatusBannerView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "duxo", "Lcom/robinhood/iac/statusbanner/IacStatusBannerDuxo;", "getDuxo", "()Lcom/robinhood/iac/statusbanner/IacStatusBannerDuxo;", "setDuxo", "(Lcom/robinhood/iac/statusbanner/IacStatusBannerDuxo;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "binding", "Lcom/robinhood/iac/statusbanner/databinding/MergeIacStatusBannerViewBinding;", "getBinding", "()Lcom/robinhood/iac/statusbanner/databinding/MergeIacStatusBannerViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onAttachedToWindow", "", "setIacBanner", MerchantRewardDetailComposable.BANNER_TEST_TAG, "Lcom/robinhood/models/db/IacStatusBanner;", "bindIacBanner", "state", "Lcom/robinhood/iac/statusbanner/IacStatusBannerViewState;", "Companion", "lib-iac-status-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class IacStatusBannerView extends Hammer_IacStatusBannerView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(IacStatusBannerView.class, "binding", "getBinding()Lcom/robinhood/iac/statusbanner/databinding/MergeIacStatusBannerViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public IacStatusBannerDuxo duxo;
    public EventLogger eventLogger;
    public Navigator navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IacStatusBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, IacStatusBannerView2.INSTANCE);
        ViewGroups.inflate(this, C33353R.layout.merge_iac_status_banner_view, true);
    }

    public final IacStatusBannerDuxo getDuxo() {
        IacStatusBannerDuxo iacStatusBannerDuxo = this.duxo;
        if (iacStatusBannerDuxo != null) {
            return iacStatusBannerDuxo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duxo");
        return null;
    }

    public final void setDuxo(IacStatusBannerDuxo iacStatusBannerDuxo) {
        Intrinsics.checkNotNullParameter(iacStatusBannerDuxo, "<set-?>");
        this.duxo = iacStatusBannerDuxo;
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

    private final MergeIacStatusBannerViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeIacStatusBannerViewBinding) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable<IacStatusBannerViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo(ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), this, true).subscribeKotlin(new C333521(this));
    }

    /* compiled from: IacStatusBannerView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.iac.statusbanner.IacStatusBannerView$onAttachedToWindow$1 */
    /* synthetic */ class C333521 extends FunctionReferenceImpl implements Function1<IacStatusBannerViewState, Unit> {
        C333521(Object obj) {
            super(1, obj, IacStatusBannerView.class, "bindIacBanner", "bindIacBanner(Lcom/robinhood/iac/statusbanner/IacStatusBannerViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IacStatusBannerViewState iacStatusBannerViewState) {
            invoke2(iacStatusBannerViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(IacStatusBannerViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((IacStatusBannerView) this.receiver).bindIacBanner(p0);
        }
    }

    public final void setIacBanner(IacStatusBanner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        getDuxo().setIacBanner(banner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindIacBanner(final IacStatusBannerViewState state) {
        if (state.getStatusBanner() == null) {
            return;
        }
        RhTextView rhTextView = getBinding().iacStatusBannerTxt;
        RichText title = state.getStatusBanner().getTitle();
        Context context = rhTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rhTextView.setText(RichTexts.toSpannableString$default(title, context, null, false, null, 14, null));
        Intrinsics.checkNotNull(rhTextView);
        ScarletManager2.overrideAttribute(rhTextView, android.R.attr.textColor, state.getTextColor());
        ScarletManager2.overrideAttribute(rhTextView, android.R.attr.drawableTint, state.getTextColor());
        TextViewsKt.setDrawables$default((TextView) rhTextView, (Drawable) null, (Drawable) null, state.getShowArrow() ? ViewsKt.getDrawable(rhTextView, C20690R.drawable.ic_rds_arrow_right_16dp).mutate() : null, (Drawable) null, true, 11, (Object) null);
        View iacStatusBannerRuleLine = getBinding().iacStatusBannerRuleLine;
        Intrinsics.checkNotNullExpressionValue(iacStatusBannerRuleLine, "iacStatusBannerRuleLine");
        ScarletManager2.overrideAttribute(iacStatusBannerRuleLine, android.R.attr.backgroundTint, state.getRuleLineColor());
        final GenericAction action = state.getStatusBanner().getAction();
        if (action != null) {
            OnClickListeners.onClick(this, new Function0() { // from class: com.robinhood.iac.statusbanner.IacStatusBannerView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IacStatusBannerView.bindIacBanner$lambda$1(this.f$0, state, action);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindIacBanner$lambda$1(IacStatusBannerView iacStatusBannerView, IacStatusBannerViewState iacStatusBannerViewState, GenericAction genericAction) {
        EventLoggers4.logTap(iacStatusBannerView.getEventLogger(), iacStatusBannerViewState.getStatusBanner());
        if (genericAction instanceof GenericAction.DeeplinkAction) {
            IacStatusBannerDuxo duxo = iacStatusBannerView.getDuxo();
            UUID receiptUuid = iacStatusBannerViewState.getStatusBanner().getReceiptUuid();
            GenericAction.DeeplinkAction deeplinkAction = (GenericAction.DeeplinkAction) genericAction;
            String string2 = deeplinkAction.getUri().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            duxo.postBannerTapped(receiptUuid, string2);
            Navigator navigator = iacStatusBannerView.getNavigator();
            Context context = iacStatusBannerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, deeplinkAction.getUri(), Boolean.TRUE, null, false, null, 56, null);
        } else if (genericAction instanceof GenericAction.DismissAction) {
            iacStatusBannerView.getDuxo().postBannerDismissed(iacStatusBannerViewState.getStatusBanner().getReceiptUuid(), IacDismissMethod.CTA);
        } else if (!(genericAction instanceof GenericAction.ButtonsAction) && !(genericAction instanceof GenericAction.ClaimPspAction) && !(genericAction instanceof GenericAction.GoldDowngradeAction) && !(genericAction instanceof GenericAction.InfoAlertAction) && !(genericAction instanceof GenericAction.ShareSnapshotAction) && !(genericAction instanceof GenericAction.OrderCheckAction) && !(genericAction instanceof GenericAction.CancelCryptoPendingOrdersAction) && !(genericAction instanceof GenericAction.DisableMarginWithdrawalAction)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: IacStatusBannerView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/iac/statusbanner/IacStatusBannerView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/iac/statusbanner/IacStatusBannerView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-iac-status-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<IacStatusBannerView> {
        private final /* synthetic */ Inflater<IacStatusBannerView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public IacStatusBannerView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (IacStatusBannerView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C33353R.layout.include_iac_banner_view);
        }
    }
}
