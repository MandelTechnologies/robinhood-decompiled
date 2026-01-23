package com.robinhood.android.common.gold;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.robinhood.android.common.gold.databinding.GoldValuePropViewBinding;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.models.api.bonfire.ApiGoldValuePropFeature;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: GoldValuePropView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldValuePropView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/models/api/bonfire/ApiGoldValuePropFeature;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/common/gold/databinding/GoldValuePropViewBinding;", "getBinding", "()Lcom/robinhood/android/common/gold/databinding/GoldValuePropViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "Companion", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class GoldValuePropView extends LinearLayout implements Bindable<ApiGoldValuePropFeature> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GoldValuePropView.class, "binding", "getBinding()Lcom/robinhood/android/common/gold/databinding/GoldValuePropViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldValuePropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, GoldValuePropView2.INSTANCE);
    }

    private final GoldValuePropViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (GoldValuePropViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(ApiGoldValuePropFeature state) {
        Intrinsics.checkNotNullParameter(state, "state");
        GoldValuePropViewBinding binding = getBinding();
        if (Intrinsics.areEqual(state.getIconKey(), ServerToBentoAssetMapper3.SPARKLE.getServerValue())) {
            binding.sparkle.setVisibility(0);
            binding.pog.setVisibility(8);
        } else {
            binding.pog.setVisibility(0);
            RdsPogView rdsPogView = binding.pog;
            ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(state.getIconKey());
            rdsPogView.setPictogram(serverToBentoAssetMapper3FromServerValue != null ? ViewsKt.getDrawable(this, serverToBentoAssetMapper3FromServerValue.getResourceId()) : null);
            binding.sparkle.setVisibility(8);
        }
        binding.titleTxt.setText(state.getTitle());
        binding.descriptionTxt.setText(state.getContent());
    }

    /* compiled from: GoldValuePropView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldValuePropView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/gold/GoldValuePropView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<GoldValuePropView> {
        private final /* synthetic */ Inflater<GoldValuePropView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public GoldValuePropView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (GoldValuePropView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C11182R.layout.gold_value_prop_view);
        }
    }
}
