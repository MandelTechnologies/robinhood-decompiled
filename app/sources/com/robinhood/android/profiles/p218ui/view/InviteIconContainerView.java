package com.robinhood.android.profiles.p218ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.robinhood.android.common.p088ui.BindResourcesKt;
import com.robinhood.android.profiles.p218ui.C25904R;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* compiled from: InviteIconContainerView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/profiles/ui/view/InviteIconContainerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "stackOffset", "", "getStackOffset", "()I", "stackOffset$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "inviteCount", "getNewItemView", "Landroid/widget/ImageView;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "Companion", "feature-lib-profiles_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class InviteIconContainerView extends FrameLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InviteIconContainerView.class, "stackOffset", "getStackOffset()I", 0))};
    private static final int MAX_ICON_COUNT = 6;

    /* renamed from: stackOffset$delegate, reason: from kotlin metadata */
    private final Interfaces2 stackOffset;

    public /* synthetic */ InviteIconContainerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteIconContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.stackOffset = BindResourcesKt.bindDimenPixelSize(this, C25904R.dimen.invite_emotion_icon_stack_offset);
    }

    private final int getStackOffset() {
        return ((Number) this.stackOffset.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final void bind(int inviteCount) {
        int iCoerceAtMost = RangesKt.coerceAtMost(inviteCount, 6);
        int childCount = getChildCount();
        if (childCount > iCoerceAtMost) {
            removeViews(0, childCount - iCoerceAtMost);
            return;
        }
        if (iCoerceAtMost > childCount) {
            int i = iCoerceAtMost - childCount;
            for (int i2 = 0; i2 < i; i2++) {
                addView(getNewItemView(childCount + i2), 0);
            }
        }
    }

    private final ImageView getNewItemView(int index) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(C25904R.layout.include_invite_icon_image_view, (ViewGroup) this, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewInflate;
        ViewsKt.setMarginStart(imageView, getStackOffset() * index);
        return imageView;
    }
}
