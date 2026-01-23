package com.withpersona.sdk2.inquiry.steps.p423ui.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles2;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.ResTools2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StepStyleUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"backgroundImageDrawable", "Landroid/graphics/drawable/Drawable;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "context", "Landroid/content/Context;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.utils.StepStyleUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class StepStyleUtils {
    public static final Drawable backgroundImageDrawable(StepStyles2 stepStyles2, Context context) {
        Integer numResourceIdFromName;
        Intrinsics.checkNotNullParameter(stepStyles2, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String backgroundImageName = stepStyles2.getBackgroundImageName();
        if (backgroundImageName == null || (numResourceIdFromName = ResTools.resourceIdFromName(context, backgroundImageName, ResTools2.Drawable)) == null) {
            return null;
        }
        return ContextCompat.getDrawable(context, numResourceIdFromName.intValue());
    }
}
