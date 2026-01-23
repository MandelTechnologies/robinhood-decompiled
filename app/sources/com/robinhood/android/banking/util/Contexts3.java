package com.robinhood.android.banking.util;

import android.app.Activity;
import com.robinhood.android.ach.contracts.AchRelationshipDocumentRequestSource;
import com.robinhood.android.ach.contracts.AchRelationshipDocumentVerification;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Contexts.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"startAchRelationshipDocumentRequest", "", "Lcom/robinhood/android/common/ui/BaseActivity;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "documentRequestType", "Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;", "documentRequestSource", "Lcom/robinhood/android/ach/contracts/AchRelationshipDocumentRequestSource;", "requestCode", "", "colorTheme", "Lcom/robinhood/models/api/ColorTheme;", "(Lcom/robinhood/android/common/ui/BaseActivity;Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/models/api/identi/ApiDocumentRequest$Type;Lcom/robinhood/android/ach/contracts/AchRelationshipDocumentRequestSource;Ljava/lang/Integer;Lcom/robinhood/models/api/ColorTheme;)V", "feature-lib-banking_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.banking.util.ContextsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Contexts3 {
    @JvmOverloads
    public static final void startAchRelationshipDocumentRequest(BaseActivity baseActivity, AchRelationship achRelationship, ApiDocumentRequest.Type documentRequestType, AchRelationshipDocumentRequestSource documentRequestSource, ColorTheme colorTheme) {
        Intrinsics.checkNotNullParameter(baseActivity, "<this>");
        Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
        Intrinsics.checkNotNullParameter(documentRequestType, "documentRequestType");
        Intrinsics.checkNotNullParameter(documentRequestSource, "documentRequestSource");
        Intrinsics.checkNotNullParameter(colorTheme, "colorTheme");
        startAchRelationshipDocumentRequest$default(baseActivity, achRelationship, documentRequestType, documentRequestSource, null, colorTheme, 8, null);
    }

    public static /* synthetic */ void startAchRelationshipDocumentRequest$default(BaseActivity baseActivity, AchRelationship achRelationship, ApiDocumentRequest.Type type2, AchRelationshipDocumentRequestSource achRelationshipDocumentRequestSource, Integer num, ColorTheme colorTheme, int i, Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        startAchRelationshipDocumentRequest(baseActivity, achRelationship, type2, achRelationshipDocumentRequestSource, num, colorTheme);
    }

    @JvmOverloads
    public static final void startAchRelationshipDocumentRequest(BaseActivity baseActivity, AchRelationship achRelationship, ApiDocumentRequest.Type documentRequestType, AchRelationshipDocumentRequestSource documentRequestSource, Integer num, ColorTheme colorTheme) {
        Intrinsics.checkNotNullParameter(baseActivity, "<this>");
        Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
        Intrinsics.checkNotNullParameter(documentRequestType, "documentRequestType");
        Intrinsics.checkNotNullParameter(documentRequestSource, "documentRequestSource");
        Intrinsics.checkNotNullParameter(colorTheme, "colorTheme");
        if (achRelationship.getState() != ApiAchRelationship.State.NEEDS_APPROVAL) {
            throw new IllegalStateException("Check failed.");
        }
        UUID documentRequestId = achRelationship.getDocumentRequestId();
        Intrinsics.checkNotNull(documentRequestId);
        AchRelationshipDocumentVerification achRelationshipDocumentVerification = new AchRelationshipDocumentVerification(documentRequestId, documentRequestType, documentRequestSource, false, colorTheme, 8, null);
        if (num != null) {
            Navigator.DefaultImpls.startActivityForResult$default(baseActivity.getNavigator(), (Activity) baseActivity, (IntentKey) achRelationshipDocumentVerification, num.intValue(), (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
        } else {
            Navigator.DefaultImpls.startActivity$default(baseActivity.getNavigator(), baseActivity, achRelationshipDocumentVerification, null, false, null, null, 60, null);
        }
    }
}
