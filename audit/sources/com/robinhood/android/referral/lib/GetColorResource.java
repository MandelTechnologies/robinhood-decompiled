package com.robinhood.android.referral.lib;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetColorResource.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"getColorResource", "", "Lcom/robinhood/android/libdesignsystem/serverui/ServerToBentoColorMapper;", "context", "Landroid/content/Context;", ResourceTypes.COLOR, "Lcom/robinhood/models/serverdriven/experimental/api/Color;", "(Lcom/robinhood/android/libdesignsystem/serverui/ServerToBentoColorMapper;Landroid/content/Context;Lcom/robinhood/models/serverdriven/experimental/api/Color;)Ljava/lang/Integer;", "feature-lib-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.lib.GetColorResourceKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class GetColorResource {
    public static final Integer getColorResource(ServerToBentoColorMapper serverToBentoColorMapper, Context context, Color color) {
        Intrinsics.checkNotNullParameter(serverToBentoColorMapper, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(color, "color");
        ResourceReferences4<Integer> resourceReferences4MapSimpleServerColor = serverToBentoColorMapper.mapSimpleServerColor(color.getServerValue());
        if (resourceReferences4MapSimpleServerColor == null) {
            return null;
        }
        Resources.Theme theme = context.getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        return resourceReferences4MapSimpleServerColor.resolve(theme);
    }
}
