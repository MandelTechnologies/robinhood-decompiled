package com.robinhood.android.equitydetail.p123ui.leveltwo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.MergeLevel2AxesViewBinding;
import com.robinhood.models.util.Money;
import com.robinhood.utils.extensions.ViewGroups;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: Level2AxesView.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2AxesView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/equitydetail/databinding/MergeLevel2AxesViewBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/MergeLevel2AxesViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "left", "Lcom/robinhood/models/util/Money;", "center", "right", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class Level2AxesView extends LinearLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Level2AxesView.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/MergeLevel2AxesViewBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Level2AxesView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setOrientation(1);
        ViewGroups.inflate(this, C15314R.layout.merge_level_2_axes_view, true);
        this.binding = ViewBinding5.viewBinding(this, Level2AxesView2.INSTANCE);
    }

    private final MergeLevel2AxesViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeLevel2AxesViewBinding) value;
    }

    public final void bind(Money left, Money center, Money right) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(right, "right");
        MergeLevel2AxesViewBinding binding = getBinding();
        binding.leftLabelTxt.setText(Money.format$default(left, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        binding.centerLabelTxt.setText(Money.format$default(center, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        binding.rightLabelTxt.setText(Money.format$default(right, null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }
}
