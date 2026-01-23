package com.robinhood.android.serverclientcomponents.timeline;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.serverclientcomponents.C28308R;
import com.robinhood.android.serverclientcomponents.databinding.MergeClientComponentTimelineRowViewBinding;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.TimelineRow;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
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

/* compiled from: ClientComponentTimelineRowView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0019B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/serverclientcomponents/timeline/ClientComponentTimelineRowView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/models/serverdriven/db/TimelineRow;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "binding", "Lcom/robinhood/android/serverclientcomponents/databinding/MergeClientComponentTimelineRowViewBinding;", "getBinding", "()Lcom/robinhood/android/serverclientcomponents/databinding/MergeClientComponentTimelineRowViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "Companion", "lib-server-client-components_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ClientComponentTimelineRowView extends Hammer_ClientComponentTimelineRowView implements Bindable<TimelineRow> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ClientComponentTimelineRowView.class, "binding", "getBinding()Lcom/robinhood/android/serverclientcomponents/databinding/MergeClientComponentTimelineRowViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Navigator navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientComponentTimelineRowView(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ViewGroups.inflate(this, C28308R.layout.merge_client_component_timeline_row_view, true);
        this.binding = ViewBinding5.viewBinding(this, ClientComponentTimelineRowView2.INSTANCE);
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

    private final MergeClientComponentTimelineRowViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeClientComponentTimelineRowViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(TimelineRow state) {
        Intrinsics.checkNotNullParameter(state, "state");
        final RdsTimelineRowView rdsTimelineRowView = getBinding().row;
        rdsTimelineRowView.setPrimaryText(state.getPrimaryText());
        rdsTimelineRowView.setMetadataText(state.getMetadataText());
        rdsTimelineRowView.setCtaButtonText(state.getCtaButtonText());
        rdsTimelineRowView.setPosition(TimelineRows.toViewPosition(state.getPosition()));
        RdsTimelineRowView.State rdsTimelineRowViewState = TimelineRows.toRdsTimelineRowViewState(state);
        if (rdsTimelineRowViewState != null) {
            rdsTimelineRowView.setState(rdsTimelineRowViewState);
        }
        ServerToBentoAssetMapper2 iconOverride = state.getIconOverride();
        if (iconOverride != null) {
            rdsTimelineRowView.setIconDrawable(rdsTimelineRowView.getContext().getDrawable(iconOverride.getResourceId()));
        }
        final GenericAction ctaAction = state.getCtaAction();
        if (ctaAction != null) {
            rdsTimelineRowView.onCtaButtonClick(new Function0() { // from class: com.robinhood.android.serverclientcomponents.timeline.ClientComponentTimelineRowView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ClientComponentTimelineRowView.bind$lambda$2$lambda$1(ctaAction, this, rdsTimelineRowView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2$lambda$1(GenericAction genericAction, ClientComponentTimelineRowView clientComponentTimelineRowView, RdsTimelineRowView rdsTimelineRowView) {
        if (genericAction instanceof GenericAction.DeeplinkAction) {
            Navigator navigator = clientComponentTimelineRowView.getNavigator();
            Context context = rdsTimelineRowView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((GenericAction.DeeplinkAction) genericAction).getUri(), null, null, false, null, 60, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ClientComponentTimelineRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/serverclientcomponents/timeline/ClientComponentTimelineRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/serverclientcomponents/timeline/ClientComponentTimelineRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-server-client-components_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ClientComponentTimelineRowView> {
        private final /* synthetic */ Inflater<ClientComponentTimelineRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ClientComponentTimelineRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ClientComponentTimelineRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28308R.layout.include_client_component_timeline_row_view);
        }
    }
}
