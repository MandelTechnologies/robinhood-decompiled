package com.robinhood.android.crypto.gifting.details.utils;

import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.StandardRow;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RdsDataRowExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0000¨\u0006\b"}, m3636d2 = {"bindStandardRow", "", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "row", "Lcom/robinhood/models/serverdriven/db/StandardRow;", "onClick", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "feature-crypto-gifting_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.gifting.details.utils.RdsDataRowExtensionsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RdsDataRowExtensions {
    public static final void bindStandardRow(RdsDataRowView rdsDataRowView, StandardRow row, final Function1<? super GenericAction, Unit> onClick) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(rdsDataRowView, "<this>");
        Intrinsics.checkNotNullParameter(row, "row");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        rdsDataRowView.setLabelText(row.getLabel());
        rdsDataRowView.setValueText(row.getValue());
        ServerToBentoAssetMapper2 annotatedIcon = row.getAnnotatedIcon();
        Drawable drawable2 = null;
        Integer numValueOf = annotatedIcon != null ? Integer.valueOf(annotatedIcon.getResourceId()) : null;
        if (numValueOf != null && (drawable = ContextCompat.getDrawable(rdsDataRowView.getContext(), numValueOf.intValue())) != null) {
            drawable.setTint(ContextCompat.getColor(rdsDataRowView.getContext(), C20690R.color.mobius_crypto_foreground_2));
            drawable2 = drawable;
        }
        rdsDataRowView.setLabelIconDrawable(drawable2);
        final GenericAction annotatedAction = row.getAnnotatedAction();
        if (annotatedAction != null) {
            OnClickListeners.onClick(rdsDataRowView, new Function0() { // from class: com.robinhood.android.crypto.gifting.details.utils.RdsDataRowExtensionsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RdsDataRowExtensions.bindStandardRow$lambda$2$lambda$1(onClick, annotatedAction);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindStandardRow$lambda$2$lambda$1(Function1 function1, GenericAction genericAction) {
        function1.invoke(genericAction);
        return Unit.INSTANCE;
    }
}
