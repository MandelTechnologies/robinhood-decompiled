package com.robinhood.android.transfers.p271ui.max.posttransfer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackgroundTypes.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0002¨\u0006\b"}, m3636d2 = {"getBackgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Lcom/robinhood/models/api/bonfire/ApiPostTransferPage$IraContributionCelebration$BackgroundType;", "context", "Landroid/content/Context;", "getStatusBarColorReference", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.posttransfer.BackgroundTypesKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class BackgroundTypes {

    /* compiled from: BackgroundTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.posttransfer.BackgroundTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiPostTransferPage.IraContributionCelebration.BackgroundType.values().length];
            try {
                iArr[ApiPostTransferPage.IraContributionCelebration.BackgroundType.GOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiPostTransferPage.IraContributionCelebration.BackgroundType.RETIREMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final GradientDrawable getBackgroundDrawable(ApiPostTransferPage.IraContributionCelebration.BackgroundType backgroundType, Context context) {
        int i;
        Intrinsics.checkNotNullParameter(backgroundType, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 29 && backgroundType == ApiPostTransferPage.IraContributionCelebration.BackgroundType.GOLD) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
            gradientDrawable.setColors(new int[]{context.getColor(C30065R.color.gold_gradient_start_color), context.getColor(C30065R.color.gold_gradient_center_color), context.getColor(C30065R.color.gold_gradient_end_color)}, new float[]{0.1683f, 0.6458f, 1.0f});
            return gradientDrawable;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[backgroundType.ordinal()];
        if (i2 == 1) {
            i = C30065R.drawable.ira_contribution_celebration_background_gold;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C30065R.drawable.ira_contribution_celebration_background_retirement;
        }
        Drawable drawable = context.getDrawable(i);
        if (drawable instanceof GradientDrawable) {
            return (GradientDrawable) drawable;
        }
        return null;
    }

    public static final ResourceReferences4<Object> getStatusBarColorReference(ApiPostTransferPage.IraContributionCelebration.BackgroundType backgroundType) {
        Intrinsics.checkNotNullParameter(backgroundType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[backgroundType.ordinal()];
        if (i == 1) {
            return new DirectResourceReference(ResourceType.COLOR.INSTANCE, C30065R.color.gold_gradient_end_color);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C13997R.attr.paletteColorXRayLight);
    }
}
