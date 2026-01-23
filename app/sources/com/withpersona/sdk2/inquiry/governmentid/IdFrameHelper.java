package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import androidx.core.content.ContextCompat;
import com.robinhood.utils.extensions.ResourceTypes;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.resources.R$attr;
import com.withpersona.sdk2.inquiry.resources.R$color;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IdFrameHelper.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"idFrameAssetsFor", "Lcom/withpersona/sdk2/inquiry/governmentid/OverlayAssets;", "Landroid/content/Context;", "overlay", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "createIdFrameWithAttributes", "Landroid/graphics/drawable/GradientDrawable;", ResourceTypes.ATTRIBUTE, "", "government-id_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.IdFrameHelperKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class IdFrameHelper {
    public static final OverlayAssets idFrameAssetsFor(Context context, GovernmentIdScreen2.Overlay overlay) {
        int resourceId;
        int resourceId2;
        int i;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        GovernmentIdScreen2.Overlay.Passport passport = GovernmentIdScreen2.Overlay.Passport.INSTANCE;
        if (Intrinsics.areEqual(overlay, passport)) {
            resourceId = R$raw.pi2_mrz_intro_lottie;
        } else if (Intrinsics.areEqual(overlay, GovernmentIdScreen2.Overlay.Barcode.INSTANCE)) {
            resourceId = R$raw.pi2_barcode_intro_lottie;
        } else {
            if (!Intrinsics.areEqual(overlay, GovernmentIdScreen2.Overlay.CornersOnly.INSTANCE) && !(overlay instanceof GovernmentIdScreen2.Overlay.Custom) && !Intrinsics.areEqual(overlay, GovernmentIdScreen2.Overlay.GenericFront.INSTANCE) && !Intrinsics.areEqual(overlay, GovernmentIdScreen2.Overlay.Rectangle.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            resourceId = R$raw.pi2_id_front_processing_lottie;
        }
        if (Intrinsics.areEqual(overlay, passport)) {
            resourceId2 = R$drawable.pi2_governmentid_passport_idguide;
        } else if (Intrinsics.areEqual(overlay, GovernmentIdScreen2.Overlay.Barcode.INSTANCE)) {
            resourceId2 = R$drawable.pi2_governmentid_barcode_idguide;
        } else if (Intrinsics.areEqual(overlay, GovernmentIdScreen2.Overlay.Rectangle.INSTANCE)) {
            resourceId2 = R$drawable.pi2_governmentid_blank;
        } else if (Intrinsics.areEqual(overlay, GovernmentIdScreen2.Overlay.CornersOnly.INSTANCE)) {
            resourceId2 = R$drawable.pi2_governmentid_corners_only;
        } else {
            if (!(overlay instanceof GovernmentIdScreen2.Overlay.Custom) && !Intrinsics.areEqual(overlay, GovernmentIdScreen2.Overlay.GenericFront.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            resourceId2 = R$drawable.pi2_governmentid_face_with_text;
        }
        if (Intrinsics.areEqual(overlay, passport)) {
            i = R$attr.personaIdFrameMrzGuideAssets;
        } else if (Intrinsics.areEqual(overlay, GovernmentIdScreen2.Overlay.Barcode.INSTANCE)) {
            i = R$attr.personaIdFrameBarcodeGuideAssets;
        } else {
            if (!Intrinsics.areEqual(overlay, GovernmentIdScreen2.Overlay.CornersOnly.INSTANCE) && !(overlay instanceof GovernmentIdScreen2.Overlay.Custom) && !Intrinsics.areEqual(overlay, GovernmentIdScreen2.Overlay.GenericFront.INSTANCE) && !Intrinsics.areEqual(overlay, GovernmentIdScreen2.Overlay.Rectangle.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.personaIdFrameFrontGuideAssets;
        }
        Integer numResourceIdFromAttr$default = ResTools.resourceIdFromAttr$default(context, i, null, false, 6, null);
        if (numResourceIdFromAttr$default != null) {
            int iIntValue = numResourceIdFromAttr$default.intValue();
            int[] Pi2IdFrameGuideAssets = com.withpersona.sdk2.inquiry.resources.R$styleable.Pi2IdFrameGuideAssets;
            Intrinsics.checkNotNullExpressionValue(Pi2IdFrameGuideAssets, "Pi2IdFrameGuideAssets");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, Pi2IdFrameGuideAssets);
            resourceId = typedArrayObtainStyledAttributes.getResourceId(com.withpersona.sdk2.inquiry.resources.R$styleable.Pi2IdFrameGuideAssets_pi2HintLottieRaw, resourceId);
            resourceId2 = typedArrayObtainStyledAttributes.getResourceId(com.withpersona.sdk2.inquiry.resources.R$styleable.Pi2IdFrameGuideAssets_pi2OverlayDrawable, resourceId2);
            typedArrayObtainStyledAttributes.recycle();
        }
        return new OverlayAssets(resourceId, resourceId2);
    }

    public static final GradientDrawable createIdFrameWithAttributes(Context context, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "<this>");
        float dimension = context.getResources().getDimension(com.withpersona.sdk2.inquiry.resources.R$dimen.pi2_overlay_corner_radius);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.withpersona.sdk2.inquiry.resources.R$dimen.pi2_overlay_stroke_width);
        int color = ContextCompat.getColor(context, R$color.pi2_overlay_stroke_color);
        Integer numResourceIdFromAttr$default = ResTools.resourceIdFromAttr$default(context, i, null, false, 6, null);
        if (numResourceIdFromAttr$default != null) {
            int iIntValue = numResourceIdFromAttr$default.intValue();
            int[] Pi2IdFrame = com.withpersona.sdk2.inquiry.resources.R$styleable.Pi2IdFrame;
            Intrinsics.checkNotNullExpressionValue(Pi2IdFrame, "Pi2IdFrame");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, Pi2IdFrame);
            dimension = typedArrayObtainStyledAttributes.getDimension(com.withpersona.sdk2.inquiry.resources.R$styleable.Pi2IdFrame_pi2CornerRadius, dimension);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.withpersona.sdk2.inquiry.resources.R$styleable.Pi2IdFrame_pi2StrokeWidth, dimensionPixelSize);
            color = typedArrayObtainStyledAttributes.getColor(com.withpersona.sdk2.inquiry.resources.R$styleable.Pi2IdFrame_pi2StrokeColor, color);
            typedArrayObtainStyledAttributes.recycle();
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setStroke(dimensionPixelSize, color);
        return gradientDrawable;
    }
}
