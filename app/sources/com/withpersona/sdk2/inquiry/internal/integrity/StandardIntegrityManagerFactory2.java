package com.withpersona.sdk2.inquiry.internal.integrity;

import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StandardIntegrityManagerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/integrity/RealStandardIntegrityManagerFactory;", "Lcom/withpersona/sdk2/inquiry/internal/integrity/StandardIntegrityManagerFactory;", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/google/android/play/core/integrity/StandardIntegrityManager;", "context", "Landroid/content/Context;", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.internal.integrity.RealStandardIntegrityManagerFactory, reason: use source file name */
/* loaded from: classes18.dex */
public final class StandardIntegrityManagerFactory2 implements StandardIntegrityManagerFactory {
    @Override // com.withpersona.sdk2.inquiry.internal.integrity.StandardIntegrityManagerFactory
    public StandardIntegrityManager create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StandardIntegrityManager standardIntegrityManagerCreateStandard = IntegrityManagerFactory.createStandard(context);
        Intrinsics.checkNotNullExpressionValue(standardIntegrityManagerCreateStandard, "createStandard(...)");
        return standardIntegrityManagerCreateStandard;
    }
}
