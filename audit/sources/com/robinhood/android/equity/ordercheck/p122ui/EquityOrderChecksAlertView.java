package com.robinhood.android.equity.ordercheck.p122ui;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equity.ordercheck.p122ui.EquityOrderChecksAlertFragment;
import com.robinhood.android.equity.ordercheck.p122ui.EquityOrderChecksAlertView;
import com.robinhood.android.equityvalidation.C16020R;
import com.robinhood.android.equityvalidation.databinding.MergeEquityOrderChecksAlertViewBinding;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.models.p320db.VisibleEquityOrderChecksAlert;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EquityOrderChecksAlertView.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002%&B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010 \u001a\u00020\u001d*\u00020\u00182\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksAlertView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/android/equityvalidation/databinding/MergeEquityOrderChecksAlertViewBinding;", "getBinding", "()Lcom/robinhood/android/equityvalidation/databinding/MergeEquityOrderChecksAlertViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksAlertView$Callbacks;", "buttonAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksAlertView$ButtonViewState;", "sectionAdapter", "Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksSectionAdapter;", "bind", "", "alert", "Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert;", "bindAlertStyle", "button", "Lcom/robinhood/models/serverdriven/db/GenericButton;", ResourceTypes.STYLE, "Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert$OrderChecksAlertStyle;", "Callbacks", "ButtonViewState", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquityOrderChecksAlertView extends Hammer_EquityOrderChecksAlertView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EquityOrderChecksAlertView.class, "binding", "getBinding()Lcom/robinhood/android/equityvalidation/databinding/MergeEquityOrderChecksAlertViewBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final GenericListAdapter<ClientComponentButtonView, ButtonViewState> buttonAdapter;
    private Callbacks callbacks;
    public Markwon markwon;
    private final EquityOrderChecksSectionAdapter sectionAdapter;

    /* compiled from: EquityOrderChecksAlertView.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksAlertView$Callbacks;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends ClientComponentButtonView.Callbacks {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityOrderChecksAlertView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, EquityOrderChecksAlertView2.INSTANCE);
        GenericListAdapter<ClientComponentButtonView, ButtonViewState> genericListAdapterM2987of = GenericListAdapter.INSTANCE.m2987of(ClientComponentButtonView.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.equity.ordercheck.ui.EquityOrderChecksAlertView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EquityOrderChecksAlertView.buttonAdapter$lambda$0(this.f$0, (ClientComponentButtonView) obj, (EquityOrderChecksAlertView.ButtonViewState) obj2);
            }
        });
        this.buttonAdapter = genericListAdapterM2987of;
        EquityOrderChecksSectionAdapter equityOrderChecksSectionAdapter = new EquityOrderChecksSectionAdapter();
        this.sectionAdapter = equityOrderChecksSectionAdapter;
        ViewGroups.inflate(this, C16020R.layout.merge_equity_order_checks_alert_view, true);
        getBinding().buttonRecyclerView.setAdapter(genericListAdapterM2987of);
        getBinding().sectionRecyclerView.setAdapter(equityOrderChecksSectionAdapter);
    }

    public /* synthetic */ EquityOrderChecksAlertView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
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

    private final MergeEquityOrderChecksAlertViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEquityOrderChecksAlertViewBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buttonAdapter$lambda$0(final EquityOrderChecksAlertView equityOrderChecksAlertView, ClientComponentButtonView of, ButtonViewState buttonViewState) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(buttonViewState, "buttonViewState");
        GenericButton button = buttonViewState.getButton();
        VisibleEquityOrderChecksAlert.OrderChecksAlertStyle style = buttonViewState.getStyle();
        of.setCallbacks(new EquityOrderChecksAlertFragment.Callbacks() { // from class: com.robinhood.android.equity.ordercheck.ui.EquityOrderChecksAlertView$buttonAdapter$1$buttonCallbacks$1
            @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
            public boolean onActionClicked(ServerDrivenButton button2) {
                Intrinsics.checkNotNullParameter(button2, "button");
                EquityOrderChecksAlertView.Callbacks callbacks = this.this$0.callbacks;
                return callbacks != null && callbacks.onActionClicked(button2);
            }
        });
        of.bind(ServerDrivenButton.INSTANCE.from(button));
        equityOrderChecksAlertView.bindAlertStyle(of, button, style);
        return Unit.INSTANCE;
    }

    public final void bind(VisibleEquityOrderChecksAlert alert, Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        RhTextView alertTitle = getBinding().alertTitle;
        Intrinsics.checkNotNullExpressionValue(alertTitle, "alertTitle");
        TextViewsKt.setVisibilityText(alertTitle, alert.getTitle());
        GenericListAdapter<ClientComponentButtonView, ButtonViewState> genericListAdapter = this.buttonAdapter;
        List<GenericButton> actionButtons = alert.getActionButtons();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(actionButtons, 10));
        Iterator<T> it = actionButtons.iterator();
        while (it.hasNext()) {
            arrayList.add(new ButtonViewState((GenericButton) it.next(), alert.getStyle()));
        }
        genericListAdapter.submitList(arrayList);
        RecyclerView sectionRecyclerView = getBinding().sectionRecyclerView;
        Intrinsics.checkNotNullExpressionValue(sectionRecyclerView, "sectionRecyclerView");
        sectionRecyclerView.setVisibility(!alert.getSections().isEmpty() ? 0 : 8);
        this.sectionAdapter.submitList(alert.getSections());
        this.callbacks = callbacks;
        getBinding().alertSubtitle.setText(Markwons.toSpanned$default(getMarkwon(), alert.getSubtitleMarkdown(), null, 2, null));
        if (alert.getPog() == null) {
            RdsPogView alertPog = getBinding().alertPog;
            Intrinsics.checkNotNullExpressionValue(alertPog, "alertPog");
            alertPog.setVisibility(8);
        } else {
            RdsPogView alertPog2 = getBinding().alertPog;
            Intrinsics.checkNotNullExpressionValue(alertPog2, "alertPog");
            alertPog2.setVisibility(0);
            RdsPogView rdsPogView = getBinding().alertPog;
            ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(alert.getPog());
            rdsPogView.setPictogram(serverToBentoAssetMapper3FromServerValue != null ? ViewsKt.getDrawable(this, serverToBentoAssetMapper3FromServerValue.getResourceId()) : null);
        }
    }

    private final void bindAlertStyle(ClientComponentButtonView clientComponentButtonView, GenericButton genericButton, VisibleEquityOrderChecksAlert.OrderChecksAlertStyle orderChecksAlertStyle) {
        if (orderChecksAlertStyle == null) {
            return;
        }
        ThemedColor themedColorTextColorForButtonType = orderChecksAlertStyle.textColorForButtonType(genericButton.getGenericButtonType());
        if (themedColorTextColorForButtonType != null) {
            ResourceReferences4<Integer> resourceReferences4MapColor = ServerToBentoColorMapper.INSTANCE.mapColor(themedColorTextColorForButtonType);
            RdsButton button = clientComponentButtonView.getViewBinding().button;
            Intrinsics.checkNotNullExpressionValue(button, "button");
            ScarletManager2.overrideAttribute(button, R.attr.textColor, resourceReferences4MapColor);
        }
        ThemedColor themedColorBackgroundColorForButtonType = orderChecksAlertStyle.backgroundColorForButtonType(genericButton.getGenericButtonType());
        if (themedColorBackgroundColorForButtonType != null) {
            ResourceReferences4<Integer> resourceReferences4MapColor2 = ServerToBentoColorMapper.INSTANCE.mapColor(themedColorBackgroundColorForButtonType);
            RdsButton button2 = clientComponentButtonView.getViewBinding().button;
            Intrinsics.checkNotNullExpressionValue(button2, "button");
            ScarletManager2.overrideAttribute(button2, R.attr.backgroundTint, resourceReferences4MapColor2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EquityOrderChecksAlertView.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equity/ordercheck/ui/EquityOrderChecksAlertView$ButtonViewState;", "", "button", "Lcom/robinhood/models/serverdriven/db/GenericButton;", ResourceTypes.STYLE, "Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert$OrderChecksAlertStyle;", "<init>", "(Lcom/robinhood/models/serverdriven/db/GenericButton;Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert$OrderChecksAlertStyle;)V", "getButton", "()Lcom/robinhood/models/serverdriven/db/GenericButton;", "getStyle", "()Lcom/robinhood/models/db/VisibleEquityOrderChecksAlert$OrderChecksAlertStyle;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-equity-validation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class ButtonViewState {
        private final GenericButton button;
        private final VisibleEquityOrderChecksAlert.OrderChecksAlertStyle style;

        public static /* synthetic */ ButtonViewState copy$default(ButtonViewState buttonViewState, GenericButton genericButton, VisibleEquityOrderChecksAlert.OrderChecksAlertStyle orderChecksAlertStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                genericButton = buttonViewState.button;
            }
            if ((i & 2) != 0) {
                orderChecksAlertStyle = buttonViewState.style;
            }
            return buttonViewState.copy(genericButton, orderChecksAlertStyle);
        }

        /* renamed from: component1, reason: from getter */
        public final GenericButton getButton() {
            return this.button;
        }

        /* renamed from: component2, reason: from getter */
        public final VisibleEquityOrderChecksAlert.OrderChecksAlertStyle getStyle() {
            return this.style;
        }

        public final ButtonViewState copy(GenericButton button, VisibleEquityOrderChecksAlert.OrderChecksAlertStyle style) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new ButtonViewState(button, style);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonViewState)) {
                return false;
            }
            ButtonViewState buttonViewState = (ButtonViewState) other;
            return Intrinsics.areEqual(this.button, buttonViewState.button) && Intrinsics.areEqual(this.style, buttonViewState.style);
        }

        public int hashCode() {
            int iHashCode = this.button.hashCode() * 31;
            VisibleEquityOrderChecksAlert.OrderChecksAlertStyle orderChecksAlertStyle = this.style;
            return iHashCode + (orderChecksAlertStyle == null ? 0 : orderChecksAlertStyle.hashCode());
        }

        public String toString() {
            return "ButtonViewState(button=" + this.button + ", style=" + this.style + ")";
        }

        public ButtonViewState(GenericButton button, VisibleEquityOrderChecksAlert.OrderChecksAlertStyle orderChecksAlertStyle) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.style = orderChecksAlertStyle;
        }

        public final GenericButton getButton() {
            return this.button;
        }

        public final VisibleEquityOrderChecksAlert.OrderChecksAlertStyle getStyle() {
            return this.style;
        }
    }
}
