package com.robinhood.android.odyssey.lib.compose.utils;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.unit.C2002Dp;
import com.robinhood.models.api.serverdrivenui.component.ApiSdFlexibleComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ApiSdFlexibleComponentUtils.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toCompose", "Landroidx/compose/foundation/layout/PaddingValues;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdFlexibleComponent$Insets;", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.odyssey.lib.compose.utils.ApiSdFlexibleComponentUtilsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class ApiSdFlexibleComponentUtils {
    public static final PaddingValues toCompose(ApiSdFlexibleComponent.Insets insets) {
        Intrinsics.checkNotNullParameter(insets, "<this>");
        return PaddingKt.m5138PaddingValuesa9UjIt4(C2002Dp.m7995constructorimpl(insets.getStart()), C2002Dp.m7995constructorimpl(insets.getTop()), C2002Dp.m7995constructorimpl(insets.getEnd()), C2002Dp.m7995constructorimpl(insets.getBottom()));
    }
}
