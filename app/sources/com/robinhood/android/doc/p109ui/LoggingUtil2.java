package com.robinhood.android.doc.p109ui;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.models.api.identi.ApiDocumentRequest;
import com.robinhood.models.p320db.KaizenExperiment;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.models.p355ui.identi.DocumentRequestSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LoggingUtil.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a \u0010\u0004\u001a\u00020\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\t\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003¨\u0006\n"}, m3636d2 = {"getLoggingTag", "", "", "Lcom/robinhood/models/ui/DocumentRequest;", "logPersonaClientStatus", "", "Lcom/robinhood/analytics/AnalyticsLogger;", "docRequests", "status", "Lcom/robinhood/android/doc/ui/PersonaClientLogStatus;", "feature-doc-upload_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.doc.ui.LoggingUtilKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class LoggingUtil2 {

    /* compiled from: LoggingUtil.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.LoggingUtilKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentRequestSource.values().length];
            try {
                iArr[DocumentRequestSource.ONBOARDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentRequestSource.UAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DocumentRequestSource.OTHER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getLoggingTag(List<DocumentRequest> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: com.robinhood.android.doc.ui.LoggingUtilKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LoggingUtil2.getLoggingTag$lambda$0((DocumentRequest) obj);
            }
        }, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getLoggingTag$lambda$0(DocumentRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getType().getServerValue();
    }

    public static final void logPersonaClientStatus(AnalyticsLogger analyticsLogger, List<DocumentRequest> docRequests, PersonaClientLogStatus status) {
        LoggingUtil loggingUtil;
        String str;
        Intrinsics.checkNotNullParameter(analyticsLogger, "<this>");
        Intrinsics.checkNotNullParameter(docRequests, "docRequests");
        Intrinsics.checkNotNullParameter(status, "status");
        List<DocumentRequest> list = docRequests;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DocumentRequest) it.next()).getType());
        }
        ApiDocumentRequest.Type type2 = ApiDocumentRequest.Type.PHOTO_ID;
        ApiDocumentRequest.Type type3 = ApiDocumentRequest.Type.THREE_POINT_SELFIE;
        if (Intrinsics.areEqual(arrayList, CollectionsKt.listOf((Object[]) new ApiDocumentRequest.Type[]{type2, type3}))) {
            loggingUtil = LoggingUtil.GOV_ID_SELFIE;
        } else if (Intrinsics.areEqual(arrayList, CollectionsKt.listOf(type2))) {
            loggingUtil = LoggingUtil.GOV_ID;
        } else {
            loggingUtil = Intrinsics.areEqual(arrayList, CollectionsKt.listOf(type3)) ? LoggingUtil.SELFIE : LoggingUtil.OTHER;
        }
        if (loggingUtil == LoggingUtil.OTHER) {
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[UtilKt.source(docRequests).ordinal()];
        if (i == 1) {
            str = "doc_upload_onboarding_";
        } else if (i == 2) {
            str = "doc_upload_uarv2_";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "doc_upload_";
        }
        analyticsLogger.logUserAction(str + loggingUtil.getLog(), status.getLog(), null, UtilKt.isInPersonaClient(docRequests) ? KaizenExperiment.VARIATION_MEMBER : KaizenExperiment.VARIATION_CONTROL);
    }

    public static final String getLoggingTag(DocumentRequest documentRequest) {
        Intrinsics.checkNotNullParameter(documentRequest, "<this>");
        return documentRequest.getType().getServerValue();
    }
}
