package com.robinhood.android.trade.configuration;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsRadioGroup;
import com.robinhood.android.designsystem.selectioncontrol.RdsRadioButtonRowView;
import com.robinhood.android.trade.configuration.OrderConfigurationRadioGroupResource;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OrderConfigurationRadioView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\u001a\u0010\u0013\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u0015R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRadioView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRadioGroupResource;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "radioGroup", "Lcom/robinhood/android/designsystem/selectioncontrol/NewRdsRadioGroup;", "getRadioGroup", "()Lcom/robinhood/android/designsystem/selectioncontrol/NewRdsRadioGroup;", "radioGroup$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "setOnCheckedListener", "onCheckedChanged", "Lkotlin/Function1;", "", "Companion", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OrderConfigurationRadioView extends RdsRippleContainerView implements Bindable<OrderConfigurationRadioGroupResource> {

    /* renamed from: radioGroup$delegate, reason: from kotlin metadata */
    private final Interfaces2 radioGroup;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OrderConfigurationRadioView.class, "radioGroup", "getRadioGroup()Lcom/robinhood/android/designsystem/selectioncontrol/NewRdsRadioGroup;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderConfigurationRadioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.radioGroup = BindViewDelegate2.bindView$default(this, C29312R.id.radio_group, null, 2, null);
        ViewGroups.inflate(this, C29312R.layout.merge_order_configuration_radio_group_row, true);
    }

    private final NewRdsRadioGroup getRadioGroup() {
        return (NewRdsRadioGroup) this.radioGroup.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(OrderConfigurationRadioGroupResource state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getRadioGroup().removeAllViews();
        for (OrderConfigurationRadioGroupResource.OrderConfigurationRadioButtonResource orderConfigurationRadioButtonResource : state.getRadioButtonResources()) {
            RdsRadioButtonRowView rdsRadioButtonRowViewInflate = RdsRadioButtonRowView.INSTANCE.inflate((ViewGroup) getRadioGroup());
            rdsRadioButtonRowViewInflate.setPrimaryText(ViewsKt.getString(this, orderConfigurationRadioButtonResource.getTitleRes()));
            Resources resources = getResources();
            int subtitleRes = orderConfigurationRadioButtonResource.getSubtitleRes();
            Object[] array2 = orderConfigurationRadioButtonResource.getSubtitleFormatArgs().toArray(new Object[0]);
            rdsRadioButtonRowViewInflate.setSecondaryText(resources.getString(subtitleRes, Arrays.copyOf(array2, array2.length)));
            getRadioGroup().addView(rdsRadioButtonRowViewInflate);
            if (orderConfigurationRadioButtonResource.isChecked()) {
                getRadioGroup().check(rdsRadioButtonRowViewInflate.getId());
            }
        }
    }

    public final void setOnCheckedListener(final Function1<? super Integer, Unit> onCheckedChanged) {
        Intrinsics.checkNotNullParameter(onCheckedChanged, "onCheckedChanged");
        getRadioGroup().onCheckedChange(new Function2() { // from class: com.robinhood.android.trade.configuration.OrderConfigurationRadioView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderConfigurationRadioView.setOnCheckedListener$lambda$2(onCheckedChanged, (NewRdsRadioGroup) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnCheckedListener$lambda$2(Function1 function1, NewRdsRadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(radioGroup, "radioGroup");
        function1.invoke(Integer.valueOf(radioGroup.indexOfChild(radioGroup.findViewById(i))));
        return Unit.INSTANCE;
    }

    /* compiled from: OrderConfigurationRadioView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRadioView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRadioView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OrderConfigurationRadioView> {
        private final /* synthetic */ Inflater<OrderConfigurationRadioView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OrderConfigurationRadioView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OrderConfigurationRadioView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C29312R.layout.include_order_configuration_radio_group_row);
        }
    }
}
