package com.robinhood.android.crypto.p094ui.view.availableCoins;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.databinding.MergeAvailableCoinsBinding;
import com.robinhood.utils.extensions.ViewGroups;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AvailableCoinsView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/view/availableCoins/AvailableCoinsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/crypto/databinding/MergeAvailableCoinsBinding;", "getBinding", "()Lcom/robinhood/android/crypto/databinding/MergeAvailableCoinsBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "similarInstrumentIds", "", "Ljava/util/UUID;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AvailableCoinsView extends LinearLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AvailableCoinsView.class, "binding", "getBinding()Lcom/robinhood/android/crypto/databinding/MergeAvailableCoinsBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailableCoinsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, AvailableCoinsView2.INSTANCE);
        setOrientation(1);
        ViewGroups.inflate(this, C12757R.layout.merge_available_coins, true);
        getBinding().availableCoinsHeaderComposeView.setContent(AvailableCoinsView3.INSTANCE.m13167getLambda$717445897$feature_crypto_externalDebug());
    }

    private final MergeAvailableCoinsBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeAvailableCoinsBinding) value;
    }

    public final void bind(List<UUID> similarInstrumentIds) {
        Intrinsics.checkNotNullParameter(similarInstrumentIds, "similarInstrumentIds");
        getBinding().instrumentCarousel.bindItems(similarInstrumentIds);
    }
}
