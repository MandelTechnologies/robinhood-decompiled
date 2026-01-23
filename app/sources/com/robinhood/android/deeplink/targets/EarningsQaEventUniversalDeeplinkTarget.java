package com.robinhood.android.deeplink.targets;

import android.content.Intent;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.rosetta.eventlogging.ShareholderQAContext;
import com.robinhood.utils.extensions.StringsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Targets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/EarningsQaEventUniversalDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class EarningsQaEventUniversalDeeplinkTarget extends DeeplinkTarget4 {
    public static final EarningsQaEventUniversalDeeplinkTarget INSTANCE = new EarningsQaEventUniversalDeeplinkTarget();
    public static final int $stable = 8;

    private EarningsQaEventUniversalDeeplinkTarget() {
        super(DeepLinkPath.EARNINGS_QA_EVENT_UNIVERSAL.getPath(), false, true, false, false, false, null, 114, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        List<String> pathSegments = deeplinkContext.getUri().getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        String str = (String) CollectionsKt.getOrNull(pathSegments, 1);
        List<String> pathSegments2 = deeplinkContext.getUri().getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments2, "getPathSegments(...)");
        String str2 = (String) CollectionsKt.getOrNull(pathSegments2, 3);
        String queryParameter = deeplinkContext.getUri().getQueryParameter("question_id");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("say_reference_id");
        if (str != null && str2 != null) {
            return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new LegacyFragmentKey.EquityInstrumentDetail(str, InstrumentDetailSource.DEEPLINK_EARNINGS_QA, (String) null, 4, (DefaultConstructorMarker) null), false, false, false, null, false, false, false, false, false, null, false, 8188, null), Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new LegacyFragmentKey.ShareholderEventQuestionList(str2, null, str, queryParameter != null ? StringsKt.toUuid(queryParameter) : null, queryParameter2, ShareholderQAContext.EntryPoint.SHARE, 2, null), false, false, false, null, false, true, false, false, false, null, false, 8052, null)};
        }
        return new Intent[]{deeplinkContext.getMainIntent()};
    }
}
